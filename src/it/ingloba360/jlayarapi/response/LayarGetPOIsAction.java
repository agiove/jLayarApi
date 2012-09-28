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
 * LayarGetPOIsAction.java
 * ------------------
 * (C) Copyright 2012 by Ingloba360
 * 
 * Original Author: Angelo Giove (angelo.giove AT ingloba360.it)
 */
package it.ingloba360.jlayarapi.response;

import it.ingloba360.jlayarapi.annotations.LayarApiCategory;
import it.ingloba360.jlayarapi.annotations.LayarApiVersion;
import it.ingloba360.jlayarapi.annotations.LayarDefaultValue;
import it.ingloba360.jlayarapi.annotations.LayarRequired;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Video: All formats supported natively by the device are supported. In order
 * to ensure cross-device compatibility, mpeg4 and 3gpp are best (480x320
 * resolutions). Ensure your video is encoded for http streaming, including
 * progressive download hints.
 * 
 * Audio: All formats supported natively by the device are supported. For
 * cross-device compatibility, mp3 files are best. For audio fragments on the
 * phone, 96kbit should be enough. Music should be max 128kbit. Higher than this
 * is not guaranteed to work.
 * 
 * @author angelo
 * 
 */
public class LayarGetPOIsAction {

	/**
	 * Possible URIs are "tel:", "sms:", "mailto:", "http://", "https://",
	 * "audio://", "video://", "layar://" and custom app schemes (only if the
	 * user's phone has the corresponding app installed. Note that "rtsp://" is
	 * NOT supported.
	 * 
	 * The URL to send the request to. Note that the following HTTP headers will
	 * always be sent: - Cookie (if a cookie has been set for the domain) -
	 * User-Agent: The Layar app User-Agent is sent if the request is from
	 * within the AR view (text/plain, audio/mpeg, audio/mp4, video/3gpp,
	 * video/mp4, application/vnd.layar.async or application/vnd.layar.internal
	 * in combination with audio:// or video:// schemes). The web browser's
	 * User-Agent is sent if the request is from within a web view (text/html or
	 * application/vnd.layar.internal in combination with http:// or https://
	 * protocols).
	 * 
	 * v. 5.0 added a new sharing intent (layarshare://<layername>/?<parameters>
	 * that can be used within the layar client.
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.actions|hotspots.actions")
	public String uri;

	/**
	 * If specified, the text will be displayed in the button corresponding to
	 * the action. Otherwise the app will show a default text depending on the
	 * URI scheme used.
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.actions|hotspots.actions")
	public String label;

	/**
	 * "text/html", "text/plain", "audio/mpeg", "audio/mp4", "video/3gpp",
	 * "video/mp4", "application/vnd.layar.internal",
	 * "application/vnd.layar.async"
	 * 
	 * This tells the client which type of document is being fetched. Instead of
	 * creating artificial URI's like "audio://", authors can now just provide
	 * the audio content-type and use the proper URL ("http://") for fetching
	 * the content. Additional new types are: -
	 * "application/vnd.layar.internal": This is the default type which tells
	 * the Layar client to look at the URI in order to interpret the result. Use
	 * it for "tel:", "mailto:", "sms:", "layar://", "layarshare://" and other
	 * custom URL schemes. - "text/plain": This tells the Layar client to fetch
	 * a plain text document that will be shown as a pop-up to the user as a
	 * result of activating the action. This is the same pop-up as the one used
	 * for the "showMessage" param in the getPOI response. -
	 * "application/vnd.layar.async": This tells the client that the action is a
	 * REST call to the content provider. Only http:// is supported. The
	 * response should be a HTTP 302 redirect to a layar:// intent. The layar://
	 * intent tells the client to perform a new getPOI request. The body of the
	 * HTTP 302 response (plain text) will be displayed as a pop-up to the user
	 * before performing the new getPOI request.
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.actions|hotspots.actions")
	@LayarDefaultValue("application/vnd.layar.internal")
	public String contentType = "application/vnd.layar.internal";

	/**
	 * GET or POST GET by default
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.actions|hotspots.actions")
	@LayarDefaultValue("GET")
	public String method = "GET";

	/**
	 * ["lat", "lon", "alt", "lang", "countrycode", "localCountryCode",
	 * "version"]
	 * 
	 * Comma-separated list of parameters to be added to the request: - For a
	 * GET request, the params will be added in the URL E.g.
	 * "lat=45.462&lon=2.42346&alt=560" - For a POST request, the params will be
	 * passed as URL-encoded parameters in the body of the response. Possible
	 * values: lat, lon, alt, lang, countryCode, localCountryCode, version.
	 * 
	 * NOTE: countryCode is the home country of the user while localCountryCode
	 * is the country the user is in at the moment
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.actions|hotspots.actions")
	public List<String> params = new ArrayList<String>();

	/**
	 * This tells the client to close the BIW after the user clicked the button
	 * of the action. This way, after the action has opened/played, the user
	 * returns in the POI view (AR, map, list) rather than in the BIW. False by
	 * default.
	 * 
	 * NOTE: not included in the new Actions object (layer level) defined in the
	 * JSON response.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("hotspots.actions")
	@LayarDefaultValue("false")
	public Boolean closeBiw = false;

	/**
	 * http://layar.pbworks.com/Activity-types-for-POI-actions
	 * 
	 * This determines which icon should be used if the action is displayed in a
	 * button. Layar will provide a predefined set of icons that content authors
	 * can use here
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.actions|hotspots.actions")
	@LayarDefaultValue("0")
	public Integer activityType = 0;

	/**
	 * This tells the client whether or not to show that there is background
	 * activity to fetch the action result. This is useful mostly for
	 * autoTriggered actions where it may not always be good user experience to
	 * show something. True by default
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.actions|hotspots.actions")
	public Boolean showActivity;

	/**
	 * This is shown to the user while waiting for the response, instead of the
	 * spinning wheel. Empty by default (spinning wheel shown by default).
	 * 
	 * NOTE: this is only shown for actions that run in the background, like
	 * contentType text/plain and application/vnd.layar.async.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.actions|hotspots.actions")
	public String activityMessage;

	/**
	 * The presence of this parameter indicates whether of not this action can
	 * be autotriggered by reaching the POI. Note that only one action can be
	 * auto-triggered, the client will use the first one in the array having
	 * this parameter.
	 * 
	 * The parameter itself is the distance in m within which the user must be
	 * of the POI position in order for the auto-trigger to launch.
	 * 
	 * NOTE: not included in the new Actions object (layer level) defined in the
	 * JSON response.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("hotspots.actions")
	public Integer autoTriggerRange;

	/**
	 * Autotrigger indicator for Vision enabled POIs. 
	 * "autoTriggerRange" mentioned above does not work for Vision enabled POIs because there is no range to be determined.
	 * NOTE: not included in the layer level Actions object defined in the JSON response.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("hotspots.actions")
	@LayarDefaultValue("false")
	public Boolean autoTrigger = false;
	
	/**
	 * Indicates whether of not this action can also be invoked manually by the
	 * user outside of the range specified. If true, the action will not be
	 * shown when pressing the button to display all possible actions, unless
	 * the user is within the give range of the POI.
	 * 
	 * NOTE: not included in the new Actions object (layer level) defined in the
	 * JSON response.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("hotspots.actions")
	@LayarDefaultValue("false")
	public Boolean autoTriggerOnly = false;
}
