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
 * LayarGetPOIsIcon.java
 * ------------------
 * (C) Copyright 2012 by Ingloba360
 * 
 * Original Author: Angelo Giove (angelo.giove AT ingloba360.it)
 */
package it.ingloba360.jlayarapi.response.hotspots;

import it.ingloba360.jlayarapi.annotations.LayarApiCategory;
import it.ingloba360.jlayarapi.annotations.LayarApiVersion;
import it.ingloba360.jlayarapi.annotations.LayarDefaultValue;

public class LayarGetPOIsIcon {

	/**
	 * Each POI can be represented by an image defined in this url. 
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.icon")
	public String url;
	
	/**
	 * On the publishing site, CIW icon set can be defined under the "Look & feel" tab. Each CIW icon set will have a type value. 
	 * In the JSON response, you can fill in the right type value to determine which CIW icon set should be used to represent a POI.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.icon")
	@LayarDefaultValue("0")
	public Integer type = 0;
}
