import java.util.ArrayList;
import java.util.HashMap;

public class Mall {

	public static void main(String[] args) {
		Excute method = new ExcuteMethod();
		Admin a=new Admin();
		ArrayList<Member> member = new ArrayList<Member>();
		HashMap<String, String> loginId = new HashMap<String, String>();

	end:while (true) {
			switch (method.menu()) {
			case 1:// 회원가입
				method.join(member, loginId);
				break;
			case 2:// 로그인
				method.logIn(member, loginId);
				break;
			case 3:// 로그아웃
				method.logout(loginId);
				break;
			case 4:// 상품구매
				break;
			case 5:// 구매목록 확인
				break;
			case 6:// 회원정보보기
				method.showMem(member, a);
				break;
			case 7:// 회원 검색
				method.searchMem(member);
				break;
			case 0:// 쇼핑 종료
				System.out.println("쇼핑을 종료합니다.");
				break end;
				
			default:
				System.out.println("잘못된 정보를 입력하셨습니다.");
				break;

			}
		}

	}

}
