
public class Student {

	Student(){
		
	}
	Student(String n,int k,int e,int m,int t,double a){	
		name=n;
		kor=k;
		eng=e;
		math=m;
		total=t;
		avg=a;
	}
	
	static int stu_num=1000;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
}
