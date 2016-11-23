package com.example.joro.daggertest;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by joro on 23.11.16.
 */
@Module
public class ActivityModule {

    public ActivityModule() {

    }

    @PerActivity
    @Named("Activity")
    @Provides
    StringBuilder provideStringBuilderActivityScope() {
        return new StringBuilder("Activity ");
    }

    @Named("Unscoped")
    @Provides
    StringBuilder provideStringBuilderUnscoped() {
        return new StringBuilder("Unscoped ");
    }
}
