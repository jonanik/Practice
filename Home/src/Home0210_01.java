import java.util.Scanner;



public class Home0210_01 {

	public static void main(String[] args) {
//�ζ� ���α׷� ���� �迭
		
		int temp=0;
		int ball_index=0;
		int[] num= new int[2];
		int[]win_num= new int[2];
		int success=0;
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {//2���� �ζǹ�ȣ �Է� ����
			for(int i=0; i<2;i++) {
				System.out.println("1~45���� �ζǹ�ȣ�� �Է��ϼ���.");
				num[i]=scan.nextInt();
				if(!(num[i]>=1&&num[i]<=45)) {
					System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�. �ٽ��Է�");
					i--;
					continue;
				}
			}
		
	break;
		}//�ζ� ��ȣ ������ ����
		int[] ball=new int[45];
		for(int i=0;i<ball.length;i++) {
			ball[i]=i+1;
		}
		for(int i=0;i<200;i++ ) {
			ball_index=(int)(Math.random()*45);
			temp=ball[0];
			ball[0]=ball[ball_index];
			ball[ball_index]=temp;
		}
		//�Է��� ��ȣ�� �ζǹ�ȣ�� Ȯ��
		for(int i=0; i<num.length;i++) {
			for(int j=0; j<6;j++) {
				if(num[i]==ball[j]) {
					success++;
					win_num[i]=num[i];
					
				}
			}
		}
//�ζ� ��ȣ ���
	System.out.println("�ζ� ��ȣ��?");
	for(int i=0; i<6;i++) {
		System.out.print(ball[i]+" ");
	}
	System.out.println()
	;
	//��÷����� Ȯ��
	if(success==0) {
		System.out.println("��÷���� �ʾҽ��ϴ�.");
	}else {
		System.out.println("��÷�Ǿ����ϴ�.");
	}for(int i=0;i<win_num.length; i++) {
		if(!(win_num[i]==0)) {
			System.out.println("��÷��ȣ:"+win_num[i]);
		}
	}
	
//		int temp=0;
//		int ball_index=0;
//		int[] num=new int[2];
//		int[]win_num=new int[2];
//		
//		int success=0;
//		
//		Scanner scan=new Scanner(System.in);
//		while(true) {//�ι� �Է�
//			for(int i=0;i<2;i++) {
//				System.out.println("1~45���� �ζǹ�ȣ�� �Է��ϼ���.");
//				num[i]=scan.nextInt();
//				if(!(num[i]>=1||num[i]<=45)) {
//					System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�. �ٽ��Է�");
//					i--;
//					continue;
//				}//if
//			}//for
//			break;
//		}//45�� �� �迭 ����
//		int[]ball=new int[45];
//		for(int i=0; i<45;i++) {
//			ball[i]=i+1;
//		}
//		
//		//�ζǹ�ȣ �ڸ� ��ȯ
//		for(int i=0; i<200;i++) {
//			ball_index=(int)(Math.random()*45);
//			temp=ball[0];
//			ball[0]=ball[ball_index];
//			ball[ball_index]=temp;
//			
//		}
//		//�Է¹�ȣ�� �ζǹ�ȣ Ȯ��
//		for(int i=0;i<num.length;i++) {
//			for(int j=0;j<6;j++) {
//				if(num[i]==ball[j]) {
//					success++;
//					win_num[i]=num[i];
//				
//				}
//			}
//		}
//		//�ζ� ��ȣ ���
//		System.out.println("�ζ� ��ȣ��?");
//		for(int i=0;i<6;i++) {
//			System.out.print(ball[i]+" ");
//		}
//		System.out.println();
//		//��÷�Ǿ����� Ȯ��
//		if(success==0) {
//			System.out.println("��÷���� �ʾҽ��ϴ�.");
//		}else {
//			System.out.println("��÷�Ǿ����ϴ�.");
//			for(int i=0;i<win_num.length;i++) {
//				if(!(win_num[i]==0)) {
//					System.out.println("��÷��ȣ:"+ win_num[i]);
//				}
//			}
		
	}//main

}//class
