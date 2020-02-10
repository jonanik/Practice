import java.util.Scanner;



public class Home0210_01 {

	public static void main(String[] args) {
//로또 프로그램 복습 배열
		
		int temp=0;
		int ball_index=0;
		int[] num= new int[2];
		int[]win_num= new int[2];
		int success=0;
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {//2개의 로또번호 입력 받음
			for(int i=0; i<2;i++) {
				System.out.println("1~45까지 로또번호를 입력하세요.");
				num[i]=scan.nextInt();
				if(!(num[i]>=1&&num[i]<=45)) {
					System.out.println("번호가 잘못 입력되었습니다. 다시입력");
					i--;
					continue;
				}
			}
		
	break;
		}//로또 번호 형성과 셔플
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
		//입력한 번호랑 로또번호랑 확인
		for(int i=0; i<num.length;i++) {
			for(int j=0; j<6;j++) {
				if(num[i]==ball[j]) {
					success++;
					win_num[i]=num[i];
					
				}
			}
		}
//로또 번호 출력
	System.out.println("로또 번호는?");
	for(int i=0; i<6;i++) {
		System.out.print(ball[i]+" ");
	}
	System.out.println()
	;
	//당첨됬는지 확인
	if(success==0) {
		System.out.println("당첨되지 않았습니다.");
	}else {
		System.out.println("당첨되었습니다.");
	}for(int i=0;i<win_num.length; i++) {
		if(!(win_num[i]==0)) {
			System.out.println("당첨번호:"+win_num[i]);
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
//		while(true) {//두번 입력
//			for(int i=0;i<2;i++) {
//				System.out.println("1~45까지 로또번호를 입력하세요.");
//				num[i]=scan.nextInt();
//				if(!(num[i]>=1||num[i]<=45)) {
//					System.out.println("번호가 잘못 입력되었습니다. 다시입력");
//					i--;
//					continue;
//				}//if
//			}//for
//			break;
//		}//45개 의 배열 생성
//		int[]ball=new int[45];
//		for(int i=0; i<45;i++) {
//			ball[i]=i+1;
//		}
//		
//		//로또번호 자리 교환
//		for(int i=0; i<200;i++) {
//			ball_index=(int)(Math.random()*45);
//			temp=ball[0];
//			ball[0]=ball[ball_index];
//			ball[ball_index]=temp;
//			
//		}
//		//입력번호와 로또번호 확인
//		for(int i=0;i<num.length;i++) {
//			for(int j=0;j<6;j++) {
//				if(num[i]==ball[j]) {
//					success++;
//					win_num[i]=num[i];
//				
//				}
//			}
//		}
//		//로또 번호 출력
//		System.out.println("로또 번호는?");
//		for(int i=0;i<6;i++) {
//			System.out.print(ball[i]+" ");
//		}
//		System.out.println();
//		//당첨되었는지 확인
//		if(success==0) {
//			System.out.println("당첨되지 않았습니다.");
//		}else {
//			System.out.println("당첨되었습니다.");
//			for(int i=0;i<win_num.length;i++) {
//				if(!(win_num[i]==0)) {
//					System.out.println("당첨번호:"+ win_num[i]);
//				}
//			}
		
	}//main

}//class
