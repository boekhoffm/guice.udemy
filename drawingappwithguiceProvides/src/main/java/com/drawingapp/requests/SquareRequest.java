package com.drawingapp.requests;

import javax.inject.Inject;

import com.drawingapp.services.DrawShape;

public class SquareRequest {
    DrawShape d;

    public DrawShape getD() {
        return d;
    }

    public void setD(DrawShape d) {
        this.d = d;
    }

    @Inject
    public SquareRequest(DrawShape d) {
        this.d = d;
    }

    public void makeRequest() {
        d.draw();
    }
}
