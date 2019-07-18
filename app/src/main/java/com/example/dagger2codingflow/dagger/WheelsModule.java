package com.example.dagger2codingflow.dagger;

import com.example.dagger2codingflow.car.Rims;
import com.example.dagger2codingflow.car.Tires;
import com.example.dagger2codingflow.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }
    @Provides
    static  Tires provideTires(){
        Tires tires=new Tires();
        tires.inflate();
        // we can put desired configuration in this method for Tires class;
        return tires;
    }
    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }
}
