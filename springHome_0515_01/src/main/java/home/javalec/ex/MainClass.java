package home.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String config="classpath:appCTX.xml";
		AbstractApplicationContext ctx=new GenericXmlApplicationContext(config);
		StuInfo stuInfo=ctx.getBean("stuInfo",StuInfo.class);
		ArrayList<Student> list=stuInfo.list;
		StuScore score=ctx.getBean("score3",StuScore.class);
		
		for(int i=0; i<list.size();i++) {
			Student stu=list.get(i);
			if(stu.hakNum.equals(score.hakNum)) {
				System.out.println("학번:"+stu.hakNum);
				System.out.println("학번:"+stu.name);
				System.out.println("학번:"+stu.major);
				System.out.println("학번:"+stu.address);
				System.out.println("학번:"+stu.phone);
				System.out.println("학번:"+score.kor);
				System.out.println("학번:"+score.eng);
				System.out.println("학번:"+score.math);
				System.out.println("학번:"+score.total);
				System.out.println("학번:"+score.avg);
				
				
			}
			
		}

	}

}
