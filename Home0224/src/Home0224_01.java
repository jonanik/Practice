import java.util.Scanner;

public class Home0224_01 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Stu[] s=new Stu[5];
		
		System.out.println("���� ó�� ���α׷�");
		System.out.println("1.���� �Է�   2.���� ���");
		System.out.println("3.��������  4.���ó��");
		System.out.println("5. ���α׷� ����");
		int select=scan.nextInt();
		switch(select) {
		case 1:
			System.out.println("���� �Է�");
			for(int i=0; i<s.length; i++) {
				System.out.println("�̸��� �Է��ϼ���.");
				String name=scan.next();
				System.out.println("������ �Է��ϼ���.");
				int kor=scan.nextInt();
				System.out.println("������ �Է��ϼ���.");
				int eng=scan.nextInt();
				System.out.println("������ �Է��ϼ���.");
				int math=scan.nextInt();
				s[i]=new Stu(name,kor,eng,math,);
				
				
			}
			break;
		case 2:
			System.out.println("���� ���");
			break;
		case 3:
			System.out.println("���� ����");
			break;
		case 4:
			System.out.println("��� ó��");
			break;
		case 5:
			System.out.println("���α׷� ����");
			break;
			
		
		}

	}

}
