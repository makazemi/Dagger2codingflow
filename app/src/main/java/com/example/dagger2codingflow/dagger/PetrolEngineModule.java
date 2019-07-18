package com.example.dagger2codingflow.dagger;

import com.example.dagger2codingflow.car.DieselEngine;
import com.example.dagger2codingflow.car.Engine;
import com.example.dagger2codingflow.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  class PetrolEngineModule {

    private int horsePower;

    public PetrolEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(PetrolEngine engine){
        return engine;
    }
}
