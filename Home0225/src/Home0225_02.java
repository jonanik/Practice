
public class Home0225_02 {

		   public static void main(String[] args) {
		      //���� 150,30 ������ 200
		      //�� 0,0 ������ 50
		      //���� 300,300 ������ 70
		      
		      Circle c=new Circle();
		      c.draw();
		      Point p= new Point(150,30);
		      Circle c2=new Circle(p,200);
		      c2.draw();
		      
		      Point p1=new Point(0,0);
		      Circle c3=new Circle(p1,50);
		      c3.draw();
		      
		      Point p2=new Point(300,300);
		      Circle c4=new Circle(p2,70);
		      c4.draw();
		      
		      
		      Point[] pp=new Point[3];
		      pp[0]=new Point(100,100);
		      pp[1]=new Point(200,200);
		      pp[2]=new Point(300,300);
		      
		      
		   }

		}


		//���� �׸��� Ŭ����
		class Shape{
		   String color="black";
		   void draw() {
		      System.out.println("���� ����ϴ�.");
		      System.out.println("���� ����:"+color);
		   }
		}


		//��ǥ�� Ŭ����
		class Point{
		   int x;
		   int y;
		   Point(){
		      this(0,0);
		      
		      
		   }
		   Point(int x, int y){
		      this.x=x;
		      this.y=y;
		   }
		   
		   String getXY() {
		      return "("+"x�� ��ǥ:"+x+"y�� ��ǥ:"+y+")";
		   }
		}


		//���� �׸��� Ŭ����
		class Circle extends Shape{
		   Point center;
		   int r;
		   
		   
		   Circle(){
		      center=new Point(0,0);
		      r=100;
		   }
		//   Circle c1=new Circle(p1,50); ���ο� �̷��� ������ �� ����
		   Circle(Point center,int r){
		      this.center=center;
		      this.r=r;
		   }
		   
		   void draw() {
		      System.out.println("������ �׸��ϴ�.");
		      System.out.println("("+"����:"+center.x+","+center.y+"/������:"+r+"/����:"+color+")");
		   }
		   
		}

		class Triangle extends Shape{
		   Point[] p=new Point[3];
		   Triangle() {
		      this(new Point(0,0),new Point(100,0),new Point(0,100));
//		      p[0]=new Point(0,0);
//		      p[1]=new Point(100,0);
//		      p[2]=new Point(0,100);
		   }
		   Triangle(Point[] p){
		      this.p=p;
		   }
		   Triangle(Point p1,Point p2, Point p3){
		      p=new Point[] {p1,p2,p3};
		   }
		   
		   void draw() {
		      System.out.println("�ﰢ���� �׸��ϴ�.");
		      System.out.println("(��ǥ1:"+p[0].getXY()+"��ǥ2:"+p[1].getXY()+"��ǥ3:"+p[2].getXY()+"/����:"+color);
		   }
		}