import java.util.Scanner;

public class Home0211_1 {

	public static void main(String[] args) {
		// ��ǥ���߱� ����
		Scanner scan = new Scanner(System.in);
		int in_x=0;
		int in_y=0;
	
		//���� ���� 0,1�� [3][3]�� score�迭�� ä���. ���� ��ǥ ������ �Ѵ�.
		int[][] score = new int[3][3];
		String[][] score_in = new String[3][3];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (int) (Math.random() * 2);
			}
		}
		//String ������ [3][3] 2���� �迭�� ���� ���� �ʰ� ����Ѵ�. ��ǥ�� ��ƼĿ�� ���� �Ͱ��� ������ �Ѵ�.
		while (true) {
			System.out.println("--------------");
			System.out.println("[��ǥ���߱� ����]");
			System.out.println("--------------");
			System.out.println("\t0\t1\t2");
			for (int i = 0; i < score_in.length; i++) {
				System.out.print(i + "\t");
				for (int j = 0; j < score_in[i].length; j++) {
					System.out.print(score_in[i][j] + "\t");
				}
				System.out.println();
			}
//			//��ǥ�� �Է��Ѵ�. �񱳴� ���� ��ǥ�� Score�� ���� �� 0,1������ �񱳸� �ϰ�  ��÷ �Ǵ� ���� null�� ǥ�õǾ��ִ� �ٷ� �� 2���� �迭���� �ϴ� �Ŵ�.
			//�� 2���� �迭 �ΰ��� �����ϴµ� �Ѱ��� �������� ���� �Ѱ��� ���� ���� �ʴ� ��. �������� ���� �Է��� ���� ���ϰ� ǥ�ø� null������ �ؼ� 
			//������ �ʾҴ� ��ƼĿ�� ����� �� ����� �巯���� �Ͱ� ���� ����� �� �� �ִ�.
			System.out.println("X��ǥ�� �Է��ϼ���>>(����):99");
			in_x=scan.nextInt();
			if(in_x==99) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}System.out.println("Y��ǥ�� �Է��ϼ���.");
			in_y=scan.nextInt();
			if(score[in_x][in_y]==1) {
				score_in[in_y][in_x]="��÷";
			}else {
				score_in[in_y][in_x]="��";
			}
			}

		

//		//2�����迭���� �ð�ǥ �ۼ� ����
//		String[][] Tt=new String[4][5];
//		Scanner scan=new Scanner(System.in);
//		for(int i=0; i<Tt.length; i++) {
//			for(int j=0;j<Tt[i].length;j++) {
//				System.out.println((i*5)+j+1+"��° ������ �Է��ϼ���.");
//					Tt[i][j]=scan.next();	
//			}
//		}
//		System.out.println("\t\t[�ð�ǥ]");
//		System.out.println("  ��  \tȭ\t��\t��\t��");
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
//		//�ζ� ����
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
