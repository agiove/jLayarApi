/*******************************************************************************
 * ===========================================================
 * jLayarApi : a java wrapper for layar api
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
 * LayarGetPOIsRequest.java
 * ------------------
 * (C) Copyright 2012 by Ingloba360
 * 
 * Original Author: Angelo Giove (angelo.giove AT ingloba360.it)
 * 				 	Antonio Fittipaldi (antonio.fittipaldi AT ingloba360.it)
 ******************************************************************************/
package it.ingloba360.jlayarapi;

import it.ingloba360.jlayarapi.annotations.LayarApiCategory;
import it.ingloba360.jlayarapi.annotations.LayarApiVersion;
import it.ingloba360.jlayarapi.annotations.LayarDefaultValue;
import it.ingloba360.jlayarapi.annotations.LayarRequired;

public class LayarGetPOIsRequest {
	
	/** Current server timestamp of the request */
	public Long timestamp;

	public LayarGetPOIsRequestHeader header;
	
	/**
	 *  OAuth Support
	 */
	public LayarGetPOIsOAuthSupport oauth;
	
	/**
	 * Unique ID of the end-user, anonymized.  
	 * It is a hashed code. In most cases the IMEI is used to create the hash, 
	 * otherwise another unique ID (e.g. UDID for IPhone or other serial number on other devices).
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("Identifiers")
	public String userId;			/* required */
	
	/**
	 * Identifier of the layer. The unique name for a layer.  
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("Identifiers")
	public String layerName;		/* required */
	
	/**
	 * This indicates the version of the API that the phone is using. 
	 * Note that for older version, strings like "ip3.0" might be used. 
	 * However, this version string cannot be used anymore to differentiate clients 
	 * (Android and iPhone clients use the same version string, as it's the API version). 
	 * Current list of versions:
	 * "2", "2.1", "ip2.0", "2.2", ip2.1", "2.2.1", "2.2.2", "3.0", "ip3.0", "3.1", "3.5", "3.6", "4.0".
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("API version")
	public String version;			/* required */
	
	/**
	 * latitude of current position (GPS coordinate) 
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("Geo-Location")
	public Double lat;				/* required */
	
	/**
	 * longitude of current position (GPS coordinate) 
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("Geo-Location")
	public Double lon;				/* required */
	
	/**
	 * This is the home country of the user, as determined by the network provider of the SIM card 
	 * in the phone. If this is not available (e.g. iPhone or no SIM card inserted), 
	 * it will return the locale value set on the phone.
	 * NOTE: If you have development mode on, the country setting in developer settings 
	 * will overrule the values from SIM card and Locale setting.
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("Country")
	public String countryCode;		/* required */
	
	/**
	 * Language used on the client (locale setting on the phone). Currently using ISO-639-1. 
	 */
	@LayarRequired
	@LayarApiVersion("3.0")
	@LayarApiCategory("Language")
	public String lang;				/* required */
	
	/**
	 * This tells the poi provider whether the client is requesting a full refresh of the layer 
	 * or just an update: This can be caused by the new refresh parameter(fullRefresh) 
	 * or by an intent containing the "action=update" command.
	 * Default action=refresh
	 */
	@LayarRequired
	@LayarApiVersion("4.0")
	@LayarApiCategory("Action type")
	@LayarDefaultValue("refresh")
	public String action;			/* required */
	
	/**
	 * the accuracy of the current location, as given by the device. 
	 * Note that accuracy may not be given if a fixed location is used (developer feature)
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("Accuracy")
	public Integer accuracy;
	
	/**
	 * If the results are spread over more pages, 
	 * the Layar Server can request the next page using this pageKey 
	 * (if received in the previous response)
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("Pagination")
	public String pageKey;
	
	/* ************************************************************************** */
	/* * FILTER SETTINGS -> defined under Filters tab in layer editing section ** */
	/* ************************************************************************** */
	
	/**
	 * the optionid corresponding to the value of the radio button list option selected by the user 
	 * (or default value if not changed)
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("Filter settings")
	public String RADIOLIST;
	
	/**
	 * the search term entered by the user. 
	 * When multiple search boxes are defined (up to 3), they will be numbered _2, _3.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("Filter settings")
	public String SEARCHBOX;
	
	@LayarApiVersion("3.0")
	@LayarApiCategory("Filter settings")
	public String SEARCHBOX_2;
	
	@LayarApiVersion("3.0")
	@LayarApiCategory("Filter settings")
	public String SEARCHBOX_3;
	
	/**
	 * Optional: the value for the custom slider selected b the user. 
	 * When multiple sliders are defined (up to 3), they will be numbered _2, _3.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("Filter settings")
	public Double CUSTOM_SLIDER;
	
	@LayarApiVersion("3.0")
	@LayarApiCategory("Filter settings")
	public Double CUSTOM_SLIDER_2;
	
	@LayarApiVersion("3.0")
	@LayarApiCategory("Filter settings")
	public Double CUSTOM_SLIDER_3;
	
	/**
	 * The value for the search radius selected by the user in the RANGE_SLIDER (unit in meters). 
	 * from v3 on, radius is not mandatory anymore and flexible radius can be used 
	 * (if the default value of the range slider is empty, 
	 * the client will adjust the range automatically to 5% more than the furthest POI returned).
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("Filter settings")
	public Integer radius;
	
	/**
	 * The value(s) selected for the checkbox: multiple values get passed using comma-separated values.
	 * es. CHECKBOXLIST = 4,7
	 */
	@LayarApiVersion("3.0")
	@LayarApiCategory("Filter settings")
	public String CHECKBOXLIST;
	
	/* ************************************************************************** */
	/* * END FILTER SETTINGS * */
	/* ************************************************************************** */
	
	/**
	 * country code for the current country the device is located in, 
	 * based on the country of the current mobile network provider the user is roaming in. 
	 * If not available (e.g iPhone or no SIM card), the app will try to determine the current country based 
	 * on the GPS location (reverse geo-coding lookup). 
	 * However this may be unsuccessful and therefore incorrect.
	 */
	@LayarApiVersion("3.0")
	@LayarApiCategory("Local country code")
	public String localCountryCode;
	
	/**
	 * The current altitude of the user. 
	 * This is not always known on the client and will only be passed when there is a gps fix.
	 */
	@LayarApiVersion("3.0")
	@LayarApiCategory("Altitude")
	public Integer alt;
	
	/**
	 * Text string identifying the POI that triggered the request for this layer in Layar Stream (in Nearby view). 
	 * If possible, this POI should be included in the response regardless of the filter settings.
	 */
	@LayarApiVersion("3.5")
	@LayarApiCategory("Requested POI id")
	public String requestedPoiId;
	
	/**
	 * The key of the reference image that caused this layer to show up in the visual search results.
	 */
	@LayarApiVersion("6.0")
	@LayarApiCategory("layar Vision")
	public String recognizedReferenceImage;
	
}
