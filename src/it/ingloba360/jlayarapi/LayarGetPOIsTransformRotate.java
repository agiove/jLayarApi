package it.ingloba360.jlayarapi;

import it.ingloba360.jlayarapi.annotations.LayarApiCategory;
import it.ingloba360.jlayarapi.annotations.LayarApiVersion;
import it.ingloba360.jlayarapi.annotations.LayarDefaultValue;

public class LayarGetPOIsTransformRotate {

	/**
	 * Means the rotation is relative to the user around z-axis. 
	 * On layar client, "axis" and "angle" are applied after "rel" has been applied. 
	 * If "rel" is set to true, the Geo-location or Vision enabled POI will rotate over the Z-axis to face the user first, 
	 * then it will rotate around the defined "axis" with a certain degrees defined in "angle" parameter. 
	 * From then on, the rotation is relative to the user around z-axis.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.transform.rotate")
	@LayarDefaultValue("false")
	public Boolean rel = false;
	
	public LayarGetPOIsAxis axis;
	
	public Double angle = 0.0;
}
