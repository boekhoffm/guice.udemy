package com.drawingapp.module;

import com.drawingapp.annotations.EdgeSize;
import com.drawingapp.annotations.SquareColorValue;
import com.drawingapp.providers.DrawSquareProvider;
import com.drawingapp.services.DrawShape;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DrawShape.class).toProvider(DrawSquareProvider.class).in(Scopes.SINGLETON);
        bind(String.class).annotatedWith(SquareColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeSize.class).toInstance(40);
    }

}
