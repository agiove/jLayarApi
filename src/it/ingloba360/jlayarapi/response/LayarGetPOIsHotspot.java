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
 * LayarGetPOIsHotspot.java
 * ------------------
 * (C) Copyright 2012 by Ingloba360
 * 
 * Original Author: Angelo Giove (angelo.giove AT ingloba360.it)
 */
package it.ingloba360.jlayarapi.response;

import it.ingloba360.jlayarapi.annotations.LayarApiCategory;
import it.ingloba360.jlayarapi.annotations.LayarApiVersion;
import it.ingloba360.jlayarapi.annotations.LayarDefaultValue;
import it.ingloba360.jlayarapi.annotations.LayarMaxDim;
import it.ingloba360.jlayarapi.annotations.LayarRequired;
import it.ingloba360.jlayarapi.response.hotspots.LayarGetPOIsAnchor;
import it.ingloba360.jlayarapi.response.hotspots.LayarGetPOIsIcon;
import it.ingloba360.jlayarapi.response.hotspots.LayarGetPOIsObject;
import it.ingloba360.jlayarapi.response.hotspots.LayarGetPOIsText;
import it.ingloba360.jlayarapi.response.hotspots.LayarGetPOIsTransform;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// TODO: completare in base al doc!!!
public class LayarGetPOIsHotspot implements Serializable {

	private static final long serialVersionUID = -8289790571446325328L;

	/**
	 * A unique id for the POI within the layer, this is used to track the POI's
	 * when refreshing the list.
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots")	
	public String id;

	/**
	 * Placement of the POI. Can either be a geolocation or the key of a reference image in Layar Vision. 
	 * For geolocation, alt is optional but lat and lon are mandatory.
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots")	
	public LayarGetPOIsAnchor anchor;

	/**
	 * In Layar client, each POI has a brief information widget (BIW) which can be used to provide some text to describe the POI. 
	 * It contains three parameters, title, description and footnote.
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots")
	public LayarGetPOIsText text;
	
	/**
	 * This enables actions on the POI level. Each POI can have its own actions. 
	 * They will appear on the expanded BIW dialog.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots")
	public List<LayarGetPOIsAction> actions = new ArrayList<LayarGetPOIsAction>();
	
	/**
	 * The location of the image to be displayed inside the BIW. 
	 * If the image is too large, it will be resized to fit within a bounding box of 100x75 pixels, preserving aspect ratio. 
	 * NOTE: the image file size should be smaller than 100kb, otherwise, the image will not be loaded.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots")
	@LayarMaxDim("100kb")
	public String imageURL;
	
	/**
	 * This tells the layar client whether or not a small BIW (the one at the bottom of the screen) 
	 * should be shown when the POI is in focus. 
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots")
	@LayarDefaultValue("true")
	public Boolean showSmallBiw = true;
	
	/**
	 * This tells the client whether or not a detailed BIW (the big one in the middle of the screen) 
	 * should be shown when the user clicks on the POI or on the small BIW. 
	 * If the value is false, the first action from the list of actions will be fired instead. 
	 * NOTE: This means there is no way for the user to manually access the actions. 
	 * The first one is triggered by a user click, one other action can be activated by using autoTrigger settings. 
	 * More than 2 actions won't be used.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots")
	@LayarDefaultValue("true")
	public Boolean showBiwOnClick = true;
	
	/**
	 * This tells the client which BIW style should be used, classic or collapsed. 
	 * "classic" style displays the entire "text" object when a POI is in focus while "collapsed" style 
	 * only shows the text.title parameter. 
	 * This POI level "biwStyle" will overrule the "biwStyle" defined on the layer level.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots")
	@LayarDefaultValue("classic|collapsed")
	public String biwStyle = "classic";
	
	/**
	 * A POI can be represented by an icon defined in the "url" parameter below or a set of CIW (Custom POI Indicator Widget) 
	 * icons defined on the publishing site. If a few POIs serve the same kind of purpose and can be represented by the same icon set, 
	 * it is recommended to use the CIW icon sets. 
	 * You can check here to learn more on how Layar client renders POIs in the Camera view.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots")
	public LayarGetPOIsIcon icon;
	
	/**
	 * A POI can be represented by a 2D image or a 3D model in the Camera view. 
	 * These objects will be rendered realistically as if they are placed in the real world. 
	 * For more information on how layar client renders objects in the camera view, please read here.  
	 * NOTE: For 2d images, the image file size should be smaller than 100Kb. 
	 * For 3d objects, the file size should be smaller than 1Mb.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots")
	public LayarGetPOIsObject object;
	
	/**
	 * 	A few factors can be used to transform the 2D and 3D objects in the Camera view, for instance scale, rotation and translate. 
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots")
	public LayarGetPOIsTransform transform;
	
	public Boolean inFocus = false;
	public Boolean doNotIndex = false;
	public List<LayarGetPOIsAnimation> animations = new ArrayList<LayarGetPOIsAnimation>();
}
