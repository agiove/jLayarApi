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
 * LayarHotspotObject.java
 * ------------------
 * (C) Copyright 2012 by Ingloba360
 * 
 * Original Author: Angelo Giove (angelo.giove AT ingloba360.it)
 * 				 	Antonio Fittipaldi (antonio.fittipaldi AT ingloba360.it)
 */
package it.ingloba360.jlayarapi;

public class LayarHotspotObject {

	/**
	 * The URL to base the paths to the various objects on
	 */
	public String baseURL;

	/**
	 * (mandatory if dimension is 2 or 3) The object representation when the
	 * rendered object size on the phone is more than 100px. The relative path
	 * to the file or relative URL to call in order to fetch the object.
	 * 
	 * es. "full": "near.l3d" or "full": "?object=myobject&configuration=near"
	 * or "full": "near.png"
	 */
	public String full;

	/**
	 * for 2d object (dimension=2): The object representation when the rendered
	 * object size is less than 100px. This should be a low resolution version
	 * of the 'full' 2d image. Use typically a resolution of at most 100x100px.
	 * 
	 * for 3d object (dimension=3): The object representation when the rendered
	 * object size is less than 100px but more than 20px. This should be a less
	 * detailed (less polygons) representation of the 'full' 3d object. Use
	 * typically less than 50 polygons.
	 * 
	 * NOTE that if you do not provide a "reduced" object, the client will fall
	 * back on using the "icon" at a larger distance. For good user experience,
	 * please provide a "reduced" object.
	 * 
	 * es. "reduced": "reduced.l3d" or "reduced":
	 * "?object=myobject&config=reduced"
	 */
	public String reduced;

	/**
	 * for 2d object (dimension=2): 'icon' is used as fallback if neither 'full'
	 * nor 'reduced' can be loaded. As a last resort, CIW is used. In both cases
	 * they are scaled as if it was a billboard with the right size.
	 * 
	 * for 3d object (dimension=3): If the rendered object is less than 20px,
	 * the 'icon' image is used as a billboard in the size of the 3d object and
	 * scaled down realistically to match the actual size of the object ('size'
	 * x 'scale'). If 'icon' is missing, the default CIWs defined in the layer
	 * are used.
	 * 
	 * NOTE that if you do not provide an "icon", the client will fall back on
	 * using the custom POI icons (CIWs) or default colored POI disks. For good
	 * user experience, please provide an "icon" object (or make sure you define
	 * custom POI icons in the layer definition on the publishing site).
	 */
	public String icon;

	/**
	 * (mandatory if dimension is 2 or 3) 2d object (image): The height of the
	 * image in meters. 3d object(.l3d file): The size of the object in m. This
	 * is the length of the edge of the smallest cube in which the object can
	 * fit.
	 */
	public Float size;
}
