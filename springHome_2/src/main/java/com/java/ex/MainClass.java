package com.java.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new GenericXmlApplicationContext("classpath:appCTX.xml");
		Temperature temp=ctx.getBean("temperature",Temperature.class);
		System.out.println("국가:"+temp.nav);
		System.out.println("섭씨"+temp.temp);
		temp.change();

	}

}
