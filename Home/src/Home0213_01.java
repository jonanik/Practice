import java.util.Scanner;

public class Home0213_01 {

	public static void main(String[] args) {
		String[] name= new String[3];
		int[][]score= new int[3][3];
		double[]avg=new double[3];
		int[]rank=new int[3];
		int rank_count=1;
		String[]subject= {"이름","국어","영어","합계","평균","등수"};
		Scanner scan=new Scanner(System.in);
		
		for(int i=0; i<score.length;i++) {
			System.out.println("이름을 입력해주세요.");
			name[i]=scan.next();
			for(int j=0; j<score[i].length-1;j++) {
				System.out.println(subject[j+1]+"점수를 입력하세요.>>");
				score[i][j]=scan.nextInt();
				if(!(score[i][j]>=0&&score[i][j]<=100)) {
				j--;
				continue;
				}
				score[i][score[i].length-1]+=score[i][j];
			}
			avg[i]=score[i][score[i].length-1]/(score[i].length-1);
		}
		for(int i=0; i<score.length;i++) {
			rank_count=1;
			for(int j=0; j<score.length;j++) {
				if(score[i][score[i].length-1]<score[j][score[i].length-1]) {
					rank_count++;
				}
			}
			rank[i]=rank_count;
		}
		for(int i=0; i<subject.length; i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println();
		for(int i=0; i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(avg[i]+"\t");
			System.out.print(rank[i]+"\t");
			System.out.println();
		}
	}//main

}//class
