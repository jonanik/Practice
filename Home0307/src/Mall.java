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
			case 1:// ȸ������
				method.join(member, loginId);
				break;
			case 2:// �α���
				method.logIn(member, loginId);
				break;
			case 3:// �α׾ƿ�
				method.logout(loginId);
				break;
			case 4:// ��ǰ����
				break;
			case 5:// ���Ÿ�� Ȯ��
				break;
			case 6:// ȸ����������
				method.showMem(member, a);
				break;
			case 7:// ȸ�� �˻�
				method.searchMem(member);
				break;
			case 0:// ���� ����
				System.out.println("������ �����մϴ�.");
				break end;
				
			default:
				System.out.println("�߸��� ������ �Է��ϼ̽��ϴ�.");
				break;

			}
		}

	}

}
