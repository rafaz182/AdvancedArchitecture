package com.rafaelramos.advancedarchitecture.core;

import com.rafaelramos.advancedarchitecture.di.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
}
