package com.easygautam.daggermvp.di.module;

import com.easygautam.daggermvp.datasource.OnlineDataSource;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * User Name: gautams2
 * Create Date : 5/30/2018
 */
@Module
public abstract class DataSourceModule {

    @Singleton
    @Provides
    public static OnlineDataSource provideOnlineDataSource(){
      return new OnlineDataSource();
    }

}
