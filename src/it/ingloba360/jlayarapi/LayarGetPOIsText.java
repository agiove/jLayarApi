package it.ingloba360.jlayarapi;

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
