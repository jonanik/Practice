import java.util.Arrays;
import java.util.Scanner;

public class Home0316_01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("������ �Է�");
		String color=scan.next();
		System.out.println("x���� �Է�");
		int x=scan.nextInt();
		System.out.println("y���� �Է�");
		int y=scan.nextInt();
		System.out.println("r���� �Է�");
		int r=scan.nextInt();
		Point p=new Point(x,y);
		Shape s=new Shape(color);
		Circle c=new Circle(p,r);
		
		c.draw();
		
		Point[] p1=new Point[3];
		for(int i=0; i<p1.length;i++) {
			System.out.println("x���� �Է�");
			int x1=scan.nextInt();
			System.out.println("y���� �Է�");
			int y1=scan.nextInt();
			p1[i]=new Point(x1,y1);
		}
		
		Triangle t=new Triangle(p1);
		t.draw();
	}

}
class Shape{
	String color="black";
	
	Shape(){
		
	}
	Shape(String color){
		this.color=color;
	}
	
}
class Point{
	int x;
	int y;
	
	Point(){
		
	}
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class Circle extends Shape{
	Point p;
	int r;
	
	Circle(){
		this(new Point(0,0),100);
	}
	Circle(Point p,int r){
		this.p=p;
		this.r=r;
	}
	
	void draw() {
		System.out.println("�߾���:"+p.x+","+p.y+"\t"+"������:"+r);
		System.out.println("������ ����:"+color);
	}
	
}
class Triangle extends Shape{
	Point[] p=new Point[3];
	
	Triangle(){
		
	}
	Triangle(Point[] p){
		
		this.p=p;
		}
	
	void draw() {
		System.out.println("��ǥ1:"+p[0].x+","+p[0].y+"\t��ǥ2:"+p[1].x+","+p[1].y+"\t��ǥ3:"+p[2].x+","+p[2].y);
		System.out.println("������ ����:"+color);
	}
	
}