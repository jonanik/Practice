import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Home0312_01 {

	public static void main(String[] args) {
		ArrayList<Student> stu=new ArrayList<Student>();
		String[] subject= {"학번","이름","국어","영어","합계"};
		String[] name= {"리순신","오카모토","디아블로"};
		int[] kor= {100,80,90};
		int[] eng= {100,70,80};
		
		for(int i=0; i<name.length;i++) {
			stu.add(new Student(name[i],kor[i],eng[i]));
		}
		
		for(int i=0; i<subject.length;i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println();
		for(int i=0; i<name.length;i++) {
		System.out.println(stu.get(i));
		}
		
		
		Collection.sort(stu,new Student());
		
		
	}

}

class Student implements Comparator<Student>{
	static int count=0;
	int hakNum;
	String name;
	int kor;
	int eng;
	int total;
	
	
	
	Student(){
		
	}
	Student(String name,int kor,int eng){
		this.hakNum=++count;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.total=kor+eng;
		
	}
	@Override
	public String toString() {
		return hakNum +"\t" +name +"\t"+ kor+"\t" + eng+"\t" + total;
				
	}
	@Override
	public int compare(Student s1, Student s2) {
		if(s1.total<s2.total) {
			return 1;
		}else if(s1.total>s2.total) {
			return -1;
		}
		return 0;
	}
	
	
}