import java.util.Scanner;

public class Home0214_02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int select=0;
		int stu_count=0;
		String[] name= new String[10];
		String input_quit="";
		String[] subject= {"�̸�","����","����","����","����","�հ�","���","���"};
		
		int[][] score=new int[10][5];
		double[] avg=new double[10];
		int rank[]=new int[10];
		int rank_count=0;
		
		loop1:
	while(true) {
		System.out.println("[���� ó�� ���α׷�]");
		System.out.println("1.�����Է�");
		System.out.println("2.���� ���");
		System.out.println("3.���Ȯ��");
		System.out.println("0.���α׷� ����");
		System.out.println("�޴��� �����ϼ���.");
		select=scan.nextInt();
		switch(select) {
		case 1:
			System.out.println("[�����Է��� �����ϼ̽��ϴ�.]");
			for(int i=0; i< name.length;i++) {
				System.out.println("�̸��� �Է��ϼ���(�Է� ������:99)");
				input_quit=scan.next();
				name[i]=input_quit;
				if(input_quit.equals("99")) {
					System.out.println("���� �޴��� �̵��մϴ�.");
					continue loop1;
				}
				for(int j =0; j<score[i].length-1;j++) {
					System.out.println(subject[j+1]+"������ �Է��ϼ���.");
					score[i][j]=scan.nextInt();
					score[i][score[i].length-1]+=score[i][j];
				}
				 avg[i]=score[i][4]/4;
				 stu_count++;
				}
			break;
		case 2:
			System.out.println("[��������� �����ϼ̽��ϴ�.]");
			
			for(int i=0; i<subject.length;i++) {
				System.out.print(subject[i]+"\t");
			}
			System.out.println();
			
			for(int i=0; i< stu_count;i++) {
				System.out.print(name[i]+"\t");
				for(int j =0; j<score[i].length;j++) {
					System.out.print(score[i][j]+"\t");
				}
				System.out.print(avg[i]+"\t");
				System.out.println();
			}	
			break;
		case 3:
			System.out.println("[���Ȯ���� �����ϼ̽��ϴ�.]");
			for(int i=0; i<stu_count;i++) {
				rank_count=1;
				for(int j=0;j<stu_count;j++) {
					if(score[i][score[i].length-1]<score[j][score[i].length-1]) {
						rank_count++;
						
					}
					rank[i]=rank_count;
				}
			}
			for(int i=0; i<subject.length;i++) {
				System.out.print(subject[i]+"\t");
			}
			System.out.println();
			
			for(int i=0; i< stu_count;i++) {
				System.out.print(name[i]+"\t");
				for(int j =0; j<score[i].length;j++) {
					System.out.print(score[i][j]+"\t");
				}
				System.out.print(avg[i]+"\t");
				System.out.print(rank[i]+"\t");
				System.out.println();
			}	
			break;
		case 0:
			System.out.println("�ý����� �����մϴ�.");
			
			break loop1;
			
		}//switch
	}//while
	}//main

}//class
