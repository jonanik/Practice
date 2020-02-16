import java.util.Scanner;

public class Home0216_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		char[] hex = new char[10];
		String[] binary = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };
		while (true) {
			System.out.println("16진수를 입력하세요(1~9,A~F)");
			input=scan.next();
			
			for (int i = 0; i < input.length(); i++) {
				hex[i] = input.charAt(i);
			}
			for (int i = 0; i < input.length(); i++) {
				if (hex[i] >= '0' && hex[i] <= '9') {
					System.out.print(binary[hex[i] - '0'] + " ");
				} else if (hex[i] >= 'A' && hex[i] <= 'F') {
					System.out.print(binary[(hex[i] - 'A') + 10] + " ");
				}

			}
			System.out.println();
		}
	}

}
