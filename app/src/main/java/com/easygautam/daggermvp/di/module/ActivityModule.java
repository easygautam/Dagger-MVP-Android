package com.easygautam.daggermvp.di.module;

import com.easygautam.daggermvp.view.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * User Name: gautams2
 * Create Date : 5/31/2018
 */
@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract MainActivity mainActivity();


}
