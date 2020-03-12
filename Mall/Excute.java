import java.util.ArrayList;
import java.util.HashMap;

public interface Excute {

	public void setList(ArrayList<Product> product); // 상품 데이터 갱신(필요한 정보 : 상품 리스트)
	public String menu(); // 메뉴 출력 및 선택
	public void join(ArrayList<Member> member, HashMap<String, String> loginId); // 회원가입(필요한 정보 : 멤버 리스트, 로그인 세션)
	public void	login(ArrayList<Member> member, HashMap<String, String> loginId); // 로그인(필요한 정보 : 멤버 리스트, 로그인 세션)
	public void logout(HashMap<String, String> loginId); // 로그아웃(필요한 정보 : 로그인 세션)
	public void productBuy(ArrayList<Member> member, ArrayList<Product> product, ArrayList<BuyList> buyList, HashMap<String, String> loginId); // 상품 구매(필요한 정보 : 멤버 리스트, 상품 리스트, 구매 리스트, 로그인 세션)
	public void buyList(ArrayList<Member> member, ArrayList<BuyList> buyList, HashMap<String, String> loginId); // 구매목록(필요한 정보 : 멤버 리스트, 구매 리스트, 로그인 세션)
	public void searchMember(ArrayList<Member> member); // 회원 검색(필요한 정보 : 멤버 리스트)
	public void memberList(ArrayList<Member> member, HashMap<String, String> loginId); // 회원 정보(필요한 정보 : 멤버 리스트, 로그인 세션)
}
