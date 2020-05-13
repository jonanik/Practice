package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new GenericXmlApplicationContext("classpath:appCTX.xml");
		MyInfo myInfo=ctx.getBean("myInfo",MyInfo.class);
		
		myInfo.getInfo();
		myInfo.bmiCalculation();

	}

}
