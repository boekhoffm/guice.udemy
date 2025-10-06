package com.drawingapp.main;

import com.drawingapp.requests.SquareRequest;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;

public class GuiceDemo {
	
	private static final String SQAURE_REQ = "SQUARE";

	private static void sendRequest(String sqaureReq) {
		
		if(sqaureReq.equals(SQAURE_REQ)){
			DrawShape d = new DrawSquare();
			SquareRequest request = new SquareRequest(d);
			request.makeRequest();
			
		}
		
	}
	
	public static void main(String[] args) {
		
		sendRequest(SQAURE_REQ);
	}

	

}
