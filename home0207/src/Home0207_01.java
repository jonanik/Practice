import java.util.Scanner;

public class Home0207_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String answer="";
		int i=0;
		int num=0;
		while(true) {
			System.out.println("¿€µø«œ¥¬∞°(y/n)");
			answer=sc.next();
			if(answer.equals("y")||answer.equals("Y")) {
				System.out.println("ø¿ ¿€µø«‘");
				break;
			}if(answer.equals("n")||answer.equals("N")) {
				System.out.println("∏”ø© ø÷ æ»µ≈");
				continue;
			}
			
		}
		System.out.println("how many do you me to clap");
		num=sc.nextInt();
		System.out.println("∏ª¿ª µÈ¿ª∞≈∞∞æ∆? ƒƒ«ª≈Õ ≈Õ¡Æ∂Û");
	for(i=1;i<=(num*10);i++) {
		System.out.println("¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶¬¶");
	}
	System.out.println("¿Â≥≠¿Ãø© ¿ﬂ µ«¥¬ ±∏∏∂");
	
	}

}
