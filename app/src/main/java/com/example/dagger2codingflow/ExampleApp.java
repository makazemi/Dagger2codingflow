package com.example.dagger2codingflow;

import android.app.Application;

import com.example.dagger2codingflow.dagger.ActivityComponent;
import com.example.dagger2codingflow.dagger.AppComponent;
import com.example.dagger2codingflow.dagger.DaggerAppComponent;

public class ExampleApp extends Application {

    private AppComponent component;


    @Override
    public void onCreate() {
        super.onCreate();

        component= DaggerAppComponent.create();
    }

    public AppComponent getComponent(){
        return component;
    }
}
