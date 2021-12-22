package com.acecorp.test;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
//		ExpressionParser parser = new SpelExpressionParser();
//		Expression exp = parser.parseExpression("'Hello SpEL'");
//		
//		String message = exp.getExpressionString();
//		System.out.println(message);
		
		//*************************************
		
//		ExpressionParser parser = new SpelExpressionParser();  
//		Expression exp = parser.parseExpression("'Welcome SPEL!, '.concat('How are you?')");  
//		String message = (String) exp.getValue();  
//		System.out.println(message); 
		
		//*************************************
		
//		ExpressionParser parser = new SpelExpressionParser();
//		Expression exp = parser.parseExpression("'Hello World'.bytes");  
//		System.out.println(exp.getExpressionString());
//		byte[] bytes = (byte[]) exp.getValue();  
//		for(int i=0;i<bytes.length;i++){  
//		    System.out.print(bytes[i]+" ");  
//		} 
		
		//*************************************
		
//		ExpressionParser parser = new SpelExpressionParser();
//		Expression exp = parser.parseExpression("'Hello World'.bytes.length");  
//		int length = (Integer) exp.getValue();  
//		System.out.println(length); 
		
		//*************************************
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("new String('hello world').toUpperCase()");  
		String message = exp.getValue(String.class);  
		System.out.println(message);  
		
	}

}
