import java.util.Scanner;

public class Home0207_04 {

	public static void main(String[] args) {
		// 1~100까지 숫자 맞추기 게임
		// 1~100까지 아무 숫자 입력
		// Math.random()을 이용하여 랜덤숫자 받아오기
		// output ) 게임 시작!
		// input ) 숫자를 입력해주세요[0<?<101] : 50
		// output ) 50보다 높습니다.
		// input ) 숫자를 입력해주세요[50<?<101] : 75
		// output ) 70보다 낮습니다.
		// input ) 숫자를 입력해주세요[50<?<75] : 63
		// output ) 정답입니다!

		Scanner sc = new Scanner(System.in);
		int input = 0;
		int o = 0;
		int out=0;
		int count=0;
		o = (int)( Math.random() * 100 + 1);

	loop1:	while (true) {
			System.out.println("[1~100까지 숫자맞추기 게임]");
			System.out.println("1~100사이의 숫자를 입력해주세요(끝내기:0)");
			while(true) {
			input = sc.nextInt();
			
			if(input==0) {
				System.out.println("게임을 종료합니다.");
				break loop1;
			}
			if (!(input >= 1 && input <= 100)) {
				System.out.println("1~100까지 숫자중에 다시 입력하세요");
				continue;
			}if(input>o) {
				System.out.printf("입력한 숫자:%d 입니다.%n",input);
				System.out.println(input+"보다 낮습니다.");
				count+=1;
				continue;
			}else if(input<o) {
				System.out.printf("입력한 숫자:%d 입니다.%n",input);
				System.out.println(input+"보다 높습니다.");
				count+=1;
				continue;
			}else if(input==o) {
				System.out.printf("입력한 숫자:%d 입니다.%n",input);
				System.out.println((count+1)+"회만에...");
				System.out.printf("%d!!!!정답입니다!!!(재게임:99/ 끝내기:0)",o);
				System.out.println();
				
				
				out=sc.nextInt();
				if(out==99) {
					continue loop1;
				}else if(out==0) {
					System.out.println("게임을 종료합니다.");
					break loop1;
				}
			}
		}//작은 while
		}//큰 while
		System.out.println();
	}//main

}//class
