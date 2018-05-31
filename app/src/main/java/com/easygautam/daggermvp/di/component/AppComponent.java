package com.easygautam.daggermvp.di.component;

import com.easygautam.daggermvp.DApplication;
import com.easygautam.daggermvp.di.module.ActivityModule;
import com.easygautam.daggermvp.di.module.AppModule;
import com.easygautam.daggermvp.di.module.DataSourceModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * User Name: gautams2
 * Create Date : 5/30/2018
 */
@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                AppModule.class,
                DataSourceModule.class,
                ActivityModule.class
        })
public interface AppComponent {

    void inject(DApplication application);

}
