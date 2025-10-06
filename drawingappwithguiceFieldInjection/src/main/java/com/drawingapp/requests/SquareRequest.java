package com.drawingapp.requests;

import javax.inject.Inject;

import com.drawingapp.services.DrawShape;

public class SquareRequest {

    // @Inject: Annotating the field like this will cause it to be injected directly upon construction (not null in doDrawShape)
    @Inject
    DrawShape d;

    public void makeRequest() {
        d.draw();
    }

    // When Guice needs to construct SquareRequest, it will call ALL "@Inject" annotated methods

    // Note that this method is still called ever after the Field is injected
    @Inject
    public void doDrawShape(DrawShape d) {
        final String myName = "doDrawShape";
        System.out.println(String.format("%s: this.d: %s", myName, this.d));
        this.d = d;
    }
}
