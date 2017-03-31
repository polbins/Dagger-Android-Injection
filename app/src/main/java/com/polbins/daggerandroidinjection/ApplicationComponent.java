package com.polbins.daggerandroidinjection;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by polbins on 31/3/17.
 */

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        ApplicationModule.class,
        ActivityModule.class
})
public interface ApplicationComponent {

    Application application();

    void inject(MyApplication application);

}
