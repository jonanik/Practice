import java.lang.reflect.Array;
import java.util.ArrayList;

public class ScoreProcess {

	public static void main(String[] args) {
		ArrayList<Student> stuList = new ArrayList<Student>();
		ArrayList<Student> reinput = new ArrayList<Student>();
		String[] category= {"�й�","�̸�","�а�","����","����","����","�հ�","���","���"};
		
		Interface i = new Excute();

		while (true) {
			switch (i.main()) {
			case "1":
				i.inputScore(stuList);
				break;
			case "2":
				i.printScore(stuList,category);
				break;
			case "3":
				i.searchStu(stuList,reinput);
				break;
			case "4":
				i.rankprocess(stuList,category);
				break;
			case "0":
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;

			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
	}

}
