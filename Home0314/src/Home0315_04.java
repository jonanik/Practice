
public class Home0315_04 {
	
	
	public static void main(String[] args) {
		Stu s=new Stu();//Stu �ν��Ͻ��� �����ϸ� ���ϸ��� StuŬ������ �޼��忡 �ε��ȴ�. �׸��� ���� Ŭ���� ������ �ʱ�ȭ�Ǹ鼭 �޼��� ������ �ʱ�ȭ�ȴ�.
						//���� �ν��Ͻ� ���� hakNum�� 0���� �ʱ�ȭ �Ǹ鼭 ������ �����. �׸��� �ν��Ͻ� �ʱ�ȭ���� ����Ǹ鼭  Ŭ���� ������ count�� 1�����ϰ�
						//������ ���� hakNum�� �Էµȴ�. �׸��� �����ڿ� ���� �й��� ��µȴ�. �ν��Ͻ��� ��� �����ϸ�  �����ɶ����� Ŭ���� ������ 0���� �ʱ�ȭ�ǰ�
						//hakNum�� 0���� �ʱ�ȭ�Ǿ��ٰ� �ν��Ͻ� �ʱ�ȭ���� ���� Ŭ���� ������ ���� 1�� �����Ͽ� �ν��Ͻ����� hakNum�� �ԷµǾ� �й��� 1�� �����Ѵ�.
		Stu s1=new Stu();
		Stu s2=new Stu();
		Stu s3=new Stu();
		Stu s4=new Stu();
		
	}

}
class Stu{
	static int count;
	int hakNum;

	{count++;
	hakNum=count;}
	Stu(){
		System.out.println("�й�:"+hakNum);
	}
	
}