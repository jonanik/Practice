import java.util.Scanner;

public class Home0219_02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Student[] stu=new Student[10];
		int stu_count=0;
		String out="";
		String[] subject= {"�й�","�̸�","����","����","����","�հ�","���","���"};
	loop1:	
	while(true)	{
		
		manage_program();
		
		
		switch(scan.nextInt()){
		case 1:
			
			System.out.println("�����Է��� �����ϼ̽��ϴ�.");
			for(int i=0; i<stu.length;i++) {
				stu[i]=new Student();
				System.out.println("�̸��� �Է��ϼ���.");
				stu[i].stu_name=scan.next();
				System.out.print("���������� �Է��ϼ���.");
				stu[i].stu_kor=scan.nextInt();
				System.out.print("���������� �Է��ϼ���.");
				stu[i].stu_eng=scan.nextInt();
				System.out.print("���������� �Է��ϼ���.");
				stu[i].stu_math=scan.nextInt();
				stu_count++;
				System.out.println("�� �Է��Ͻðڽ��ϱ�?(y/n)");
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
	System.out.println("[����ó�� ���α׷�]");
	System.out.println("1.�����Է�");
	System.out.println("2.�������");
	System.out.println("3.���ó��");
	System.out.println("4.��������");
	System.out.println("0.���α׷� ����");
	System.out.println("�޴��� �����ϼ���.");
}
}
