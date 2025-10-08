package com.drawingapp.module;

import com.drawingapp.annotations.EdgeSize;
import com.drawingapp.annotations.SquareColorValue;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(String.class).annotatedWith(SquareColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeSize.class).toInstance(40);

    }
}
