package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	//this is where we add all of our related advices for logging
	
	//let's start with an @Before advice
	
	// it is for addAccount method of any class
/*	@Before("execution(public void addAccount())")
	public void beforeAddAccountAdvice(){
		System.out.println("\n======>>> Executing @Before advice on addAccount()");
	}
	// it is for addAccount method of specified class
	@Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
	public void beforeAddAccountAdvice(){
		System.out.println("\n======>>> Executing @Before advice on addAccount()");
	}

	// it is for method started with add
	//wild card
	@Before("execution(public void add*())")
	public void beforeAddAccountAdvice(){
		System.out.println("\n======>>> Executing @Before advice on addAccount()");
	}

	// it is for any return type method
		//modifier are optional
	//single Account type param
		@Before("execution(* add*(com.luv2code.aopdemo.Account))")
		public void beforeAddAccountAdvice(){
			System.out.println("\n======>>> Executing @Before advice on addAccount()");
		}

		//one or more param
		@Before("execution(* add*(com.luv2code.aopdemo.Account,..))")
		public void beforeAddAccountAdvice(){
			System.out.println("\n======>>> Executing @Before advice on addAccount()");
		}
*/
		//
		@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
		public void beforeAddAccountAdvice(){
			System.out.println("\n======>>> Executing @Before advice on addAccount()");
		}
}
