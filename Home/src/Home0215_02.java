import java.util.Scanner;

public class Home0215_02 {

	public static void main(String[] args) {

		//
		//16����(1~9�� ABCDEF) �Է��ؼ� 
		//charAt�� �Էµ� ���ڸ� �ѱ��ھ� ���� char������ 10�ǰ����� ���� �迭�� �ִ´�.
		//�迭���ٰ� �������� for���� ����ϴµ� i�� ���̴� �Էµ� ������ ���̷� �����Ͽ� 
		//�Է��� ��ŭ�� �迭�� ���� �Ѵ�.
		//�׷� �迭�� �Է��� 1~9 A~F������ 16������ ���Եȴ�.
		//2������ �迭�� String ���·� ���� �Է��Ѵ�. 
		//�񱳸� �Ѵ�. if���� ����Ͽ� char������ �迭 �� �Է��� String�� charAt�� ���� ��ȯ���� char������ �迭�� �־��� �� �迭��
		//1~9������ ���̸� result ��� String������ �迭�� result[i]= result[i]+binary[hex[i]-'0']
		//�� �Է����ش�.
		//���� A~F������ ���ڸ� result[i]=result[i]+binary[hex[i]-'A'+10]
		//�� �Է����ش�.
		//�׷��� �Ǹ� result�迭�� 16������ �Է��ߴ� ���� 2������ ��ȯ�Ǿ� �ϳ��� ����ǰ�
		//�װ� for������ i<�Է��� ������ �� ���ؼ� ����ϸ� �ȴ�.
		
		Scanner scan=new Scanner(System.in);
		String str="";
		char[] hex=new char[10];
		String[] result= new String[10];
		System.out.println("16������ �Է��ϼ���.");
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
		System.out.print("�Էµ� 16����:");
		for(int i=0; i<str.length();i++) {
			System.out.print(hex[i]+" ");
		}
		System.out.println();
		System.out.print("��ȯ�� 2����:");
		for(int i=0; i<str.length();i++) {
			System.out.print(result[i]+" ");
		}
			
			
		
		
		
		
		
		
		
	//	Scanner scan=new Scanner(System.in);
//		char[] hex=new char[10];
//		String str="";
//		String str1="";
//		System.out.println("10�����Ϸ� ���ڸ� �Է��ϼ���.(ABCDEF)>>");
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
