import java.util.Scanner;

public class Home0223_04 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Student[] s=new Student[3];
		int stu_count=0;
		for(int i=0; i<s.length;i++) {
			System.out.println("이름을 입력하세요.");
			String name=scan.next();
			System.out.println("국어점수를 입력하세요.");
			int kor=scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			int eng=scan.nextInt();
			System.out.println("국어점수를 입력하세요.");
			int math=scan.nextInt();
			int total=kor+eng+math;
			double avg=(kor+eng+math)/3;
			stu_count++;
			s[i]=new Student(name,kor,eng,math,total,avg);
		}
//		for(int i=0; i<stu_count;i++) {
//			System.out.println(Student.stu_num;
//		}
		for(int i=0; i<stu_count;i++) {
			System.out.println(s[i].name+"\t"+s[i].kor+"\t"+s[i].eng+"\t"+s[i].math+"\t"+s[i].total+"\t"+s[i].avg+"\t");
		}
	}

}
