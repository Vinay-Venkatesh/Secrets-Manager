package com.secrets;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Launch implements RequestHandler<Object, Object> {
	//public static void main(String[] args) {
		
	public Object handleRequest(Object arg0, Context arg1) {
		Secrets secret = new Secrets(); 
		try {
			System.out.println("Secret-Value "+secret.getSecrets()); 
		}catch (Exception e) {  
			return e.getMessage();
		}
		return "Success";
	}
		 

		//Autoscaling autoscaling = new Autoscaling();
		//autoscaling.stopInstances();
		
		/*RDS rds = new RDS();
		rds.stopRds();*/
}
