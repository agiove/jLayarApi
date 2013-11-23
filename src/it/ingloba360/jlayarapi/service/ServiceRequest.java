package it.ingloba360.jlayarapi.service;

import java.lang.reflect.Field;

import it.ingloba360.jlayarapi.LayarGetPOIsRequest;
import it.ingloba360.jlayarapi.annotations.LayarApiVersion;
import it.ingloba360.jlayarapi.annotations.LayarDefaultValue;
import it.ingloba360.jlayarapi.annotations.LayarRequired;
import it.ingloba360.jlayarapi.service.exc.MalformedLayarRequestException;

public class ServiceRequest {

	private java.util.Map<java.lang.String,java.lang.String[]> headers;
	private java.util.Map<java.lang.String,java.lang.String[]> parameters;
	
	private LayarGetPOIsRequest layarRequest;
	
	public ServiceRequest(
			java.util.Map<java.lang.String, java.lang.String[]> headers,
			java.util.Map<java.lang.String, java.lang.String[]> parameters)
					throws IllegalArgumentException, IllegalAccessException,MalformedLayarRequestException {
		this.headers = headers;
		this.parameters = parameters;

		layarRequest = new LayarGetPOIsRequest();

		compileHeaders();
		compileParameters();

		// set deafults values if not set
		setDefaultValues();

		// test if everything is ok
		testValues();
	}
	
	public LayarGetPOIsRequest getLayarRequest () {
		return this.layarRequest;
	}
	
	private void compileHeaders() {
		
	}
	
	private void compileParameters() throws IllegalArgumentException, IllegalAccessException, MalformedLayarRequestException {
		Field[] fields = LayarGetPOIsRequest.class.getFields();
		for (Field f : fields) {
			String fName = f.getName();
			Class fClass = f.getType();
			if(parameters.containsKey(fName)) {
				String[] ss = parameters.get(fName);
				Object v = ss[0];
				try {
					if (fClass == Integer.class) {
						v = Integer.parseInt((String)v);
					} else if (fClass == Long.class) {
						v = Long.parseLong((String)v);
					} else if (fClass == Double.class) {
						v = Double.parseDouble((String)v);
					}
				} catch (NumberFormatException exc) {
					throw new MalformedLayarRequestException(fName +"("+v+") is not a valid " + fClass);
				}
				f.set(layarRequest, v);
			}
		}
	}
	
	private void setDefaultValues() throws IllegalArgumentException, IllegalAccessException {
		Field[] fields = LayarGetPOIsRequest.class.getFields();
		for (Field f : fields) {
			LayarDefaultValue ldef = f.getAnnotation(LayarDefaultValue.class);
			if(ldef != null && f.get(layarRequest)==null) {
				f.set(layarRequest, ldef.value());
			}
		}
	}
	
	private void testValues() throws IllegalArgumentException, IllegalAccessException, MalformedLayarRequestException {
		if(layarRequest.version == null)
			throw new MalformedLayarRequestException("version is mandatory field!");
		if(!ServiceConst.LAYAR_VERSIONS.containsKey(layarRequest.version))
			throw new MalformedLayarRequestException("invalid version value("+layarRequest.version+")");
			
		Field[] fields = LayarGetPOIsRequest.class.getFields();
		for (Field f : fields) {
			String fName = f.getName();
			LayarRequired lreq = f.getAnnotation(LayarRequired.class);
			LayarApiVersion lver = f.getAnnotation(LayarApiVersion.class);
			
			if(lver!=null && ServiceConst.LAYAR_VERSIONS.get(lver.value())>ServiceConst.LAYAR_VERSIONS.get(layarRequest.version))
				continue;
			
			if(lreq != null && f.get(layarRequest)==null) {
				throw new MalformedLayarRequestException(fName + " is mandatory field!");
			}
		}
	}
}
