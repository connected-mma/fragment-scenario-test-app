package com.example.fragmentscenarioexperiment.di.scopes

import javax.inject.Scope

/**
 * Scope annotation for use with Dagger to indicate the dependency should be scoped to an Application component
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ApplicationScope