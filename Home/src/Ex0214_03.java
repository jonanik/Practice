import java.util.Scanner;

public class Ex0214_03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input="";
		char convert=' ';
		while(true) {
		System.out.println("�빮�ڳ� �ҹ��ڸ� �Է��ϼ���");
		input =scan.next();
		convert=input.charAt(0);
		if(convert>='a'&&convert<='z') {
			System.out.println((char)(convert-32));
		}else if(convert>='A'&&convert<='Z') {
			System.out.println((char)(convert+32));
		}else {
			System.out.println("�����Դϴ�.");
		}
		}
		

	}

}
