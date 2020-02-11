import java.util.Scanner;

public class Home0211_1 {

	public static void main(String[] args) {
		// 좌표맞추기 게임
		Scanner scan = new Scanner(System.in);
		int in_x=0;
		int in_y=0;
	
		//랜덤 숫자 0,1로 [3][3]의 score배열을 채운다. 실제 좌표 역할을 한다.
		int[][] score = new int[3][3];
		String[][] score_in = new String[3][3];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (int) (Math.random() * 2);
			}
		}
		//String 형식의 [3][3] 2차원 배열에 값을 넣지 않고 출력한다. 좌표에 스티커를 붙인 것같은 역할을 한다.
		while (true) {
			System.out.println("--------------");
			System.out.println("[좌표맞추기 게임]");
			System.out.println("--------------");
			System.out.println("\t0\t1\t2");
			for (int i = 0; i < score_in.length; i++) {
				System.out.print(i + "\t");
				for (int j = 0; j < score_in[i].length; j++) {
					System.out.print(score_in[i][j] + "\t");
				}
				System.out.println();
			}
//			//좌표를 입력한다. 비교는 실제 좌표인 Score의 내용 즉 0,1인지와 비교를 하고  당첨 또는 꽝은 null이 표시되어있는 바로 위 2차원 배열에다 하는 거다.
			//즉 2차원 배열 두개를 형성하는데 한개는 랜덤값이 들어가고 한개는 값이 들어가지 않는 다. 랜덤값고 내가 입력한 값을 비교하고 표시를 null값에다 해서 
			//보이지 않았던 스티커를 떼어내서 그 결과가 드러나는 것과 같은 모습을 볼 수 있다.
			System.out.println("X좌표를 입력하세요>>(종료):99");
			in_x=scan.nextInt();
			if(in_x==99) {
				System.out.println("시스템을 종료합니다.");
				break;
			}System.out.println("Y좌표를 입력하세요.");
			in_y=scan.nextInt();
			if(score[in_x][in_y]==1) {
				score_in[in_y][in_x]="당첨";
			}else {
				score_in[in_y][in_x]="꽝";
			}
			}

		

//		//2차원배열연습 시간표 작성 연습
//		String[][] Tt=new String[4][5];
//		Scanner scan=new Scanner(System.in);
//		for(int i=0; i<Tt.length; i++) {
//			for(int j=0;j<Tt[i].length;j++) {
//				System.out.println((i*5)+j+1+"번째 과목을 입력하세요.");
//					Tt[i][j]=scan.next();	
//			}
//		}
//		System.out.println("\t\t[시간표]");
//		System.out.println("  월  \t화\t수\t목\t금");
//		
//		for(int i=0; i<Tt.length; i++) {
//			for(int j=0;j<Tt[i].length;j++) {
//				
//				System.out.print(Tt[i][j]+"\t");
//		}
//			System.out.println();
//	}
//		
//		
//		
//		//로또 연습
//		int[] ball=new int[45];
//		for(int i=0; i<ball.length;i++) {
//			ball[i]=i+1;
//		}
//		int temp=0;
//		int j=0;
//		for(int i=0; i<200; i++) {
//			j=(int)(Math.random()*45);
//			temp=ball[0];
//			ball[0]=ball[j];
//			ball[j]=temp;
//		}
//		for(int i=0; i<6;i++) {
//			System.out.print(ball[i]+" ");
//		}
	}

}
