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
 * 				 	Antonio Fittipaldi (antonio.fittipaldi AT ingloba360.it)
 */
package it.ingloba360.jlayarapi;

public class LayarGetPOIsDialog {
    
    /**
     * Title of the dialog box.
	 */
    @LayarRequired
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.showDialog")	
	public String title;
    
    /**
     * Text of the dialog box.
	 */
    @LayarRequired
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.showDialog")	
	public String description;
    
    /**
     * Icon to show in the dialog box.
	 */
    @LayarRequired
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.showDialog")	
	public String iconURL;
    
    /**
     * Buttons with various actions.
	 */
    @LayarRequired
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.showDialog")	
	public List<LayarGetPOIsAction> actions = new ArrayList<LayarGetPOIsAction>();
    
    /**
     * Specifies the BW style in the Camera view on layer level.
	 */
    @LayarOptional
	@LayarApiVersion("6.0")
	@LayarApiCategory("root.showDialog")	
	public List<LayarGetPOIsAction> biwStyle = new ArrayList<LayarGetPOIsAction>();

}
