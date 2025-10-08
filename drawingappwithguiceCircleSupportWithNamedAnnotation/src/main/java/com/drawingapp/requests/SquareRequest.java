package com.drawingapp.requests;

import javax.inject.Inject;
import javax.inject.Named;

import com.drawingapp.services.DrawShape;

public class SquareRequest {
    DrawShape d;

    @Inject
    public SquareRequest(@Named("Square") DrawShape d) {
        this.d = d;
    }

    public void makeRequest() {
        d.draw();
    }
}
