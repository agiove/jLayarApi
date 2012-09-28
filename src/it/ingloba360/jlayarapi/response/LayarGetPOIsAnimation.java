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
 * LayarGetPOIsAnimation.java
 * ------------------
 * (C) Copyright 2012 by Ingloba360
 *
 * Original Author: Angelo Giove (angelo.giove AT ingloba360.it)
 */
package it.ingloba360.jlayarapi.response;

import it.ingloba360.jlayarapi.annotations.LayarApiCategory;
import it.ingloba360.jlayarapi.annotations.LayarApiVersion;
import it.ingloba360.jlayarapi.annotations.LayarRequired;

import java.util.ArrayList;
import java.util.List;

// TODO: riprogettare in base al doc!!!
public class LayarGetPOIsAnimation {
    
	/**
     * A sequence of animations are triggered when the POI is first loaded in the AR view.
	 */
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.animations")	
	public List<String> onCreate = new ArrayList<String>();

	/**
     * A sequence of animations are triggered when the POI is updated in the getPOIs response.
	 */
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.animations")	
	public List<String> onUpdate = new ArrayList<String>();

	/**
     * A sequence of animations are triggered when the POI is removed from the AR view.
	 */
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.animations")	
	public List<String> onDelete = new ArrayList<String>();

	/**
     * A sequence of animations are triggered when the POI gets focus in the AR view.
	 */
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.animations")	
	public List<String> onFocus = new ArrayList<String>();
    
	/**
     * A sequence of animations are triggered when user taps onthe POI in the AR view.
	 */
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.animations")	
	public List<String> onClick = new ArrayList<String>();

	/**
     * The animation type, namely rotate, scale and translate.
	 */
    @LayarRequired
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.animations")	
	public String type;

	/**
     * Animation duration in milliseconds.
	 */
    @LayarRequired
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.animations")	
	public Integer length;
    
	/**
     * Delay in milliseconds before starting the animation.
	 */
    @LayarRequired
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.animations")	
	public Integer delay = 0;
    
	/**
     * Delay in milliseconds before starting the animation.
	 */
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.animations")	
	public Long interpolationParam;
    
	/**
     * The interpolation to use in the animation.
	 */
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.animations")	
	public String interpolationString = "linear";
    
	/**
     * The POI state keeps the end state of the animation.
	 */
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.animations")	
	public Boolean persist = false;
    
	/**
     * Specifies whether the animation is repeated in a loop.
	 */
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.animations")	
	public Boolean reoeat = false;
    
	/**
     * Specifies the start state of the animation.
	 */
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.animations")	
	public Long from;
    
	/**
     * Specifies the end state of the animation.
	 */
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.animations")	
	public Long to;

	/**
     * Axis that this animation resolves around.
	 */
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.animations")	
	public List<String> axis = new ArrayList<String>();

}
