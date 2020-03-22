
public class Student {
static int count=0;;
int hakNum;
String name;
String major;
int kor;
int eng;
int math;
int total;
int avg;
int rank=0;;

{count++;
hakNum=count;
}


Student(){
	
}
Student(String name, String major, int kor, int eng,int math){
	this.name=name;
	this.major=major;
	this.kor=kor;
	this.eng=eng;
	this.math=math;
	this.total=kor+eng+math;
	this.avg=total/3;
	
}
@Override
public String toString() {
	return hakNum+"\t"+name+"\t"+major+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+rank;
}



}
