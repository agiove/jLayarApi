package it.ingloba360.jlayarapi;

import it.ingloba360.jlayarapi.annotations.LayarApiCategory;
import it.ingloba360.jlayarapi.annotations.LayarApiVersion;
import it.ingloba360.jlayarapi.annotations.LayarRequired;

public class LayarGetPOIsObject {

	/**
	 * This determines whether a POI should be represented by a 2D image or a 3D model. The available options are:

    image/vnd.layar.generic for any supported image type (PNG, GIF, JPEG);
    model/vnd.layar.l3d for 3D models;
    image/jpeg, image/gif, image/png for images. 
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.object")
	public String contentType;
	
	/**
	 * The URL of the object to be displayed.
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.object")
	public String url;
	
	/**
	 * This is used to specify the size of the object. For 2D images, this determines the size at which the object will be rendered. 
	 * For 3D models, this is a cue to the client whether to select the full model or the reduced model (if there is a reduced model) to download. 
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.object")
	public Double size;
	
	/**
	 * This defines a smaller version to be rendered when the POI is further away from the user. 
	 * Specifying this can improve performance when there are many POIs on the screen. 
	 * NOTE: Do not put the same URL here as for object.url, it will not have any functional effect and only consume bandwidth. 
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.object")
	public String reducedURL;
}
