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
 * LayarGetPOIsResponse.java
 * ------------------
 * (C) Copyright 2012 by Ingloba360
 * 
 * Original Author: Angelo Giove (angelo.giove AT ingloba360.it)
 */
package it.ingloba360.jlayarapi;

import it.ingloba360.jlayarapi.annotations.LayarApiCategory;
import it.ingloba360.jlayarapi.annotations.LayarApiDeprecated;
import it.ingloba360.jlayarapi.annotations.LayarApiVersion;
import it.ingloba360.jlayarapi.annotations.LayarDefaultValue;
import it.ingloba360.jlayarapi.annotations.LayarRequired;
import it.ingloba360.jlayarapi.response.LayarGetPOIsAction;
import it.ingloba360.jlayarapi.response.LayarGetPOIsAnimation;
import it.ingloba360.jlayarapi.response.LayarGetPOIsDialog;
import it.ingloba360.jlayarapi.response.LayarGetPOIsHotspot;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LayarGetPOIsResponse implements Serializable {

	private static final long serialVersionUID = -1249190387988588629L;

	/**
	 * The name of the layer for which the POI's are returned
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("root")	
	public String layer;
	
	/**
	 * The list of POIs for the current location and layer.
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("root")	
	public List<LayarGetPOIsHotspot> hotspots = new ArrayList<LayarGetPOIsHotspot>();
	
	/**
	 * This enables actions on the entire layer, which will be placed in the menu 
	 * (an extra "Actions" button will be shown if defined). 
	 * The action format is the same as for POI actions, except that POI-specific parameters 
	 * will be ignored: closeBiw, autoTriggerRange, autoTriggerOnly.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root")	
	public List<LayarGetPOIsAction> actions = new ArrayList<LayarGetPOIsAction>();
	
	/**
	 * If an error condition occurs, this will be notified using the error code. 
	 * Note that in this case, the server is actually responding, 
	 * this is different than a HTTP 500 Error situation (server error).
	 * 0 = "ok". No error, data available in the other fields.
	 * Use any error code between 20-29 to send back an error. 
	 * The string of the error will be displayed as a message in the screen of the user. 
	 * Note that this will only be displayed if this is the first page in the response, 
	 * errors sent in any successive page will be ignored.
	 * 
	 * error 30: This layer requires authentication. 
	 * The client should open the webview at the authURL defined by the layer.
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("root")	
	public int errorCode = 0;
	
	/**
	 * The string for the error above. Max 80 characters.
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("root")	
	public String errorString = "ok";
	

	
	/*
	 * Pagination:
	 * The user is waiting for the screen to fill with POIs when he selects a layer. 
	 * It is therefore important to return results as quickly as possible. 
	 * The API offers the possibility to split the results in pages to speed up the process. 
	 * We typically expect around 10 results per page.
	 *
	 * If the Layer Service Provider uses pagination for the results (this is optional), 
	 * it can let the Layar Server know that there are more results by setting the 'morePages' 
	 * parameter to true and passing a nextPageKey (this is any string, may be a page number or a key). 
	 * The Layar Server will use  this key in its next request (pageKey parameter) 
	 * if it wants to fetch the next page of results. 
	 *
	 * Recommendations for number of POIs:
	 * On Android, only the first 90 POIs returned will be displayed on the client.  
	 * On IPhone, this number is 100.
     * Aim to return no more than 50 POIs within the search radius. 
     * If the search radius is very large containing many more POIs, 
     * return just the 50 closest POIs or the 50 most relevant POIs (depending on the situation, that's up to you).
     * Because the client fetches the POIs over-the-air, using paging is recommended 
     * for more than 15 results. Try to split the results in pages of 10 results.
	 */
	/**
	 * The key to the page being returned. 
	 * Pass this key to the page parameter in the request if the next page is requested.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root")	
	public String nextPageKey;
	
	/**
	 * Whether more pages can be fetched
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root")	
	@LayarDefaultValue("false")
	public Boolean morePages = false;
	
	/**
	 * The value of the radius must be returned if the GetPOI request doesn't contain a requested radius (flexible radius asked). 
	 * It cannot be used to overrule a value of radius if that was provided in the request.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root")	
	public Integer radius;
	
	/**
	 * This tells the client how many seconds to wait until the next getPOI request is made. 
	 * Default is 300s (5 minutes). Minimum is 10s. 	
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root")	
	@LayarDefaultValue("300")
	public Integer refreshInterval = 300;
	
	/**
	 * This tells the client to refresh the layer if the user has moved by more than 
	 * the distance specified. Default is 100m. Minimum is 3m.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root")	
	@LayarDefaultValue("100")
	public Integer refreshDistance = 100;
	
	/**
     * This tells the client the type of refresh that should be done:
     * true: the entire layer is refreshed, new POIs received will replace the current POIs
	 * false: the response will just update the current POIs, so POIs returned are added (unknown id) 
	 * or replacing (existing id) POIs. 
 	 * 
	 * Default is true. 
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root")	
	@LayarDefaultValue("true")
	public Boolean fullRefresh = true;
	
	/**
	 *  This message is briefly displayed as pop-up on top of the current view, as a result of a getPOI request.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root")	
	public String showMessage;
	
	/**
	 *  Used in the response of an update action for specifying which hotspots 
	 *  (identified by the hotspot id) should be deleted from the view.
	 *  
	 *  es.  "deletedHotspots":["spot0001", "spot0002"]
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root")	
	public List<String> deletedHotspots = new ArrayList<String>();
	
	/**
	 *  The animations defined on layer level should be applied to all POIs.
	 *  NOTE that POI level animations will override layer level animations.
	 */
	@LayarApiVersion("6.0")
	@LayarApiCategory("root")
	public List<LayarGetPOIsAnimation> animations = new ArrayList<LayarGetPOIsAnimation>();

	/**
	 *  A configurable dialog with a descriptive text and optionally buttons linking to actions.
	 *  It will be shown as a popup.
	 */
	@LayarApiVersion("6.0")
	@LayarApiCategory("root")
	public LayarGetPOIsDialog showDialog;

	/**
	 *  This forces the BIW style for all POIs to a certain form (verbose "classic" or lean "collapsed").
	 *  Set to null or do not send for default behavior, which is "classic" for geolocated POIs and "collapsed" for Vision POIs.
	 *  NOTE that this key can also be specified at POI level.
	 *  If both are present, the value defined for a POI overrules the one defined at the root level of the getPOIs response.
	 */
	@LayarApiVersion("6.0")
	@LayarApiCategory("root")
	public String biwStyle = null;
	
	/**
	 *  For Vision enabled layer, this can be used to disable the menu that shows thumbnails of trackable images.
	 */
	@LayarApiVersion("6.0")
	@LayarApiCategory("root")
	@LayarDefaultValue("false")
	@LayarApiDeprecated("6.2")
	public Boolean disableClueMenu = false;
}
