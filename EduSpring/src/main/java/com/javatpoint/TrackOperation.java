package com.javatpoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TrackOperation{
	public void myadvice(JoinPoint jp,Object result)//it is advice (after advice)
	{
		System.out.println("additional concern");
		System.out.println("Method Signature: "  + jp.getSignature());
		System.out.println("Result in advice: "+result);
		System.out.println("end of after returning advice...");
	}
	
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable
	{
        System.out.println("Additional Concern Before calling actual method"); 
        Object obj=pjp.proceed();  
        System.out.println("Additional Concern After calling actual method");  
        return obj;  
	}	
}
