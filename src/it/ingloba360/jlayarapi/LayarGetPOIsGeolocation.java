package it.ingloba360.jlayarapi;

import it.ingloba360.jlayarapi.annotations.LayarApiVersion;
import it.ingloba360.jlayarapi.annotations.LayarRequired;

public class LayarGetPOIsGeolocation {

	/**
	 * The decimal GPS coordinate value of the latitude for the POI. 
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	public Double lat;
	
	/**
	 * The decimal GPS coordinate value of the longitude for the POI. 
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	public Double lon;

	/**
	 * The decimal GPS coordinate value of the altitude for the POI. 	
	 */
	@LayarApiVersion("2.1")
	public Double alt;
	
}
