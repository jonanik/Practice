import java.util.Scanner;

public class Home0211_02 {

	public static void main(String[] args) {
		
		int[][] score=new int[5][5];
		String[][] score_in=new String[5][5];
		int random=0;
		int x=0;
		int y=0;
		int win=0;
		int lose=0;
		int count=0;
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				score[i][j]=(int)(Math.random()*2);
			}
		}
//		for(int i=0; i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j]+"\t");
//		}
//			System.out.println();
//		}
		while(true) {
			System.out.println("[��ǥ���߱�]");
			System.out.println("\t0\t1\t2\t3\t4");
			for(int i=0;i<score_in.length;i++) {
				System.out.print(i+"\t");
				for(int j=0; j<score_in[i].length;j++) {
					System.out.print(score_in[i][j]+"\t");
				}
				System.out.println();
			}
			
			System.out.println("X��ǥ�� �Է��ϼ���.(��������:99)");
			x=scan.nextInt();
			if(x==99) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
			System.out.println("Y��ǥ�� �Է��ϼ���.");
			y=scan.nextInt();
			if(score[y][x]==1) {
				score_in[y][x]="��÷";
				win++;
			}else {
				score_in[y][x]="��";
				lose++;
			}
			count++;
		}//while
		System.out.printf("��÷ Ƚ��: %d%n",win);
		System.out.printf("�� Ƚ��: %d%n",lose);
		System.out.printf("�� �õ� Ƚ��: %d%n",count);
	}

}
