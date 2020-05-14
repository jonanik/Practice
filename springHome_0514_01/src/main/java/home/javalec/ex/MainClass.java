package home.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String config1="classpath:appCTX1.xml";
		String config2="classpath:appCTX2.xml";
		AbstractApplicationContext ctx=new GenericXmlApplicationContext(config1,config2);
		Student student1=ctx.getBean("student1",Student.class);
		StuInfo stuInfo=ctx.getBean("stuInfo",StuInfo.class);
		Student student2=stuInfo.getStudent();
		Student student3=ctx.getBean("student3",Student.class);
		Family family=ctx.getBean("family",Family.class);
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println(student1.getHobbys());
		System.out.println(student1.getHeight());
		System.out.println(student1.getWeight());
		System.out.println("----------------------");
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		System.out.println(student2.getHobbys());
		System.out.println(student2.getHeight());
		System.out.println(student2.getWeight());
		System.out.println("----------------------");
		System.out.println(student3.getName());
		System.out.println(student3.getAge());
		System.out.println(student3.getHobbys());
		System.out.println(student3.getHeight());
		System.out.println(student3.getWeight());
		System.out.println("----------------------");
		System.out.println(family.getFatherName());
		System.out.println(family.getMotherName());
		System.out.println(family.getSisterName());
		System.out.println(family.getBrotherName());

	}

}
