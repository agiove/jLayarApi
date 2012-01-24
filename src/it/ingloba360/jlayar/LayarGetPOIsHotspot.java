package it.ingloba360.jlayar;

import java.io.Serializable;
import java.util.List;

import models.LayarPOI;

public class LayarGetPOIsHotspot implements Serializable {

	/**
	 * A unique id for the POI within the layer, this is used to track the POI's
	 * when refreshing the list.
	 */
	public String id;

	/**
	 * The distance of the POI to the current location
	 */
	public Double distance = 0.0;

	/**
	 * The first line in the BIW, larger font, underlined, using titleColor.
	 */
	public String title;

	/**
	 * The type of POI, from which the client determines which CIW to use if
	 * custom CIWs are defined. 0 = default CIW. 1-3 = use the custom CIW icons
	 * specified in the layer definition (custom_ciws).
	 * 
	 * Since v3: you can define more than 3 custom CIW icons.
	 */
	public Integer type = 0;

	/**
	 * The integer value of the latitude for the POI: divide by 10^6 to get the
	 * decimal GPS coordinate value. Can be negative.
	 */
	public Integer lat;

	/**
	 * The integer value of the longitude for the POI: divide by 10^6 to get the
	 * decimal GPS coordinate value. Can be negative.
	 */
	public Integer lon;

	/* -------------------------------------- */
	/* BIW information */
	/* -------------------------------------- */

	/**
	 * The location of the image to be displayed inside the BIW. If the image is
	 * too large, it will be resized to fit within a bounding box of 100x75
	 * pixels, preserving aspect ratio. Pass null if empty.
	 * 
	 * NOTE: the image file size should be smaller than 100kb, otherwise, the
	 * image will not be loaded.
	 */
	public String imageURL;

	/**
	 * The fourth line in the BIW, normal font using textColor.
	 */
	public String line4;

	/**
	 * The third line in the BIW, normal font using textColor.
	 */
	public String line3;

	/**
	 * The second line in the BIW, normal font using textColor.
	 */
	public String line2;

	/**
	 * The last line in the BIW, small font using textColor
	 */
	public String attribution;

	/* ----------------------- */
	/* hotspots representation */
	/* ----------------------- */

	/**
	 * 1: 1d - usual POI (icons). Default value (if no value is supplied, the
	 * usual 1d POI is assumed) 2: 2d - image used for POI 3: 3d - 3d object
	 * used for POI
	 */
	public Integer dimension = 1;

	/**
	 * Mandatory if dimension is 2 or 3. Determines the location of the
	 * representations of the object (files to download)
	 * 
	 * NOTE: For 2d images, the image file size should be smaller than 100Kb.
	 * For 3d objects, the file size should be smaller than 1Mb.
	 */
	public LayarHotspotObject object;

	/**
	 * Mandatory if dimension is 2 or 3. Determines how to place the object in
	 * space.
	 */
	public LayarHotspotTransform transform;

	/* ----------------------- */
	/* Altitude info */
	/* ----------------------- */

	/**
	 * Real altitude of object in meters. If this is missing, the same altitude
	 * as the user is assumed.
	 * 
	 * NOTE: This parameter will be used only when the "alt" of the user is
	 * passed through in the getPOIs request. Otherwise, the value will be
	 * ignored.
	 */
	public Integer alt;

	/**
	 * Altitude in meters of the object with respect to the user's altitude.
	 * 
	 * NOTE: Not used if 'alt' is supplied and the user's altitude is known.
	 */
	public Integer relativeAlt;

	/* ----------------------- */
	/* layar stream options */
	/* ----------------------- */

	/**
	 * A value of True indicates to the client that this particular POI should
	 * be locked directly when the POIs are shown. Only one POI can have this
	 * flag set to true in the POI response. If more than one POI has this value
	 * set to True, the client will pick one (no guarantee which). By default,
	 * it is false.
	 */
	public boolean inFocus = false;

	/**
	 * Set this value to true if your layer is being indexed by Layar Stream but
	 * wish to exclude this particular POI from being indexed. This is for
	 * example useful in a game, where you don't want your clues to be indexed
	 * and would include only the starting point of the game in Layar Stream. By
	 * default, it is false.
	 */
	public boolean doNotIndex = false;

	/* ----------------------- */
	/* BIW control */
	/* ----------------------- */

	/**
	 * This tells the client whether or not a small BIW (the one at the bottom
	 * of the screen) should be shown when the POI is in focus. Default value is
	 * true.
	 */
	public boolean showSmallBiw = true;

	/**
	 * This tells the client whether or not a detailled BIW (the big one in the
	 * middle of the screen) should be shown when the user clicks on the POI or
	 * on the small BIW. If the value is false, the first action from the list
	 * of actions will be fired instead.
	 * 
	 * Note: If false means there is no way for the user to manually access the
	 * actions. The first one is triggered by a user click, one other action can
	 * be used with autoTrigger to activate it. More than 2 actions won't be
	 * used.
	 * 
	 * Default value is true.
	 */
	public boolean showBiwOnClick = true;

	/**
	 * A list of URIs that can be invoked when the user clicks on the BIW. The
	 * various actions are displayed as a list of buttons in an overlay sheet.
	 * 
	 * NOTE return empty array if not used.
	 */
	public List<LayarActionResponse> actions;

	public void compileFrom(LayarPOI p) {
		this.id = String.valueOf(p.id);
		this.attribution = p.attribution;
		this.title = p.title;
		this.lat = (int) (p.lat * 1000000);
		this.lon = (int) (p.lon * 1000000);
		this.imageURL = p.imageURL;
		this.line4 = p.line4;
		this.line3 = p.line3;
		this.line2 = p.line2;
		this.type = p.type != null ? p.type : 0;
		this.dimension = p.dimension != null ? p.dimension : 1;
		this.alt = p.alt;
		this.relativeAlt = p.relativeAlt;
		this.distance = p.distance;
		this.inFocus = p.inFocus != null && p.inFocus == 1 ? true : false;
		this.doNotIndex = p.doNotIndex != null && p.doNotIndex == 1 ? true
				: false;
		this.showSmallBiw = p.showSmallBiw != null && p.showSmallBiw == 0 ? false
				: true;
		this.showBiwOnClick = p.showBiwOnClick != null && p.showBiwOnClick == 0 ? false
				: true;
	}
}
