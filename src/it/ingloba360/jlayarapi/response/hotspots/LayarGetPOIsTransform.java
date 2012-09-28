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
 * LayarGetPOIsTransform.java
 * ------------------
 * (C) Copyright 2012 by Ingloba360
 * 
 * Original Author: Angelo Giove (angelo.giove AT ingloba360.it)
 */
package it.ingloba360.jlayarapi.response.hotspots;

import it.ingloba360.jlayarapi.annotations.LayarApiCategory;
import it.ingloba360.jlayarapi.annotations.LayarApiVersion;

// TODO: completare!!!
public class LayarGetPOIsTransform {

	/**
	 * Rotates the 2D/3D object over the given axis in its own local coordinate system.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.transform")
	public LayarGetPOIsTransformRotate rotate;
	
	/**
	 * Translate the POI to another location from its anchor point.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.transform")
	public LayarGetPOIsTransformTranslate translate;
	
	/**
	 * The multiplication factor to scale the 2D or 3D object.
	 */
	@LayarApiVersion("2.1")
	@LayarApiCategory("root.hotspots.transform")
	public Double scale = 1.0;
}
