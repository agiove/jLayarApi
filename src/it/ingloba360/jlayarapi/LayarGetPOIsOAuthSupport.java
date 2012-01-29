/*******************************************************************************
 * ===========================================================
 * jLayarApi : a java wrapper for layar api
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
 * LayarGetPOIsOAuthSupport.java
 * ------------------
 * (C) Copyright 2012 by Ingloba360
 * 
 * Original Author: Angelo Giove (angelo.giove AT ingloba360.it)
 * 				 	Antonio Fittipaldi (antonio.fittipaldi AT ingloba360.it)
 ******************************************************************************/
package it.ingloba360.jlayarapi;

import it.ingloba360.jlayarapi.annotations.LayarApiCategory;
import it.ingloba360.jlayarapi.annotations.LayarApiVersion;
import it.ingloba360.jlayarapi.annotations.LayarRequired;

public class LayarGetPOIsOAuthSupport {

	/**
	 * oauth consumer key: The developer can submit this key using the Layer Provisioning Website
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("OAuth Signing")
	public String oauth_consumer_key;			/* required */
	
	/**
	 * this will always be HMAC-SHA1
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("OAuth Signing")
	public String oauth_signature_method;		/* required */
	
	/**
	 * 	timestamp for the request. 
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("OAuth Signing")
	public Integer oauth_timestamp;				/* required */
	
	/**
	 * unique nonce to rule out replay attacks
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("OAuth Signing")
	public String oauth_nonce;					/* required */
	
	/**
	 * oauth version used. Will always be 1.0
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("OAuth Signing")
	public String oauth_version;				/* required */
	
	/**
	 * HMAC-SHA1 signature using the Signature Base String as text and the Consumer Secret (no token secret) as key. 
	 * The consumer secret is submitted by the developer on the Layar Provisioning Website.
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("OAuth Signing")
	public String oauth_signature;				/* required */
	
	/** The request body hash value.
	 *  Please read http://oauth.googlecode.com/svn/spec/ext/body_hash/1.0/oauth-bodyhash.html for more information. 
	 */
	@LayarRequired
	@LayarApiVersion("2.1")
	@LayarApiCategory("OAuth Signing")
	public String oauth_body_hash;
}
