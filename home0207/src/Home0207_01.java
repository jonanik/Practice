import java.util.Scanner;

public class Home0207_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String answer="";
		int i=0;
		int num=0;
		while(true) {
			System.out.println("�۵��ϴ°�(y/n)");
			answer=sc.next();
			if(answer.equals("y")||answer.equals("Y")) {
				System.out.println("�� �۵���");
				break;
			}if(answer.equals("n")||answer.equals("N")) {
				System.out.println("�ӿ� �� �ȵ�");
				continue;
			}
			
		}
		System.out.println("how many do you me to clap");
		num=sc.nextInt();
		System.out.println("���� �����Ű���? ��ǻ�� ������");
	for(i=1;i<=(num*10);i++) {
		System.out.println("¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦");
	}
	System.out.println("�峭�̿� �� �Ǵ� ����");
	
	}

}
