
public class Member {
	String id;
	String psw;
	String name;
	int point = 0;;
	String joinDate;

	Member() {
	}

	Member(String id, String psw, String name, int point, String joinDate) {
		this.id = id;
		this.psw = psw;
		this.name = name;
		this.point = point;
		this.joinDate = joinDate;

	}

	@Override
	public String toString() {
		return "[아이디:" + id + "]  [비밀번호:" + psw + "]  [이름:" + name + "]  [보유포인트:" + point + "]  [회원가입 일시:" + joinDate
				+ "]";
	}

}
