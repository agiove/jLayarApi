package it.ingloba360.jlayarapi;

import it.ingloba360.jlayarapi.annotations.LayarApiCategory;
import it.ingloba360.jlayarapi.annotations.LayarApiVersion;
import it.ingloba360.jlayarapi.annotations.LayarRequiredOne;

public class LayarGetPOIsAnchor {

	/**
	 * The image key of the reference image uploaded to the publishing site.
	 */
	@LayarRequiredOne
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.anchor")	
	public String referenceImage;
	
	/**
	 * The geo location coordinates of a POI, alt is optional but lat and lon are mandatory.
	 */
	@LayarRequiredOne
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.anchor")	
	public LayarGetPOIsGeolocation geolocation;
}
