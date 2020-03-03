
public class StuScore extends Student {
int kor;
int eng;
int total;
double avg;


StuScore(){
}
StuScore(int kor,int eng){
	this.kor=kor;
	this.eng=eng;
	this.total=kor+eng;
	this.avg=total/2;
}


}
