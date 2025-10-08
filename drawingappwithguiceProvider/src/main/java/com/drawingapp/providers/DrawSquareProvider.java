package com.drawingapp.providers;

import com.drawingapp.services.DrawSquare;
import com.google.inject.Provider;

public class DrawSquareProvider implements Provider<DrawSquare>{

	@Override
	public DrawSquare get() {		
		DrawSquare d = new DrawSquare("Red", 40);
		return d;
	}
}
