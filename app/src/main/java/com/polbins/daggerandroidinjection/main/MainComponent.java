package com.polbins.daggerandroidinjection.main;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by polbins on 31/3/17.
 */

@Subcomponent(modules = MainModule.class)
public interface MainComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }

}
