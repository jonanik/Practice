
public class Member {
	
	String id;	// 아이디
	String pw;	// 비밀번호
	String name;// 이름
	int point;	// 적립 포인트
	String joinDate;	// 가입 날짜
	
	public Member() {}
	
	public Member(String id, String pw, String name, String date) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.point = 0;
		this.joinDate = date;
	}

	@Override
	public String toString() {
		return "아이디[" + id + "], 비밀번호[" + pw + "], 이름[" + name + "], 포인트[" + point
				+ "], 가입날짜[" + joinDate + "]";
	}
	
	
}
