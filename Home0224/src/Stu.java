
public class Stu {
	static int count=0;
	int hak;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	{
		count++;
		hak=count;
	}
	
Stu(){
	
}
Stu(String name,int kor, int eng, int math, int total, double avg){
	this.name=name;
	this.kor=kor;
	this.eng=eng;
	this.math=math;
	this.total=kor+eng+math;
	this.avg=(kor+eng+math)/3;
	
}




}
