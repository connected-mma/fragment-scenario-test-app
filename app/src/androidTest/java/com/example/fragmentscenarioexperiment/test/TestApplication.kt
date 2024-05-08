package com.example.fragmentscenarioexperiment.test

import android.app.Application
import com.example.fragmentscenarioexperiment.di.DaggerTestComponent
import com.example.fragmentscenarioexperiment.di.TestComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class TestApplication : Application(), HasAndroidInjector {

    lateinit var component: TestComponent

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }

    override fun onCreate() {
        super.onCreate()
        component = DaggerTestComponent.builder()
            .application(this)
            .build()
            .also { testComponent ->
                testComponent.inject(this)
            }
    }
}