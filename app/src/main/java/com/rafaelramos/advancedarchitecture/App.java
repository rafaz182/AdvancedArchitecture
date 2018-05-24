package com.rafaelramos.advancedarchitecture;

import android.app.Application;

import com.rafaelramos.advancedarchitecture.core.AppComponent;
import com.rafaelramos.advancedarchitecture.core.DaggerAppComponent;
import com.rafaelramos.advancedarchitecture.di.AppModule;

public class App extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }
}
