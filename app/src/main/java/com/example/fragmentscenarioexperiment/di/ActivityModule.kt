package com.example.fragmentscenarioexperiment.di

import com.example.fragmentscenarioexperiment.MainActivity
import com.example.fragmentscenarioexperiment.di.scopes.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    @ActivityScope
    abstract fun contributeMainActivity(): MainActivity
}