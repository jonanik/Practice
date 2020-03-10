import java.util.ArrayList;

public class ParrotBoard {

	public static void main(String[] args) {
		ArrayList<Board> board=new ArrayList<Board>();
		BoardInterface m=new Method();
	while(true)	{
		switch(m.main()){
			case "1":
				break;
			case "2":
				m.write(board);
				break;
			case "3":
				m.see(board);
				break;
			case "4":
				break;
			case "5":
				break;
			case "6":
				break;
			case "0":
				break;
				default:
					System.out.println("잘못된 입력입니다.");
					break;
				
		}
	}
		
		
		

	}

}
