
import java.util.Scanner;
public class Home0219_03 {

	public static void main(String[] args) {

		

		  // 1.�л������Է�
		  // 2.�л�����
		  // 3.�л�����
		  // 4.�л� �˻�
		  // 5.���ó��
		  // 6.����

		  Student[] stu = new Student[2];
		  String name = "";
		  int kor = 0, eng = 0, math = 0;
		  Scanner scan = new Scanner(System.in);
		  int num=0;

		  while (true) {
		   System.out.println("1.�л������Է�   2. �л�����");
		   System.out.println("���ϴ� ������ �Է��ϼ���.>>");
		   num = scan.nextInt();
		   scan.nextLine();

		   switch (num) {
		   
		   case 1:
		    for (int i = 0; i < stu.length; i++) {
		     
		     System.out.println("�̸��� ��������.>>");
		     name = scan.nextLine();
		     System.out.println("���������� ��������.>>");
		     kor = scan.nextInt();
		     System.out.println("���������� ��������.>>");
		     eng = scan.nextInt();
		     System.out.println("���������� ��������.>>");
		     math = scan.nextInt();
		     scan.nextLine();
		     stu[i] = new Student(name, kor, eng, math);
		     
		     System.out.println(stu[i].name + " " + stu[i].total + " " + stu[i].avg);
		     
		    }

		    break;

		   case 2:
		    System.out.println("[ �л� ���� ����  ]");
		    System.out.println("�����Ϸ��� �ϴ� �л����� �Է��ϼ���.>>");
		    name = scan.nextLine();
		    loop3:
		    for(int i=0;i<stu.length;i++) {
		     if(stu[i].name.equals(name)) {
		      System.out.println(stu[i].name +"�� �˻��Ǿ����ϴ�.�����ϰ� ���� ��ȣ�� �Է��ϼ���.>>");
		      System.out.println("1.��������   2.��������  3.��������");
		      switch (scan.nextInt()) {
		      case 1:
		       System.out.println("���������� �Է��ϼ���.>>");
		       stu[i].kor = scan.nextInt();
		       scan.nextLine();
		       System.out.println("��������"+stu[i].kor+"����Ǿ����ϴ�.");
		       break loop3;
		                        case 2:
		       
		       break;
		                        case 3:
		                         
		                         break;

		      default:
		       break;
		      }
		      
		     }else {
		      System.out.println("ã������ �ϴ� �л��� �����ϴ�. �ٽ� �Է��ϼ���.>>");
		     }
		    }

		    break;

		   default:
		    break;
		   }

		  }


	}

}
