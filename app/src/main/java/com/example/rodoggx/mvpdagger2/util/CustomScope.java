package com.example.rodoggx.mvpdagger2.util;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by RodoggX on 8/6/2017.
 */

@Documented
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomScope {
}
