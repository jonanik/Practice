import java.util.ArrayList;
import java.util.HashMap;

public class Mall {

	public static void main(String[] args) {
		Excute excute = new ExcuteImpl();
		ArrayList<Member> member = new ArrayList<Member>(); // 회원 리스트
		ArrayList<Product> product = new ArrayList<Product>(); // 상품 리스트
		ArrayList<BuyList> buyList = new ArrayList<BuyList>(); // 구매 리스트
		HashMap<String, String> loginId = new HashMap<>(); // 로그인 세션
		excute.setList(product); // 상품 데이터 갱신
		
end:	while(true) {
			switch (excute.menu()) { // 메뉴 출력 및 선택
			case "1":
				excute.join(member, loginId); // 회원가입
				break;
			case "2":
				excute.login(member, loginId); // 로그인
				break;
			case "3":
				excute.logout(loginId); // 로그아웃
				break;
			case "4":
				excute.productBuy(member, product, buyList, loginId); // 상품 구매 
				break;
			case "5":
				excute.buyList(member, buyList, loginId); // 구매목록
				break;
			case "6":
				excute.searchMember(member); // 회원 검색
				break;
			case "7":
				excute.memberList(member, loginId); // 회원 정보/회원 리스트
				break;
			case "0":
				break end;	// 쇼핑 종료
			default:
				System.out.println("[잘못된 입력입니다.]"); // 메뉴 이외의 값 입력시 출력
				break;
			}
		}
	}
}
