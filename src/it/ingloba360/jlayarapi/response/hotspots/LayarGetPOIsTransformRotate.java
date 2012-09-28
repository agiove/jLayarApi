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
 * LayarGetPOIsTransformRotate.java
 * ------------------
 * (C) Copyright 2012 by Ingloba360
 * 
 * Original Author: Angelo Giove (angelo.giove AT ingloba360.it)
 */
package it.ingloba360.jlayarapi.response.hotspots;

import it.ingloba360.jlayarapi.annotations.LayarApiCategory;
import it.ingloba360.jlayarapi.annotations.LayarApiVersion;
import it.ingloba360.jlayarapi.annotations.LayarDefaultValue;
import it.ingloba360.jlayarapi.response.LayarGetPOIsAxis;

public class LayarGetPOIsTransformRotate {

	/**
	 * Means the rotation is relative to the user around z-axis. 
	 * On layar client, "axis" and "angle" are applied after "rel" has been applied. 
	 * If "rel" is set to true, the Geo-location or Vision enabled POI will rotate over the Z-axis to face the user first, 
	 * then it will rotate around the defined "axis" with a certain degrees defined in "angle" parameter. 
	 * From then on, the rotation is relative to the user around z-axis.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.transform.rotate")
	@LayarDefaultValue("false")
	public Boolean rel = false;
	
	public LayarGetPOIsAxis axis;
	
	public Double angle = 0.0;
}
