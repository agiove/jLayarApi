package it.ingloba360.jlayarapi;

import it.ingloba360.jlayarapi.annotations.LayarApiCategory;
import it.ingloba360.jlayarapi.annotations.LayarApiVersion;
import it.ingloba360.jlayarapi.annotations.LayarDefaultValue;

public class LayarGetPOIsIcon {

	/**
	 * Each POI can be represented by an image defined in this url. 
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.icon")
	public String url;
	
	/**
	 * On the publishing site, CIW icon set can be defined under the "Look & feel" tab. Each CIW icon set will have a type value. 
	 * In the JSON response, you can fill in the right type value to determine which CIW icon set should be used to represent a POI.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.icon")
	@LayarDefaultValue("0")
	public Integer type = 0;
}
