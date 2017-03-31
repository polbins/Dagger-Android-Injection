package com.polbins.daggerandroidinjection;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by polbins on 31/3/17.
 */

@Singleton
@Component(modules = {
        ApplicationModule.class
})
public interface ApplicationComponent {

    Application application();

}
