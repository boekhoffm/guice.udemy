package com.drawingapp.module;

import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        // bind(DrawShape.class).to(DrawSquare.class);
    }

    @Provides
    DrawShape providesDrawSquare() {
        DrawShape d = new DrawSquare("Red", 40);
        return d;
    }

}
