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
			System.out.println(i+1+"번째 번호를 입력하세요.");
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
		System.out.print("당첨번호: ");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+" ");
		}System.out.println("+ 보너스 번호:"+ball[6]);
		System.out.print("입력한 번호: ");
		for(int i=0; i<6;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		System.out.print("맞춘 번호:");
		for(int i=0; i<6;i++) {
			if(win_count >0) {
			System.out.print(win_num[i]+" ");
		}	else {
			System.out.print("XXXX");
		}
		}
					
		System.out.println();
		System.out.println("-----------[상품]-----------");
		if(win_count==6) {
			System.out.print("  당첨금: 1,000,000,000원");
		}else if(win_count==5) {
			System.out.print("   당첨금: 100,000,000원");
		}else if(win_count==4) {
			System.out.print("    당첨금: 10,000,000원");
		}else if(win_count==3) {
			System.out.print("      당첨금: 5,000원");
		}else if(win_count==2||win_count==1||win_count==0) {
			System.out.print("\t꽝입니다.");
		}
	}
	}

