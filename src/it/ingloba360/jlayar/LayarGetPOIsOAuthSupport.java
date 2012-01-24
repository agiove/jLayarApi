package it.ingloba360.jlayar;

import it.ingloba360.jlayar.annotations.LayarApiCategory;
import it.ingloba360.jlayar.annotations.LayarApiVersion;
import it.ingloba360.jlayar.annotations.LayarRequired;

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
