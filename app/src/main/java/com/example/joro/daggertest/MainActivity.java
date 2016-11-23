package com.example.joro.daggertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    @Named("Activity")
    StringBuilder activity1;

    @Inject
    @Named("Activity")
    StringBuilder activity2;

    @Inject
    @Named("App")
    StringBuilder app1;

    @Inject
    @Named("App")
    StringBuilder app2;

    @Inject
    @Named("Unscoped")
    StringBuilder unscoped1;

    @Inject
    @Named("Unscoped")
    StringBuilder unscoped2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerActivityComponent.builder().appComponent(CustomApplication.getComponent()).build().inject(this);

        Log.d(TAG, activity1.append(" Test").toString());
        Log.d(TAG, activity2.append(" Test1").toString());

        Log.d(TAG, app1.append(" Test").toString());
        Log.d(TAG, app2.append(" Test1").toString());

        Log.d(TAG, unscoped1.append(" Test").toString());
        Log.d(TAG, unscoped2.append(" Test1").toString());
    }
}
