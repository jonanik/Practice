
public class Home0318_02 {

	public static void main(String[] args) {
		Car c=new Car();
		FireEngine f=new FireEngine();//f a�� ��� ������ c�� ����� ����� �� �ִ�. 
		Ambulance a=new Ambulance();//�������� �̿��Ͽ� ������ CarŸ���� �������� c�� f�� c�� ��� ����� ����ϱ� ���� ����� �����غ���
		Car c1=new FireEngine();//�̷��� ����Ÿ���� ���������� �ڼ�Ÿ���� �ν��Ͻ��� �����غ���.
		c1.drive();
		c1.turnLeft();// FireEngine�ν��Ͻ��� ���������� FireEngine�� Car�� ����ϰ� �ֱ⶧���� Car���� ��� ����� ����� �� �ִ�. Car�� ������ ������ �ִ� �޼������ �翬�� ȣ�Ⱑ���ϴ�.������ 
//		c1.water();//������ ����Ÿ���� ���������� �ڼ�Ÿ���� �ν��Ͻ��� �����ϰ� �Ǹ� �ڼ��� ������ �ִ� ������� ����� �� ����. �ֳĸ� ����Ÿ���� ���������δ� �ڼ��� ������ �ִ� ���ο� ����� �ٷ� �� ���⶧���̴�.
		FireEngine f1=null;
		f1=(FireEngine)c1;//������ �̷��� ����Ÿ���� ���������� �ڼ�Ÿ���� ���������� ����ȯ�Ͽ� ��ԵǸ� ���� water�޼��带 ����� �� �ְԵȴ�.
		f1.water();
		
		Car c2=new Ambulance();//����Ÿ���� ���������� c2�δ� �ڼ�Ÿ���� �ν��Ͻ��� �ִ� �޼��� siren�� ����� �� ����. ������ ���������� ���ο� ��ǰ�� ���ο� ����� �ٷ���°��� �ȵǴ°Ͱ� ����.
		Ambulance a1=null;
		a1=(Ambulance)c2;//����Ÿ���� �������� c2�� �ڼ�Ÿ���� �������� a1���� ����ȯ�� �ϰ� �Ǹ�  a1�� c2�� ����Ű�� �ִ� Ambulance�ν��Ͻ��� ����Ű�ԵǸ鼭  �ڼ� Ÿ���� �ν��Ͻ��� ����� ����� �� �ְԵȴ�.
		a1.siren();
		
		
		
	}

}
class Car{
	
	void drive(){
		System.out.println("brrrr~~");
	}
	void back() {
		System.out.println("br.....");
	}
	void turnRight() {
		System.out.println("turn...Right!!!");
	}
	void turnLeft() {
		System.out.println("turn...Left!!!");
	}
}
class FireEngine extends Car{
	void water() {
		System.out.println("water~~~~");
	}
}
class Ambulance extends Car{
	void siren() {
		System.out.println("sirennnn~~~~!!");
	}
}