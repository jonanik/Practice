
import java.util.Scanner;
public class Home0219_03 {

	public static void main(String[] args) {

		

		  // 1.학생점수입력
		  // 2.학생수정
		  // 3.학생삭제
		  // 4.학생 검색
		  // 5.등수처리
		  // 6.종료

		  Student[] stu = new Student[2];
		  String name = "";
		  int kor = 0, eng = 0, math = 0;
		  Scanner scan = new Scanner(System.in);
		  int num=0;

		  while (true) {
		   System.out.println("1.학생점수입력   2. 학생수정");
		   System.out.println("원하는 정보를 입력하세요.>>");
		   num = scan.nextInt();
		   scan.nextLine();

		   switch (num) {
		   
		   case 1:
		    for (int i = 0; i < stu.length; i++) {
		     
		     System.out.println("이름을 넣으세요.>>");
		     name = scan.nextLine();
		     System.out.println("국어점수를 넣으세요.>>");
		     kor = scan.nextInt();
		     System.out.println("영어점수를 넣으세요.>>");
		     eng = scan.nextInt();
		     System.out.println("수학점수를 넣으세요.>>");
		     math = scan.nextInt();
		     scan.nextLine();
		     stu[i] = new Student(name, kor, eng, math);
		     
		     System.out.println(stu[i].name + " " + stu[i].total + " " + stu[i].avg);
		     
		    }

		    break;

		   case 2:
		    System.out.println("[ 학생 성적 수정  ]");
		    System.out.println("수정하려고 하는 학생명을 입력하세요.>>");
		    name = scan.nextLine();
		    loop3:
		    for(int i=0;i<stu.length;i++) {
		     if(stu[i].name.equals(name)) {
		      System.out.println(stu[i].name +"이 검색되었습니다.수정하고 싶은 번호를 입력하세요.>>");
		      System.out.println("1.국어점수   2.영어점수  3.수학점수");
		      switch (scan.nextInt()) {
		      case 1:
		       System.out.println("변경점수를 입력하세요.>>");
		       stu[i].kor = scan.nextInt();
		       scan.nextLine();
		       System.out.println("국어점수"+stu[i].kor+"변경되었습니다.");
		       break loop3;
		                        case 2:
		       
		       break;
		                        case 3:
		                         
		                         break;

		      default:
		       break;
		      }
		      
		     }else {
		      System.out.println("찾으려고 하는 학생이 없습니다. 다시 입력하세요.>>");
		     }
		    }

		    break;

		   default:
		    break;
		   }

		  }


	}

}
