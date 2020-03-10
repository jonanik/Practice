import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Method implements BoardInterface {
	

public	String main() {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("앵무새 게시판입니다.");
	System.out.println("1.로그인   2.글 작성  3.게시글 확인");
	System.out.println("4.게시글 검색   5.게시글 삭제  6.게시글 수정");
	System.out.println("0.게시판 종료하기");
	String select=scan.next();
	return select;
}
	
	
public void write(ArrayList<Board> board) {
	
	Calendar now=Calendar.getInstance();
	String date=now.get(Calendar.YEAR)+"-"+(now.get(Calendar.MONTH)+1)+"-"+now.get(Calendar.DATE)+"||"+
	now.get(Calendar.HOUR_OF_DAY)+":"+now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND);
	
	int num=1;
	while(true) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("이름을 입력하세요.(이전:0)");
	String name=scan.next();
	scan.nextLine();
	if(name.equals("0")) {
		return;
	}
	System.out.println("제목을 입력하세요.");
	String subject=scan.nextLine();
	scan.nextLine();
	System.out.println("내용을을 입력하세요.");
	String contents=scan.nextLine();
	board.add(new Board(num,name,subject,contents,date,0));
	num++;
	}
}

public void see(ArrayList<Board> board) {

	System.out.println("NO"+"\t"+"작성자"+"\t"+"제목"+"\t\t"+"내용"+"\t\t\t"+"작성날짜"+"\t\t\t"+"조회수");
	for(int i=0; i<board.size();i++) {
		System.out.println(board.get(i));
	}
	return;
}
	
	
}
