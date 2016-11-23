package com.example.joro.daggertest;

import javax.inject.Named;

import dagger.Component;

/**
 * Created by joro on 23.11.16.
 */

@PerActivity
@Component(dependencies = { AppComponent.class }, modules = ActivityModule.class)
public interface ActivityComponent {
    @Named("Activity")
    StringBuilder getStringBuilder();

    @Named("Unscoped")
    StringBuilder getUnscopedStringBuilder();


    void inject(MainActivity mainActivity);
}
