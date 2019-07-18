package com.example.dagger2codingflow.dagger;

import com.example.dagger2codingflow.MainActivity;
import com.example.dagger2codingflow.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@PerActivity
@Component( dependencies = AppComponent.class ,modules = {WheelsModule.class,DieselEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        Builder appComponent(AppComponent component);

        ActivityComponent build();
    }
}
