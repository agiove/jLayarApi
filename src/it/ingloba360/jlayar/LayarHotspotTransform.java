package it.ingloba360.jlayar;

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
