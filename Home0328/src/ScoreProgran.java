import java.util.ArrayList;

public class ScoreProgran {

	public static void main(String[] args) {
		ArrayList<Student> stuList=new ArrayList<Student>();
		Excute2 e=new Excute2();
		
		while(true) {
			switch (e.main()) {
			case "1":
				e.input(stuList);
				break;
			case "2":
				e.print(stuList);
				break;
			case "3":
				e.search(stuList);
				break;
			case "4":
				e.reinput(stuList);
				break;
			case "5":
				e.delete(stuList);
				break;
			case "0":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
				
			default:
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
		}

	}

}
