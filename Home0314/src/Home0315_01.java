
class Test{int x;}
public class Home0315_01 {

	public static void main(String[] args) {
		Test t=new Test();
		t.x=10;
		System.out.println(t.x);//t.x�� 10�̴�.
	;//text�޼��忡 �Ű������� t.x(10)�� �ִ´�. ������ test�޼��峻�� �������� x��
					//100�� �Ǿ�  ���ϰ��� x=100�̴�.
		System.out.println(test(t.x));//100 �̰� �Ű������� �׳� �⺻���ν��Ͻ� ������ �ްԵǸ� �� �������� ������ ������ 
										//������ �� ���ٴ°� �����ش�. 
		
		System.out.println(test1(t));//�̰� �Ű������� Test Ÿ���� ���������� �޴� ���� �����ش�.
									//�Ű������� ���������� ������ �ּҰ��� �޴� ���̱� ������
									//�ż��� ������ �ּҰ��� �̿��� ���� �����ϸ� ������ ���� ������ �� �ִ�.
		
	}
static int test(int a) {
	int x=100;
	return x;
}
static int test1(Test t) {
	t.x=10000;
	return t.x;
}
}
