import java.util.Scanner;

public class Home0224_01 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Stu[] s=new Stu[5];
		
		System.out.println("성적 처리 프로그램");
		System.out.println("1.성적 입력   2.성적 출력");
		System.out.println("3.성적수정  4.등수처리");
		System.out.println("5. 프로그램 종료");
		int select=scan.nextInt();
		switch(select) {
		case 1:
			System.out.println("성적 입력");
			for(int i=0; i<s.length; i++) {
				System.out.println("이름을 입력하세요.");
				String name=scan.next();
				System.out.println("국어을 입력하세요.");
				int kor=scan.nextInt();
				System.out.println("영어을 입력하세요.");
				int eng=scan.nextInt();
				System.out.println("수학을 입력하세요.");
				int math=scan.nextInt();
				s[i]=new Stu(name,kor,eng,math,);
				
				
			}
			break;
		case 2:
			System.out.println("성적 출력");
			break;
		case 3:
			System.out.println("성적 수정");
			break;
		case 4:
			System.out.println("등수 처리");
			break;
		case 5:
			System.out.println("프로그램 종료");
			break;
			
		
		}

	}

}
