
public class Student {
int hak_num;
String name;
String major;
int grade;

Student(){
	
}
Student(int hak_num,String name,String major,int grade){
	this.hak_num=hak_num;
	this.name=name;
	this.major=major;
	this.grade=grade;
}
public String toString() {
	return hak_num+"\t"+name+"\t"+major+"\t"+grade;
}
}
