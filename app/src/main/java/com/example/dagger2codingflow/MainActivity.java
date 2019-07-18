package com.example.dagger2codingflow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dagger2codingflow.car.Car;
import com.example.dagger2codingflow.dagger.ActivityComponent;
import com.example.dagger2codingflow.dagger.DaggerActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1,car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DaggerActivityComponent.create() when use that constructor of classes
        //didn't have arguments.
        //ActivityComponent component= DaggerActivityComponent.create();

//        ActivityComponent component=DaggerActivityComponent.builder()
//                .petrolEngineModule(new PetrolEngineModule(100))
//                .build();

//        ActivityComponent component=DaggerActivityComponent.builder()
//                .horsePower(150)
//                .engineCapacity(1400)
//                .build();

      //  ActivityComponent component=((ExampleApp)getApplication()).getComponent();

         ActivityComponent component= DaggerActivityComponent.builder()
                 .horsePower(130)
                 .engineCapacity(1400)
                 .appComponent(((ExampleApp)getApplication()).getComponent())
                 .build();

        component.inject(this);
        car1.drive();
        car2.drive();
    }
}
