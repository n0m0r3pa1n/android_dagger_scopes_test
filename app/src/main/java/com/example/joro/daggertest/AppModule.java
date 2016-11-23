package com.example.joro.daggertest;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by joro on 23.11.16.
 */

@Module
public class AppModule {
    public AppModule() {
    }

    @Singleton
    @Named("App")
    @Provides
    public StringBuilder providesStringBuilder() {
        return new StringBuilder("App ");
    }
}
