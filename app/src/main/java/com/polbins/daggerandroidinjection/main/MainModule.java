package com.polbins.daggerandroidinjection.main;

import dagger.Binds;
import dagger.Module;

/**
 * Created by polbins on 31/3/17.
 */

@Module
abstract class MainModule {

    @Binds
    abstract MainContract.View bindMainView(MainActivity mainActivity);

}
