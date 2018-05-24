package com.rafaelramos.advancedarchitecture.di;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    Context provideApplicationContext() {
        return application;
    }
}
