
public class Home0316_04 {

	public static void main(String[] args) {
		Point53d p=new Point53d();
System.out.println(p.x+p.y+p.z);
System.out.println(p.x);
System.out.println(p.y);
System.out.println(p.z);
	}

}

class Point5 {
	int x;
	int y;
	int z;

	Point5(int x, int y) {
		this.x = x;
		this.y = y;

	}

}

class Point53d extends Point5 {
	int z;

	Point53d() {
		this(3, 4, 5);

	}

	Point53d(int x, int y, int z) {// �ֻ��� objectŬ������ ������ ��� Ŭ������ �����ڴ� �������� ù�ٿ� �ٸ� ������, ������ �⺻�����ڸ� ȣ���ϰ� �Ǿ��ִ�.
									// �׷��� ���� �� ���¿��� super(x,y);�� ����Ŭ������ Point5�� �Ű������� �ִ� �����ڸ� ȣ������ �ʰ� �Ǹ�
		super(x, y); // ������ ����. �ֳĸ� Point53d�� �������� ù�ٿ��� ����Ŭ������ Point5�� �⺻�����ڸ� ȣ���ϴµ� Point5����
		this.z = z; // �Ű������� �ִ� �����ڸ� �־ �⺻�����ڸ� ȣ������ ���ϰ� �Ǵ� ���̴�.
	} // �߰������� ������ ��������� ������ �����ڷ� �ʱ�ȭ���ִ°��� ���ٰ� �Ѵ�.

}