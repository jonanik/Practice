package home.javalec.ex;

public class StuScore {

	String hakNum;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	StuScore(){}
	StuScore(String hakNum,int kor,int eng,int math){
		this.hakNum=hakNum;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.total=kor+eng+math;
		this.avg=total/3.0;
	}
	
}
