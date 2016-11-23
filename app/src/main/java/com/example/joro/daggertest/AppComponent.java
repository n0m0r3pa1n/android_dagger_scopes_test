package com.example.joro.daggertest;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by joro on 23.11.16.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    @Named("App")
    StringBuilder getStringBuilder();
}
