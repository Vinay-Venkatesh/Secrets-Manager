package com.secrets;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Launch implements RequestHandler<Object, Object> {
	public Object handleRequest(Object arg0, Context arg1) {
		Secrets secret = new Secrets(); 
		try {
			System.out.println("Secret-Value "+secret.getSecrets()); 
		}catch (Exception e) {  
			return e.getMessage();
		}
		return "Success";
	}
}
