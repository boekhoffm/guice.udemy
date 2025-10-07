package com.drawingapp.requests;

import javax.inject.Inject;
import javax.inject.Named;

import com.drawingapp.annotations.Circle;
import com.drawingapp.services.DrawShape;

public class CircleRequest {	
	DrawShape d;
	
	@Inject
	public CircleRequest(@Named("Circle") DrawShape d){
		this.d = d;
	}
	public void makeRequest(){
		d.draw();
	}	
}
