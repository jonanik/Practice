
public class Home0314_04 {

	public static void main(String[] args) {
		Method m=new Method();
		int result1=0;
		long result2=0;
		m.print();
		
		
		result1=m.plus(3, 4);
		System.out.println(result1);
		result2=m.minus(300,200);
		System.out.println(result2);
	}

}
class Method{
	void print() {
		System.out.println("�޼���� ����ο� �����η� �����ȴ�. ����δ� ����Ÿ�� �޼���� �Ű������� ���Ѵ�.");
		System.out.println("�����δ� �޼��尡 ����Ǵ� �κ��̴�. ����ο��� ����Ÿ���� Ÿ���� �������ְų�");
		System.out.println("��ȯ����� ��� �ɰ�� void�� �Ͽ� ��ȯ������� ���� �� �� �ִ�.");
		System.out.println("�׸��� �޼��尡 ���������� ������ ��Ȳ�� �޼��� ������ ������ ��� ��������");
		System.out.println("�޼��峻 �����ο��� ������ ����Ǵٰ� return�� ������ ���̴�.");
		System.out.println("����ο� ����Ÿ���� ���������� ��� return �����  ���� ǥ�õǾ���Ѵ�.");
		System.out.println("�̶� ������� ������� ����Ÿ�԰� ���ƾ��Ѵ�. ������� ������� return");
		System.out.println("�� �����Ͽ� �޼��忡�� ���� �� �ִ�.");
	}
	int plus(int a, int b) {
		int result=0;
		result=a+b;
		return result;//��� ���� ������� ����Ÿ�԰� ���ƾ� �Ѵ�. �Ǵ� �ڵ�����ȯ �Ǵ� ���̾���Ѵ�. 
	}
	long minus(long a,long b) {
		long result=0;
		result=a-b;
		return result;
	}
	
}