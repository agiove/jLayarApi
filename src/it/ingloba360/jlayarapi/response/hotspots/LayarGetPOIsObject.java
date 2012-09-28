/* ===========================================================
 * jLayarApi: a Java wrapper for Layar API
 * ===========================================================
 * 
 * (C) Copyright 2012 by Ingloba360
 * 
 * Project Info:  https://github.com/agiove/jLayarApi/
 * 
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation;
 * either version 3 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with this
 * library. If not, see <http://www.gnu.org/licenses/>.
 * 
 * ------------------
 * LayarGetPOIsObject.java
 * ------------------
 * (C) Copyright 2012 by Ingloba360
 * 
 * Original Author: Angelo Giove (angelo.giove AT ingloba360.it)
 */
package it.ingloba360.jlayarapi.response.hotspots;

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
