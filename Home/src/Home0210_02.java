import java.util.Scanner;

public class Home0210_02 {

	public static void main(String[] args) {
		int[] user_card = new int[10];// ����ī�� 10��
		int user_select_card = 0;
		int[] com_card = new int[10];
		int com_index = 0;
		int temp = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		// ���� 1~10 �Է�
		for (int i = 0; i < 10; i++) {
			user_card[i] = i + 1;
			com_card[i] = i + 1;
		}
		// ��ǻ�� ī�带 ����
		for (int i = 0; i < 200; i++) {
			com_index = (int) (Math.random() * 10);
			temp = com_card[0];
			com_card[0] = com_card[com_index];
			com_card[com_index] = temp;
		}
		Scanner scan = new Scanner(System.in);
//user_card ��ȣ�Է¹޾Ƽ� com_card��
		for(int i=0;i<10;i++) {
			System.out.println("1)1 2)2 3)3 4)4 5)5 6)6 7)7 8)8 9)9 10)10 ");
			System.out.println("ī�带 1~10�� ī�� 1���� �̾��ּ���.");
			user_select_card=scan.nextInt();
			if(user_card[user_select_card-1]==com_card[i]) {
				System.out.println((i+1)+"��° : �¸�");
				System.out.println("user_card:"+user_card[user_select_card-1]+"| com_card:"+ com_card[i]);
				user_card[user_select_card-1]=0;
				win++;
				
			}else if(user_card[user_select_card-1]==com_card[i]) {
				System.out.println((i+1)+"��°: ���º�");
				user_card[user_select_card-1]=0;
				draw++;
				
			}else {
				System.out.println((i+1)+"��°: �й�");
				user_card[user_select_card-1]=0;
				lose++;
			}
			
			
		}//for
	}//main

}//class
