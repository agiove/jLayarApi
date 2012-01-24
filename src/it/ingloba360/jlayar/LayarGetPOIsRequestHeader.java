package it.ingloba360.jlayar;

/**
HTTP request header: User-Agent: The user agent originally set by the client. 
Format is: Layar/x.y [OS name]/x.y.z ([Brand] [Model]),  
for example "Layar/3.1 Android/2.1 (Motorola Milestone)" , 
"Layar/3.1 iPhoneOS/3.1.2 (Apple iPhone3GS)" or "Layar/3.0 BadaOS/3.0.4(Samsung Wave)".

The following are added as X-headers for ALL requests:
 
 X-Layar-Brand 	 The telephone brand. E.g. "google" or "Apple" or "Samsung"
 X-Layar-Model 	 The telephone model name. E.g. "Nexus One" or "iPhone 3GS" or "iPhone 4"
 X-Layar-OS 	 The operating system. E.g. "Android"
 X-Layar-OS-Version 	 The operating system version. E.g. "2.1-update1"
 X-Layar-Version    	The mobile client application version. E.g. "3.1".
Only for the Layar Reality Browser, not used by Layar Player (not sent by the player)
 X-Layar-Player-Version 	 The version of the Layar Player. E.g. "1.0". Only passed by the Layar Player.

poiUrl: Part of the layer definition, can be set using the Layar Provisioning Website
*/
public class LayarGetPOIsRequestHeader {

	public String userAgent;
	public String xLayarBrand;
	public String xLayarModel;
	public String xLayarOS;
	public String xLayarOSVersion;
	public String xLayarVersion;
	public String xLayarPlayerVersion;
	public String poiUrl;
	
}
