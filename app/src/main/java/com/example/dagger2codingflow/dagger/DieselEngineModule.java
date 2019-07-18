package com.example.dagger2codingflow.dagger;

import com.example.dagger2codingflow.car.DieselEngine;
import com.example.dagger2codingflow.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
   abstract Engine provideEngine(DieselEngine engine);
}
