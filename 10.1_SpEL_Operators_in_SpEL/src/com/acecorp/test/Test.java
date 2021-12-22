package com.acecorp.test;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		
		//arithmetics operators
		ExpressionParser parser = new SpelExpressionParser();
		System.out.println(parser.parseExpression("'Hello World'+' !!'").getValue());
		System.out.println(parser.parseExpression("10*5").getValue());
		System.out.println(parser.parseExpression("'Today is : '+new java.util.Date()").getValue());
		
		//logical operators
		System.out.println(parser.parseExpression("true and true").getValue());
		System.out.println(parser.parseExpression("true and false").getValue());
		
		//relationsl operators
		System.out.println(parser.parseExpression("'Akhil'.length() == 5").getValue());
		System.out.println(parser.parseExpression("'Akhil'.length() == 4").getValue());
		
	}

}
