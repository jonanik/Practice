
public class Home0314_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card c1=new Card();
		Card c2=new Card();
		c1.kind="heart";
		c1.number=8;
		c2.kind="clover";
		c2.number=3;
		
		System.out.println(c1);
		System.out.println(c2);
		c1.width=40;// Ŭ���� ���� ���� �����Ѵٰ� �Ҷ� ��������.Ŭ���������� �� �ƴ϶�
		c1.height=80;// Ŭ������.Ŭ�������������� ���ִ°��� ����� ���� �۾��Ҷ� ȥ���ҋ��� �򰥸��� ���� �� �ִ�.
		
		System.out.println(c1);//c1���������� �̿��Ͽ� Ŭ���������� ���� �ٲ�������
		System.out.println(c2);//�ٲ� ���� Ŭ���� �����̴�. Ŭ���������� Ŭ�������� ������ ��� �ν��Ͻ�����
								//�����ϱ� ������ c2�� width height���� ����Ǿ��ִ�. ���ʿ� 'c2��'width height��� ���ϴ°͵� �̻��ѰŴ�.
								
		Card.width=100;
		Card.height=20;
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		
	}

}
class Card{
	String kind;//kind �� number�� Ŭ���� ������ ����Ǵ� �ν��Ͻ� �����̴�.
	int number;//�ν��Ͻ� ������ �ν��Ͻ��� �����ɶ� �����ȴ�.
	static int width=80;//width �� height�� Ŭ���������� ����Ǵ� Ŭ���������̴�.
	static int height=150;//Ŭ���������� Ŭ������ �޼��忡��ƿ� �ε��ɶ� ���� �����ȴ�. 
							//�� ���� �� Ŭ������ �����ϸ� ���� �޼��尡 �ִ� Ŭ������ �ε��ǰ� ���θ޼��尡 �ݽ��ÿ� �ö���
							//Ŭ���� ī�尡 �޼��忡 �ε��Ǹ鼭 Ŭ�����鼭 width�� height�� ���� �����ȴ�. �׸��� ī�� Ŭ������
							//Ŭ���� ī���� �ν��ͽ��� �����ϸ� �׶� kind number�ν��Ͻ� ������ �����ȴ�.
	
	
	
	@Override
	
	public String toString() {
		return "[kind=" + kind + ", number=" + number + "]"+"�ʺ�:"+
	width+"\t����:"+height;
	}
	
	
}