
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
		return "[���̵�:" + id + "]  [��й�ȣ:" + psw + "]  [�̸�:" + name + "]  [��������Ʈ:" + point + "]  [ȸ������ �Ͻ�:" + joinDate
				+ "]";
	}

}
