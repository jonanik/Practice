import java.util.Scanner;

public class Home0210_02 {

	public static void main(String[] args) {
		int[] user_card = new int[10];// 유저카드 10장
		int user_select_card = 0;
		int[] com_card = new int[10];
		int com_index = 0;
		int temp = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		// 숫자 1~10 입력
		for (int i = 0; i < 10; i++) {
			user_card[i] = i + 1;
			com_card[i] = i + 1;
		}
		// 컴퓨터 카드를 섞기
		for (int i = 0; i < 200; i++) {
			com_index = (int) (Math.random() * 10);
			temp = com_card[0];
			com_card[0] = com_card[com_index];
			com_card[com_index] = temp;
		}
		Scanner scan = new Scanner(System.in);
//user_card 번호입력받아서 com_card비교
		for(int i=0;i<10;i++) {
			System.out.println("1)1 2)2 3)3 4)4 5)5 6)6 7)7 8)8 9)9 10)10 ");
			System.out.println("카드를 1~10중 카드 1개를 뽑아주세요.");
			user_select_card=scan.nextInt();
			if(user_card[user_select_card-1]==com_card[i]) {
				System.out.println((i+1)+"번째 : 승리");
				System.out.println("user_card:"+user_card[user_select_card-1]+"| com_card:"+ com_card[i]);
				user_card[user_select_card-1]=0;
				win++;
				
			}else if(user_card[user_select_card-1]==com_card[i]) {
				System.out.println((i+1)+"번째: 무승부");
				user_card[user_select_card-1]=0;
				draw++;
				
			}else {
				System.out.println((i+1)+"번째: 패배");
				user_card[user_select_card-1]=0;
				lose++;
			}
			
			
		}//for
	}//main

}//class
