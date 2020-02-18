
public class Student {
static int stu_num=1000;
String stu_name;
int stu_kor;
int stu_eng;
int stu_math;
int total;
double avg;



void stu_info() {
	System.out.print(stu_num+"\t"+stu_name+"\t"+stu_kor+
					"\t"+stu_eng+"\t"+stu_math);
}

void total() {
	System.out.print("\t"+(stu_kor+stu_eng+stu_math));
}
void avg() {
	System.out.print("\t"+(stu_kor+stu_eng+stu_math)/3.0);
}

}
