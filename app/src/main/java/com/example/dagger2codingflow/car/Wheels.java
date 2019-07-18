package com.example.dagger2codingflow.car;

public class Wheels {
    // we don't own thi class so we cant annotate it with @Inject
    // this is a external library for example

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims,Tires tires) {

        this.rims=rims;
    }

}
