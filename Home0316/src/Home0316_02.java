
public class Home0316_02 {

	public static void main(String[] args) {
Point3 p=new Point3();
Point3d p1=new Point3d();

System.out.println(p.getlocation());//pointŬ������ �ν��Ͻ����� x,y�� ������ getlocation �̶�� �޼��带 ������.
System.out.println(p1.getlocation());//Point3dŬ������ �ν��Ͻ����� z�������� Point Ŭ������ ��ӹ޴´�.
									//����� �������ν� Point3dŬ������ Point Ŭ������ ��������� �޼��带 ��� �ްԵȴ�.
									//������ 3d����Ʈ�� x,y�� �ƴ϶� z������ ����ؾ� �ϹǷ� �޼��带 �ణ ������ �ʿ䰡 �ִ�.
									//�̶� �����ε��� ����Ŭ������ �޼��带 �״�� �����ͼ� �����θ� �ڼ�Ŭ������ �°� �����Ͽ� ����ϴ� ���̴�.

	

		

	}

}
class Point3{
	int x;
	int y;
	
	Point3(){
		this(3,4);
	}
	Point3(int x,int y){
	this.x=x;
	this.y=y;
	}
	
	void test() {
		
	}
	
	String getlocation() {
		return "x:"+x+"\ty:"+y;
	}
}
class Point3d extends Point3 {
	int z;
	
	Point3d(){
		this(7);
	}
	Point3d(int z){
		this.z=z;
	}
	String getlocation() {
		return "x:"+x+"\ty:"+y+"\tz:"+z;
	}
	
	void test() {//������ �޼���� ����ΰ� ����. �̰��� �������̵� �缱��
		
	}
	void test(int i) {//�̰Ŵ� ���� �������̵��� �޼���� �޼������ ������ �Ű������� �ٸ���. �����ε��̴�.
	}
	void test1() {
		
	}
	void test1(int k) {//�����ε�
	}
	void test1() {//���� ���� �ݺ������� ������
		
	}
	
	
	
	
	
}