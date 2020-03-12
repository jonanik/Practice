import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class ExcuteImpl implements Excute {

	Scanner sc = new Scanner(System.in);

	
	// 상품 데이터 갱신(소스로 추가하거나 차후 상품 추가 메뉴 만들시 간단하게 추가 가능)
	@Override
	public void setList(ArrayList<Product> product) {
		product.add(new Tv(1, "LCDTV", 1000, 100, null, "LCD", 40));
		product.add(new Tv(2, "LEDTV", 1500, 150, null, "LED", 50));
		product.add(new Tv(3, "OLEDTV", 2000, 200, "HDR", "OLED", 60));
		product.add(new Fridge(4, "일반 냉장고", 1000, 100, null, 100, "일반"));
		product.add(new Fridge(5, "양문형 냉장고", 1500, 150, "더블 냉각", 200, "양문"));
		product.add(new Washer(6, "통돌이 세탁기", 1000, 100, null, 100, "통돌이"));
		product.add(new Washer(7, "드럼 세탁기", 1500, 150, null, 150, "드럼"));
		product.add(new Washer(8, "드럼건조 세탁기", 2000, 200, "살균", 200, "드럼건조"));
	}
	
	// 메뉴 출력 및 선택
	@Override
	public String menu() {
		System.out.println("----------[MENU]----------");
		System.out.println("1)회원가입 2)로그인    3)로그아웃");
		System.out.println("4)상품구입 5)구매목록 6)회원검색");
		System.out.println("7)회원정보 보기 0)종료");
		System.out.println("--------------------------");
		System.out.print("선택 : ");
		String select = sc.next();
		return select; // 선택한 값 switch로 반환
	}
	
	// 회원가입
	@Override
	public void join(ArrayList<Member> member, HashMap<String, String> loginId) {
		String id;
		// 로그인 중이면 로그아웃 메뉴로 이동, 로그아웃 후 다시 돌아오고 로그아웃 취소시 메뉴로 이동
		if(loginId.get("id") != null) {
			System.out.println("[로그인 중에는 이용하실 수 없습니다.]");
			logout(loginId);
			if(loginId.get("id") != null) {
				return;				
			}
		}
		// 아이디 유효성 검사
re:		while(true) {
			System.out.println("-------[JOIN(뒤로:0)]------");
			System.out.print("ID : ");
			id = sc.next();
			if(id.equals("0")) {
				return;
			} else if(id.length() < 3) {
				System.out.println("-----!3글자 이상 입력하세요!-----");
				continue;
			}
			for(int i=0;i<member.size();i++) {
				if(member.get(i).id.equals(id)) {
					System.out.println("---!이미 존재하는 아이디입니다.!---");
					continue re;
				}
			}
			break;
		}
		System.out.print("PW : ");
		String pw = sc.next();
		if(pw.equals("0")) {
			return;
		}
		System.out.print("NAME : ");
		String name = sc.next();
		if(name.equals("0")) {
			return;
		}
		// 가입 날짜 저장을 위해 캘린더 생성
		Calendar now = Calendar.getInstance();
		String date = now.get(Calendar.YEAR)+"-"+(now.get(Calendar.MONTH)+1)+"-"+now.get(Calendar.DATE)+" "
					 +now.get(Calendar.HOUR_OF_DAY)+":"+now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND);	
		
		member.add(new Member(id, pw, name, date));
		System.out.println("["+name+"님 회원가입 성공!]");
	}
	
	// 로그인
	@Override
	public void login(ArrayList<Member> member, HashMap<String, String> loginId) {
		// 로그인 중이면 로그아웃 메뉴로 이동, 로그아웃 후 다시 돌아오고 로그아웃 취소시 메뉴로 이동
		if(loginId.get("id") != null) {
			System.out.println("[로그인 중에는 이용하실 수 없습니다.]");
			logout(loginId);
			if(loginId.get("id") != null) {
				return;				
			}
		}
		while(true) {
			System.out.println("------[LOGIN(뒤로:0)]------");
			System.out.print("ID : ");
			String id = sc.next();
			if(id.equals("0")) {
				return;
			}
			System.out.print("PW : ");
			String pw = sc.next();
			if(pw.equals("0")) {
				return;
			}
			// 입력한 id/pw가 member 리스트에 존재하는지 검사 후 결과 실행
			for(int i=0;i<member.size();i++) {
				if(member.get(i).id.equals(id) && member.get(i).pw.equals(pw)) {
					loginId.put("id", member.get(i).id);
					System.out.println("["+loginId.get("id")+"님 로그인]");
					return;
				} else if(i+1 == member.size()) {
					System.out.println("[존재하지 않는 아이디이거나 비밀번호가 틀립니다.]");
				}
			}			
		}
	}
	
	// 로그아웃
	@Override
	public void logout(HashMap<String, String> loginId) {
		if(loginId.get("id") == null) {
			System.out.println("[로그인 중이 아닙니다.]");
		} else {
			while(true) {
				System.out.print("로그아웃하시겠습니까?[Y/N] : ");
				String choice = sc.next();
				if(choice.equals("Y") || choice.equals("y")) {
					loginId.clear();
					System.out.println("[로그아웃 되었습니다.]");
					return;
				} else if(choice.equals("N") || choice.equals("n")) {
					System.out.println("[로그아웃이 취소되었습니다.]");
					return;
				} else {
					System.out.println("[잘못된 입력입니다.]");
				}				
			}
		}
	}
	
	// 상품 구매
	@Override
	public void productBuy(ArrayList<Member> member, ArrayList<Product> product, ArrayList<BuyList> buyList, HashMap<String, String> loginId) {
		// 로그인 중이 아니면 로그인 메뉴로 이동, 로그인 후 다시 돌아오고 로그인 취소시 메뉴로 이동
		if(loginId.get("id") == null) {
			System.out.println("[로그인 후 이용 가능합니다]");
			login(member, loginId);
			if(loginId.get("id") == null) {
				return;
			}
		}
		
re:		while(true) {			
			System.out.println("-----[PRODUCT(뒤로:0)]-----");
			// 상품 목록 출력
			for(int i=0;i<product.size();i++) {
				System.out.println(product.get(i).code + ") " + product.get(i).name + "[" + product.get(i).price + "원]");			
			}
			System.out.println("--------------------------");
			System.out.print("선택 :");
			String selectCheck = sc.next();
			// 입력값 유효성 검사
			for(int i=0;i<selectCheck.length();i++) {
				if(selectCheck.charAt(i) < '0' || selectCheck.charAt(i) > '9') {
					System.out.println("[잘못된 입력입니다.]");
					continue re;
				}
			}
			if(Integer.parseInt(selectCheck) > product.size()) {
				System.out.println("[잘못된 입력입니다.]");
				continue re;
			}
			int select = Integer.parseInt(selectCheck)-1;
			if(select == -1) {
				return;
			}
			// 상품 상세
			System.out.println(product.get(select).name+"["+product.get(select).price+"원], 적립 포인트["+product.get(select).point+"P]");
			if(product.get(select).option != null) {
				System.out.print("기능["+product.get(select).option+"], ");
			}
			System.out.println(product.get(select).toString());
			// 상품 구매
			System.out.println("--------------------------");
			while(true) {
				System.out.print("구매하시겠습니까?[Y/N] : ");
				String choice = sc.next();
				if(choice.equals("Y") || choice.equals("y")) {		
					// 구매 날짜 입력을 위한 캘린더 생성
					Calendar now = Calendar.getInstance();
					String date = now.get(Calendar.YEAR)+"-"+(now.get(Calendar.MONTH)+1)+"-"+now.get(Calendar.DATE)+" "
								 +now.get(Calendar.HOUR_OF_DAY)+":"+now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND);	
					// 구매 리스트에 추가
					buyList.add(new BuyList(loginId.get("id"), product.get(select).name, product.get(select).price, date));
					// 포인트 적립
					for(int i=0;i<member.size();i++) {
						if(loginId.get("id").equals(member.get(i).id)) {
							member.get(i).point += product.get(select).point;
						}
					}
					System.out.println("["+product.get(select).name+"을(를) 구매하였습니다.]");
					return;
				} else if(choice.equals("N") || choice.equals("n")) {
					System.out.println("[구매를 취소합니다.]");
					return;
				} else {
					System.out.println("[잘못된 입력입니다.]");
				}			
			}
		}
	}
	
	// 구매목록
	@Override
	public void buyList(ArrayList<Member> member, ArrayList<BuyList> buyList, HashMap<String, String> loginId) {
		int count = 0; // 구매 리스트 갯수
		int totalPrice = 0; // 총 구매금액
		// 로그인 중이 아니면 로그인 메뉴로 이동, 로그인 후 다시 돌아오고 로그인 취소시 메뉴로 이동
		if(loginId.get("id") == null) {
			System.out.println("[로그인 후 이용 가능합니다]");
			login(member, loginId);
			if(loginId.get("id") == null) {
				return;
			}
		} else if(loginId.get("id").equals("admin")) { // 운영자에게는 모든 리스트 출력
			System.out.println("-------[BUYLIST]-------");
			for(int i=0;i<buyList.size();i++) {
				System.out.println(buyList.get(i).toString());
				totalPrice += buyList.get(i).price;
				count++;
			}
		} else {
			System.out.println("---------[BUYLIST]--------"); // 회원에게 자기 구매 리스트만 출력
			for(int i=0;i<buyList.size();i++) {
				if(buyList.get(i).id.equals(loginId.get("id"))) {
					System.out.println(buyList.get(i).toString());
					totalPrice += buyList.get(i).price;
					count++;
				}
			}
		}
		// 구매 이력이 없을 시 출력
		if(count == 0) {
			System.out.println("[구매 이력이 없습니다.]");
		} else {
			// 구매 이력이 1개라도 있을 시 출력
			System.out.println("\n총액["+totalPrice+"원]");
		}
	}
	
	// 회원 검색
	@Override
	public void searchMember(ArrayList<Member> member) {
		while(true) {
			int count = 0; // 검색된 회원 수
			System.out.println("------[SEARCH(이전:0)]-----");
			System.out.print("이름 검색 : ");
			String name = sc.next();
			if(name.equals("0")) {
				break;
			}
			for(int i=0;i<member.size();i++) {
				// 입력한 name이 포함된 member.get(i).name 과 id 출력 후 count++
				if(member.get(i).name.contains(name)) {
					System.out.println("이름 : " + member.get(i).name+", 아이디 : " + member.get(i).id);
					count++;
				}
			}
			// 한 명도 검색이 안 됐을 시 출력
			if(count == 0) {
				System.out.println("[\""+name+"\"이(가) 포함된 이름이 없습니다.]");
			}			
		}
	}
	
	// 회원 정보/회원 리스트
	@Override
	public void memberList(ArrayList<Member> member, HashMap<String, String> loginId) {
		if(loginId.get("id") == null) {
			System.out.println("[로그인 후 이용 가능합니다]");
			return;
		} else if(loginId.get("id").equals("admin")) {
			for(int i=0;i<member.size();i++) {
				System.out.println(member.get(i).toString());
			}
		} else {
			for(int i=0;i<member.size();i++) {
				if(loginId.get("id").equals(member.get(i).id)) {
					System.out.println(member.get(i).toString());
				}
			}
		}
	}
}
