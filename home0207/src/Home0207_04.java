import java.util.Scanner;

public class Home0207_04 {

	public static void main(String[] args) {
		// 1~100���� ���� ���߱� ����
		// 1~100���� �ƹ� ���� �Է�
		// Math.random()�� �̿��Ͽ� �������� �޾ƿ���
		// output ) ���� ����!
		// input ) ���ڸ� �Է����ּ���[0<?<101] : 50
		// output ) 50���� �����ϴ�.
		// input ) ���ڸ� �Է����ּ���[50<?<101] : 75
		// output ) 70���� �����ϴ�.
		// input ) ���ڸ� �Է����ּ���[50<?<75] : 63
		// output ) �����Դϴ�!

		Scanner sc = new Scanner(System.in);
		int input = 0;
		int o = 0;
		int out=0;
		int count=0;
		o = (int)( Math.random() * 100 + 1);

	loop1:	while (true) {
			System.out.println("[1~100���� ���ڸ��߱� ����]");
			System.out.println("1~100������ ���ڸ� �Է����ּ���(������:0)");
			while(true) {
			input = sc.nextInt();
			
			if(input==0) {
				System.out.println("������ �����մϴ�.");
				break loop1;
			}
			if (!(input >= 1 && input <= 100)) {
				System.out.println("1~100���� �����߿� �ٽ� �Է��ϼ���");
				continue;
			}if(input>o) {
				System.out.printf("�Է��� ����:%d �Դϴ�.%n",input);
				System.out.println(input+"���� �����ϴ�.");
				count+=1;
				continue;
			}else if(input<o) {
				System.out.printf("�Է��� ����:%d �Դϴ�.%n",input);
				System.out.println(input+"���� �����ϴ�.");
				count+=1;
				continue;
			}else if(input==o) {
				System.out.printf("�Է��� ����:%d �Դϴ�.%n",input);
				System.out.println((count+1)+"ȸ����...");
				System.out.printf("%d!!!!�����Դϴ�!!!(�����:99/ ������:0)",o);
				System.out.println();
				
				
				out=sc.nextInt();
				if(out==99) {
					continue loop1;
				}else if(out==0) {
					System.out.println("������ �����մϴ�.");
					break loop1;
				}
			}
		}//���� while
		}//ū while
		System.out.println();
	}//main

}//class
