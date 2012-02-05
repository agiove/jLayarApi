package it.ingloba360.jlayarapi;

import it.ingloba360.jlayarapi.annotations.LayarApiCategory;
import it.ingloba360.jlayarapi.annotations.LayarApiVersion;

// TODO: completare!!!
public class LayarGetPOIsTransform {

	/**
	 * Rotates the 2D/3D object over the given axis in its own local coordinate system.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.transform")
	public LayarGetPOIsTransformRotate rotate;
	
	/**
	 * Translate the POI to another location from its anchor point.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.transform")
	public LayarGetPOIsTransformTranslate translate;
	
	/**
	 * The multiplication factor to scale the 2D or 3D object.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.transform")
	public Double scale = 1.0;
}
