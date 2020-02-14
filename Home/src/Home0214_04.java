import java.util.Scanner;

public class Home0214_04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자3개를 입력하세요.");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int	result=0;
		
		if(a>b) {
			result=a;
		}else if(b>c) {
			result=b;
		}else {
			result=c;
		}
		System.out.println(result);
	}

}
