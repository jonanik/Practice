import java.util.Scanner;

public class Home0219_02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Student[] stu=new Student[10];
		int stu_count=0;
		String out="";
		String[] subject= {"학번","이름","국어","영어","수학","합계","평균","등수"};
	loop1:	
	while(true)	{
		
		manage_program();
		
		
		switch(scan.nextInt()){
		case 1:
			
			System.out.println("성적입력을 선택하셨습니다.");
			for(int i=0; i<stu.length;i++) {
				stu[i]=new Student();
				System.out.println("이름을 입력하세요.");
				stu[i].stu_name=scan.next();
				System.out.print("국어점수를 입력하세요.");
				stu[i].stu_kor=scan.nextInt();
				System.out.print("영어점수를 입력하세요.");
				stu[i].stu_eng=scan.nextInt();
				System.out.print("수학점수를 입력하세요.");
				stu[i].stu_math=scan.nextInt();
				stu_count++;
				System.out.println("더 입력하시겠습니까?(y/n)");
				out=scan.next();
				if(out.equals("y")) {
					continue;
				}else {
					continue loop1;
				}
			}
			break;
		case 2:
			for(int i=0; i<subject.length;i++) {
				System.out.print(subject[i]+"\t");
			}
			System.out.println();
			for(int i=0; i<stu_count;i++) {
				stu[i].stu_info();
				stu[i].total();
				stu[i].avg();
				Student.stu_num++;
				System.out.println();
			}
			
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		}
	}
	}
static void manage_program() {
	System.out.println("[성적처리 프로그램]");
	System.out.println("1.성정입력");
	System.out.println("2.성정출력");
	System.out.println("3.등수처리");
	System.out.println("4.성적수정");
	System.out.println("0.프로그램 종료");
	System.out.println("메뉴를 선택하세요.");
}
}
