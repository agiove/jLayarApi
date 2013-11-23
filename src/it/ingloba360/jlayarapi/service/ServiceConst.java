package it.ingloba360.jlayarapi.service;

import java.util.HashMap;
import java.util.Map;

public class ServiceConst {

	public static final Map<String,Integer> LAYAR_VERSIONS = new HashMap<String, Integer>();
	static{
		int i = 0;
		LAYAR_VERSIONS.put("2", 	i++);
		LAYAR_VERSIONS.put("2.1", 	i++);
		LAYAR_VERSIONS.put("ip2.0", i++);
		LAYAR_VERSIONS.put("2.2", 	i++);
		LAYAR_VERSIONS.put("ip2.1", i++);
		LAYAR_VERSIONS.put("2.2.1", i++);
		LAYAR_VERSIONS.put("2.2.2", i++);
		LAYAR_VERSIONS.put("3.0", 	i++);
		LAYAR_VERSIONS.put("ip3.0", i++);
		LAYAR_VERSIONS.put("3.1", 	i++);
		LAYAR_VERSIONS.put("3.5", 	i++);
		LAYAR_VERSIONS.put("3.6", 	i++);
		LAYAR_VERSIONS.put("4.0", 	i++);
		LAYAR_VERSIONS.put("5.0", 	i++);
		LAYAR_VERSIONS.put("6.0", 	i++);
		LAYAR_VERSIONS.put("7.0", 	i++);
	}
}
