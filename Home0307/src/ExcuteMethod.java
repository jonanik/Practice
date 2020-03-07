import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

public class ExcuteMethod implements Excute {

	@Override // 메인메뉴
	public int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("쇼핑몰 메인");
		System.out.println("1.회원가입    2.로그인   3.로그아웃");
		System.out.println("4.상품구매   5.구매목록 확인");
		System.out.println("6.회원정보보기  7.회원검색");
		System.out.println("0.쇼핑 끝내기");
		int select = scan.nextInt();
		return select;
		// TODO Auto-generated method stub

	}

	@Override // 회원가입
	public void join(ArrayList<Member> member, HashMap<String, String> loginId) {
		Scanner scan = new Scanner(System.in);
		String id;
		String psw;

		if (loginId.get("id") != null) {
			System.out.println("로그인중엔 회원가입을 할 수 없습니다.");
			return;
		}
		Calendar now = Calendar.getInstance();
		String date = now.get(Calendar.YEAR) + "-" + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-"
				+ now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND);

		re: while (true) {
			System.out.println("ID를 입력해주세요.(이전 메뉴:0)");
			id = scan.next();
			if (id.equals("0")) {
				return;
			}
			for (int i = 0; i < member.size(); i++) {
				if (id.equals(member.get(i).id)) {
					System.out.println("같은 ID가 존재합니다 . 다시 입력하세요.");
					continue re;
				}
			}

			if (id.length() < 3) {
				System.out.println("3글자 이상으로 입력해주세요.");
			}
			break;
		}
		re1: while (true) {
			System.out.println("비밀번호를 입력해주세요");
			psw = scan.next();
			if (psw.length() < 3) {
				System.out.println("비밀번호를 3자리 이상으로 입력해주세요.");
				continue re1;
			}
			int checkCount = 0;
			for (int i = 0; i < psw.length(); i++) {
				if (psw.charAt(i) > 'A' && psw.charAt(i) < 'Z') {
					checkCount++;
				}
			}
			if (checkCount == 0) {
				System.out.println("비밀번호에 1개이상의 대문자를 입력해주세요.");
				continue re1;
			}
			break;
		}
		System.out.println("이름을 입력하세요.");
		String name = scan.next();
		member.add(new Member(id, psw, name, 0, date));
		System.out.println(id + "님" + "회원가입이 완료되었습니다.");
		return;
	}

	@Override // 로그인
	public void logIn(ArrayList<Member> member, HashMap<String, String> loginId) {
		Scanner scan = new Scanner(System.in);
		String id;
		String psw;
		if (loginId.get("id") != null) {
			System.out.println("로그인이 되어있는 상태입니다.");
			return;
		}

		re: while (true) {
			System.out.print("ID를 입력하세요(이전:0)");
			id = scan.next();
			if (id.equals("0")) {
				return;
			}
			System.out.print("PSW를 입력하세요.(이전:0)");
			psw = scan.next();
			if (psw.equals("0")) {
				return;
			}
			for (int i = 0; i < member.size(); i++) {
				if (id.equals(member.get(i).id) && psw.equals(member.get(i).psw)) {
					loginId.put("id", id);
					System.out.println("로그인 되었습니다.");
					System.out.println("---------------------------");
					return;
				}
				if (i + 1 == member.size()) {
					System.out.println("ID또는 비밀번호가 틀렸습니다. 다시 입력해주세요.");
					continue re;
				}
			}

		}

	}

	@Override // 로그아웃
	public void logout(HashMap<String, String> loginId) {
		if (loginId.get("id") == null) {
			System.out.println("로그인 한 상태가 아닙니다.");
		} else {
			loginId.clear();
			System.out.println("로그아웃 되었습니다.");
			return;
		}

	}

	@Override // 회원정보 검색
	public void searchMem(ArrayList<Member> member) {
		Scanner scan = new Scanner(System.in);
		re: while (true) {
			System.out.print("검색할 회원의 이름을 입력하세요.(이전:0)");
			String name;

			name = scan.next();
			if (name.equals("0")) {
				System.out.println("-----------------------------");
				return;
			}
			for (int i = 0; i < member.size(); i++) {
				if (name.equals(member.get(i).name)) {
					System.out.println(member.get(i));
					continue re;
				}
				if (i + 1 == member.size()) {
					System.out.println("존재하지 않는 회원입니다.");
				}

			}

		}
	}
	@Override//회원정보 보기
	public void showMem(ArrayList<Member> member,Admin a) {
		Scanner scan=new Scanner(System.in);
		System.out.println("관리자 아이디를 입력하세요.");
		String id=scan.next();
		System.out.println("관리자 비밀번호를 입력하세요.");
		String psw=scan.next();
		if(id.equals(a.adminId)&&psw.equals(a.adminPsw)) {
			System.out.println("환영합니다. 관리자님 정보를 확인하세요.");
			for(int i=0;i<member.size();i++) {
				System.out.println(member.get(i));
			}
		}else {
			System.out.println("관리자만이 확인가능합니다.");
			return;
		}
		
		
	}
		
}

class Admin{
final	String adminId="yo";
final String adminPsw="123";

}
