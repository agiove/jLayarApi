package it.ingloba360.jlayar.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface LayarApiVersion {
	public String value();
}
