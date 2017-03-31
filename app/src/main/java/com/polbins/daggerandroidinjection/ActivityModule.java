package com.polbins.daggerandroidinjection;

import android.app.Activity;

import com.polbins.daggerandroidinjection.main.MainActivity;
import com.polbins.daggerandroidinjection.main.MainComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by polbins on 31/3/17.
 */

@Module(subcomponents = MainComponent.class)
abstract class ActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindMainActivityInjectorFactory(MainComponent.Builder builder);

}
