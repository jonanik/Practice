import java.util.Scanner;

public class Home0214_01 {

	public static void main(String[] args) {
		int temp=0;
		int ball_index=0;
		int[]num=new int[2];
		int[]win_num=new int[2];
		int success=0;
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			for(int i=0; i<3; i++) {
				System.out.println("��ȣ�� �Է��ϼ���");
				num[i]=scan.nextInt();
//				if(!(num[i]>=1&&num[i]<=45)) {
//					System.out.println("1~45���� �ζǹ�ȣ�� �Է��ϼ���.");
//					i--;
//					continue;
//				}
			}
			break;
		}
			int[] ball=new int[45];
			for(int i=0; i<ball.length; i++) {
				ball[i]=i+1;
			}
			for(int i=0; i<200; i++) {
				int j=(int)(Math.random()*45);
			 temp=ball[i];
			 ball[i]=ball[j];
			 ball[j]=temp;
			}
			for(int i=0; i<num.length;i++) {
				for(int j=0; j<6;j++) {
					if(num[i]==ball[j]) {
						success++;
						win_num[i]=num[i];
					}
					
				}
			}
			System.out.println("�ζ� ��ȣ��?");
			for(int i=0; i<6; i++) {
				System.out.println(num[i]+ " ");
			}
			System.out.println();
			
			if(success==0) {
				System.out.println("��÷���� �ʾҽ��ϴ�.");
			}else {
				System.out.println("��÷�Ǿ����ϴ�.");
				for(int i=0; i<win_num.length;i++) {
					System.out.println("��÷��ȣ:"+win_num[i]);
				}
			}
	}

}
