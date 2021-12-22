package com.acecorp.test;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.acecorp.pojo.Number;

public class Test {

	public static void main(String[] args) {
		Number num = new Number();  
		StandardEvaluationContext context=new StandardEvaluationContext(num);  
		      
		ExpressionParser parser = new SpelExpressionParser();  
		parser.parseExpression("num").setValue(context,"5");  
		      
		System.out.println(num.cube());  
	}

}
