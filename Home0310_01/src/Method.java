import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Method implements BoardInterface {
	

public	String main() {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("�޹��� �Խ����Դϴ�.");
	System.out.println("1.�α���   2.�� �ۼ�  3.�Խñ� Ȯ��");
	System.out.println("4.�Խñ� �˻�   5.�Խñ� ����  6.�Խñ� ����");
	System.out.println("0.�Խ��� �����ϱ�");
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
	System.out.println("�̸��� �Է��ϼ���.(����:0)");
	String name=scan.next();
	scan.nextLine();
	if(name.equals("0")) {
		return;
	}
	System.out.println("������ �Է��ϼ���.");
	String subject=scan.nextLine();
	scan.nextLine();
	System.out.println("�������� �Է��ϼ���.");
	String contents=scan.nextLine();
	board.add(new Board(num,name,subject,contents,date,0));
	num++;
	}
}

public void see(ArrayList<Board> board) {

	System.out.println("NO"+"\t"+"�ۼ���"+"\t"+"����"+"\t\t"+"����"+"\t\t\t"+"�ۼ���¥"+"\t\t\t"+"��ȸ��");
	for(int i=0; i<board.size();i++) {
		System.out.println(board.get(i));
	}
	return;
}
	
	
}
