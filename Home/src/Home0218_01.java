import java.util.Scanner;

public class Home0218_01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] ball=new int[45];
		int[] input=new int[6];
		int[] win_num=new int[6];
		int win_count=0;
		for(int i=0; i<ball.length; i++) {
			ball[i]=i+1;
		}
		int random=0;
		int temp=0;
		
		for(int i=0; i<200; i++) {
			random=(int)(Math.random()*45);
			temp=ball[0];
			ball[0]=ball[random];
			ball[random]=temp;
		}

		for(int i=0; i<input.length; i++) {
			System.out.println(i+1+"��° ��ȣ�� �Է��ϼ���.");
			input[i]=scan.nextInt();
		}
		
		for(int i=0; i<input.length; i++) {
			for(int j=0; j<6;j++) {
				if(input[i]==ball[j]) {
					win_num[i]=ball[j];
					win_count++;
				}if(input[i]==ball[6]) {
					win_count++;
				}
			}
		}
		System.out.print("��÷��ȣ: ");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+" ");
		}System.out.println("+ ���ʽ� ��ȣ:"+ball[6]);
		System.out.print("�Է��� ��ȣ: ");
		for(int i=0; i<6;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		System.out.print("���� ��ȣ:");
		for(int i=0; i<6;i++) {
			if(win_count >0) {
			System.out.print(win_num[i]+" ");
		}	else {
			System.out.print("XXXX");
		}
		}
					
		System.out.println();
		System.out.println("-----------[��ǰ]-----------");
		if(win_count==6) {
			System.out.print("  ��÷��: 1,000,000,000��");
		}else if(win_count==5) {
			System.out.print("   ��÷��: 100,000,000��");
		}else if(win_count==4) {
			System.out.print("    ��÷��: 10,000,000��");
		}else if(win_count==3) {
			System.out.print("      ��÷��: 5,000��");
		}else if(win_count==2||win_count==1||win_count==0) {
			System.out.print("\t���Դϴ�.");
		}
	}
	}

