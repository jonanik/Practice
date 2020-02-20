
public class Home0220_01 {
public static void main(String[] args) {
	//1~25까지 랜덤으로 5개의 숫자를 배열에 넣고 그 가운데 최대 값을 구하시오
    int[] num=new int[25];
    int[] num1=new int[5];
    make_num(num);
    shuffle(num);
    inArr(num,num1);
    print(num1);
    max(num1);
 }

 static void make_num(int[]num) {
    for(int i=0; i<num.length;i++) {
       num[i]=i+1;
    }
 }
 static void shuffle(int[]num) {
    for(int i=0; i<200;i++) {
       int random=(int)(Math.random()*25);
       int temp=num[0];
       num[0]=num[random];
       num[random]=temp;
    }
 }
 static void inArr(int[]num,int[]num1) {
    for(int i=0;i<num1.length;i++) {
       num1[i]=num[i];
    }
 }
 static void max(int[]num1) {
       int result=0;
       result=Math.max(Math.max(Math.max(Math.max(num1[0],num1[1]),num1[2]),num1[3]),num1[4]);
       System.out.println("최대 값:"+result);
 }
 static void print(int[]num1) {
	 System.out.print("배열:\t");
    for(int i=0;i<num1.length;i++) {
       System.out.print(num1[i]+"\t");
    }
    System.out.println();
}
}
