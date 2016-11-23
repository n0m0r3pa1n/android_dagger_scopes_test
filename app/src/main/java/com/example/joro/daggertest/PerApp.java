package com.example.joro.daggertest;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by joro on 23.11.16.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerApp {
}
