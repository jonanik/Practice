import java.util.Scanner;

public class Home0214_02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int select=0;
		int stu_count=0;
		String[] name= new String[10];
		String input_quit="";
		String[] subject= {"이름","국어","영어","수학","과학","합계","평균","등수"};
		
		int[][] score=new int[10][5];
		double[] avg=new double[10];
		int rank[]=new int[10];
		int rank_count=0;
		
		loop1:
	while(true) {
		System.out.println("[성적 처리 프로그램]");
		System.out.println("1.성적입력");
		System.out.println("2.성적 출력");
		System.out.println("3.등수확인");
		System.out.println("0.프로그램 종료");
		System.out.println("메뉴를 선택하세요.");
		select=scan.nextInt();
		switch(select) {
		case 1:
			System.out.println("[성적입력을 선택하셨습니다.]");
			for(int i=0; i< name.length;i++) {
				System.out.println("이름을 입력하세요(입력 끝내기:99)");
				input_quit=scan.next();
				name[i]=input_quit;
				if(input_quit.equals("99")) {
					System.out.println("상위 메뉴로 이동합니다.");
					continue loop1;
				}
				for(int j =0; j<score[i].length-1;j++) {
					System.out.println(subject[j+1]+"성적을 입력하세요.");
					score[i][j]=scan.nextInt();
					score[i][score[i].length-1]+=score[i][j];
				}
				 avg[i]=score[i][4]/4;
				 stu_count++;
				}
			break;
		case 2:
			System.out.println("[성적출력을 선택하셨습니다.]");
			
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
			System.out.println("[등수확인을 선택하셨습니다.]");
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
			System.out.println("시스템을 종료합니다.");
			
			break loop1;
			
		}//switch
	}//while
	}//main

}//class
