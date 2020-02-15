import java.util.Scanner;

public class Home0215_02 {

	public static void main(String[] args) {

		//
		//16진수(1~9와 ABCDEF) 입력해서 
		//charAt로 입력된 문자를 한글자씩 빼서 char형태의 10의공간을 가진 배열에 넣는다.
		//배열에다가 넣을때는 for문을 사용하는데 i의 길이는 입력된 문자의 길이로 설정하여 
		//입력한 만큼만 배열로 들어가게 한다.
		//그럼 배열에 입력한 1~9 A~F까지의 16진수가 들어가게된다.
		//2진수의 배열을 String 형태로 직접 입력한다. 
		//비교를 한다. if문을 사용하여 char형태의 배열 즉 입력한 String을 charAt를 통해 변환시켜 char형태의 배열에 넣었던 그 배열이
		//1~9사이의 값이면 result 라는 String형태의 배열에 result[i]= result[i]+binary[hex[i]-'0']
		//로 입력해준다.
		//만약 A~F사이의 문자면 result[i]=result[i]+binary[hex[i]-'A'+10]
		//로 입력해준다.
		//그렇게 되면 result배열에 16진수로 입력했던 수가 2진수로 변환되어 하나씩 저장되고
		//그걸 for문으로 i<입력한 글자의 수 로해서 출력하면 된다.
		
		Scanner scan=new Scanner(System.in);
		String str="";
		char[] hex=new char[10];
		String[] result= new String[10];
		System.out.println("16진수를 입력하세요.");
		str=scan.next();
		for(int i=0; i<str.length();i++) {
		hex[i]=str.charAt(i);
		}
		String[] binary= {
				"0000","0001","0010","0011",
				"0100","0101","0110","0111",
				"1000","1001","1010","1011",
				"1100","1101","1110","1111"
		};
		for(int i=0;i<str.length();i++) {
			if(hex[i]>='0'&&hex[i]<='9') {
				result[i]=binary[hex[i]-'0'];
			}else {
				result[i]=binary[hex[i]-'A'+10];
			}
		}
		System.out.print("입력된 16진수:");
		for(int i=0; i<str.length();i++) {
			System.out.print(hex[i]+" ");
		}
		System.out.println();
		System.out.print("변환된 2진수:");
		for(int i=0; i<str.length();i++) {
			System.out.print(result[i]+" ");
		}
			
			
		
		
		
		
		
		
		
	//	Scanner scan=new Scanner(System.in);
//		char[] hex=new char[10];
//		String str="";
//		String str1="";
//		System.out.println("10개이하로 문자를 입력하세요.(ABCDEF)>>");
//		str=scan.next();
//		for(int i=0;i<str.length();i++) {
//			hex[i]=str.charAt(i);
//		}
//		String[]binary= {
//				"0000","0001","0010","0011",
//				"0100","0101","0110","0111",
//				"1000","1001","1010","1011",
//				"1100","1101","1110","1111"
//		};
//		String result="";
//		for(int i=0;i<str.length();i++) {
//			if(hex[i]>='0'&&hex[i]<='9') {
//				result=result+binary[hex[i]-'0']+"";
//			}
//			else {
//				result=result+binary[(hex[i]-'A')+10]+"";
//			}
//		}
//		for(int i=0;i<str.length();i++) {
//			System.out.print(hex[i]+" ");
//		}
//		System.out.println();
//		System.out.println(result+" ");
	}

}
