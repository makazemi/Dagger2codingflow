package com.example.dagger2codingflow.car;

import android.util.Log;

public class Tires {

    // we don't own this class so we cant annotate it with @Inject
    // this is a external library for example

    private static final String TAG = "Car";

    public void inflate(){
        Log.d(TAG, "Tires inflate");
    }
}
