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
 * LayarGetPOIsText.java
 * ------------------
 * (C) Copyright 2012 by Ingloba360
 * 
 * Original Author: Angelo Giove (angelo.giove AT ingloba360.it)
 */
package it.ingloba360.jlayarapi.response.hotspots;

import it.ingloba360.jlayarapi.annotations.LayarApiCategory;
import it.ingloba360.jlayarapi.annotations.LayarApiVersion;
import it.ingloba360.jlayarapi.annotations.LayarMaxDim;
import it.ingloba360.jlayarapi.annotations.LayarRequired;

public class LayarGetPOIsText {

	/**
	 * This is the first line in the BIW dialog on the client. 
	 * It has larger font and uses the Banner text color defined under the "Look & feel" tab of the publishing site. 
	 * The recommended maximum string length is 60 characters and it will be wrapped over 2 lines. 
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.text")
	@LayarMaxDim("60")
	public String title;
	
	/**
	 * Some text can be used to explain the POI. 
	 * It has normal font and uses the BIW Text Color defined under the "Look & feel" tab of the publishing site. 
	 * The recommended maximum string length is 140 characters and it will be wrapped over 3 lines.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.text")
	@LayarMaxDim("140")
	public String description;
	
	/**
	 * One line of string at the bottom part of the BIW. 
	 * It has small font and uses the BIW Title Color defined under "Look & feel" tab of the publishing site. 
	 * The recommended maximum string length is 45 characters without wrapping. 
	 * Extra characters will be cut off on the screen.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.text")
	@LayarMaxDim("45")
	public String footnote;
}
