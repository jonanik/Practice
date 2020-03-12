
public class Home0225_02 {

		   public static void main(String[] args) {
		      //원점 150,30 반지름 200
		      //원 0,0 반지름 50
		      //원점 300,300 반지름 70
		      
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


		//도형 그리기 클래스
		class Shape{
		   String color="black";
		   void draw() {
		      System.out.println("면을 만듭니다.");
		      System.out.println("면의 색상:"+color);
		   }
		}


		//좌표점 클래스
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
		      return "("+"x의 좌표:"+x+"y의 좌표:"+y+")";
		   }
		}


		//원형 그리기 클래스
		class Circle extends Shape{
		   Point center;
		   int r;
		   
		   
		   Circle(){
		      center=new Point(0,0);
		      r=100;
		   }
		//   Circle c1=new Circle(p1,50); 메인에 이렇게 선언이 될 거임
		   Circle(Point center,int r){
		      this.center=center;
		      this.r=r;
		   }
		   
		   void draw() {
		      System.out.println("원형을 그립니다.");
		      System.out.println("("+"원점:"+center.x+","+center.y+"/반지름:"+r+"/색상:"+color+")");
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
		      System.out.println("삼각형을 그립니다.");
		      System.out.println("(좌표1:"+p[0].getXY()+"좌표2:"+p[1].getXY()+"좌표3:"+p[2].getXY()+"/색상:"+color);
		   }
		}