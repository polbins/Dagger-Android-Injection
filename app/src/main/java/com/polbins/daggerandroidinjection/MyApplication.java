package com.polbins.daggerandroidinjection;

import android.app.Application;

/**
 * Created by polbins on 31/3/17.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

}
