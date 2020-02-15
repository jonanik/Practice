import java.util.Scanner;

public class Home0215_03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input="";
		while(true) {
			System.out.println("대문자 또는 소문자를 입력하세요.");
		input=scan.next();
		char cha=input.charAt(0);
		
		if(cha>='a'&&cha<='z') {
			System.out.println((char)(cha-32));
		}else if(cha>='A'&&cha<='Z') {
			System.out.println((char)(cha+32));
		}
		}
	}

}
