package com.jsp.aopconcept.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

///coming from the dependencies loaded not present in spring
@Aspect 
public class MyAspect {

	@Before("execution(* com.jsp.aopconcept.services.LoginImpl.login())")
	public void beforeLoginAlgoX() {
		
		System.out.println("Login is being validated by algo x...");
		
	}
	
	
	@After("execution(* com.jsp.aopconcept.services.LoginImpl.login())")
	public void afterLoginAlgoX() {
		
		System.out.println("Login is being validated by algo x...");
		
	}
	
}
