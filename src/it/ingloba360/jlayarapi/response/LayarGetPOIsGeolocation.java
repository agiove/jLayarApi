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
 * LayarGetPOIsDialog.java
 * ------------------
 * (C) Copyright 2012 by Ingloba360
 * 
 * Original Author: Angelo Giove (angelo.giove AT ingloba360.it)
 */
package it.ingloba360.jlayarapi.response;

import it.ingloba360.jlayarapi.annotations.LayarApiVersion;
import it.ingloba360.jlayarapi.annotations.LayarRequired;

public class LayarGetPOIsGeolocation {

	/**
	 * The decimal GPS coordinate value of the latitude for the POI. 
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	public Double lat;
	
	/**
	 * The decimal GPS coordinate value of the longitude for the POI. 
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	public Double lon;

	/**
	 * The decimal GPS coordinate value of the altitude for the POI. 	
	 */
	@LayarApiVersion("2.1")
	public Double alt;
	
}
