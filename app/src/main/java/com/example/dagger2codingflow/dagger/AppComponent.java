package com.example.dagger2codingflow.dagger;

import com.example.dagger2codingflow.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    Driver getDriver();


}
