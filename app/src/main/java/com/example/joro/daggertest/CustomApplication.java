package com.example.joro.daggertest;

import android.app.Application;

/**
 * Created by joro on 23.11.16.
 */

public class CustomApplication extends Application {
    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder().build();
    }

    public static AppComponent getComponent() {
        return component;
    }
}
