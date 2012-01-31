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
 * LayarHotspotTransform.java
 * ------------------
 * (C) Copyright 2012 by Ingloba360
 * 
 * Original Author: Angelo Giove (angelo.giove AT ingloba360.it)
 * 				 	Antonio Fittipaldi (antonio.fittipaldi AT ingloba360.it)
 */
package it.ingloba360.jlayarapi;

public class LayarHotspotTransform {

	/**
	 * If this value is true, the rotation is calculated relative to the
	 * position of the user: the object will always face the user in the same
	 * way regardless of the absolute direction. In most cases angle will be 0
	 * when rel is true. By default, it is false.
	 */
	public Boolean rel;

	/**
	 * Rotation angle in degrees to rotate the object around the z-axis. The
	 * rotation direction is determined by the usual right-hand thumb rule
	 * (positive angle: counter clock-wise in the x-y plane). So for the example
	 * of -90, and assuming vector is [0,0,1] this means the object is oriented
	 * toward the East: a user looking toward the East will see the object as it
	 * was designed. By default, it is 0.
	 */
	public Float angle;

	/**
	 * (mandatory if dimension is 2 or 3)
	 * This scale factor is to be used to scale the object to different sizes.
	 * By default, it is 1.0.
	 */
	public Float scale;
}
