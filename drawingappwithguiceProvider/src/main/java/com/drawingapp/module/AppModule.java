package com.drawingapp.module;

import com.drawingapp.providers.DrawSquareProvider;
import com.drawingapp.services.DrawShape;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DrawShape.class).toProvider(DrawSquareProvider.class);
    }

}
