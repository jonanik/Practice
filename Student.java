package home0419_01;

public class Student {
static int count=-1;
	int hakNum;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	
	{
		count++;
		hakNum=count;
	}
	
Student(){
	
}

Student(String name,int kor,int eng,int math){
	this.name=name;
	this.kor=kor;
	this.eng=eng;
	this.math=math;
	this.total=kor+eng+math;
	this.avg=total/3;
	this.rank=0;
}

@Override
public String toString() {
	return hakNum+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+rank;
}




}
