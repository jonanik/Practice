
public class Home0210_03 {

	public static void main(String[] args) {

		int[] ball=new int[45];
		for(int i=0; i<ball.length;i++) {
			ball[i]=i+1;
		}
		
		int temp=0;
		int j=0;
		
		for(int i=0; i<200;i++) {
			j=(int)(Math.random()*45);
			temp=ball[0];
			ball[0]=ball[j];
			ball[j]=temp;
		}
		for(int i=0; i<6;i++) {
			System.out.println((i+1)+"번째 공의 번호:"+ ball[i]);
		}
		
		
//		int[] ball= new int[45];
//		for(int i=0;i<ball.length;i++) {
//			ball[i]=i+1;
//		}
//		int temp=0;
//		int j=0;
//		
//		for(int i=0; i<200; i++) {
//			j=(int)(Math.random()*45);
//			temp=ball[0];
//			ball[0]=ball[j];
//			ball[j]=temp;
//		}
//		for(int i=0;i<6;i++) {
//			System.out.println((i+1)+"번째 공의 번호:"+ball[i]);
//		}
//		
		//int[]ball=new int[45];
//for(int i=0; i<ball.length;i++) {
//	ball[i]=i+1;
//}
//int temp=0;
//int j=0;
//
//for(int i=0; i<200; i++) {
//	j=(int)(Math.random()*45);
//	temp=ball[0];
//	ball[0]=ball[j];
//	ball[j]=temp;
//}
//for(int i=0;i<6;i++) {
//	System.out.println((i+1)+"번째 공의 번호:"+ ball[i]);
//}
//		
		
		
		//		int[] ball=new int[45];
//		for(int i=0;i<ball.length;i++) {
//			ball[i]=i+1;
//		}
//		int temp=0;
//		int j=0;
//		
//		for(int i=0;i<200; i++) {
//			j=(int)(Math.random()*45);
//			temp=ball[0];
//			ball[0]=ball[j];
//			ball[j]=temp;
//		}
//		for(int i=0;i<6;i++) {
//			System.out.println((i+1)+"번째 공의 번호:"+ball[i]);
//		}

//		int[] ball=new int[45];
//		for(int i=0; i<ball.length;i++) {
//			ball[i]=i+1;
//		}
//		int tmp=0;
//		int j=0;
//		
//		for(int i=0;i<200;i++) {
//			j=(int)(Math.random()*45);
//			tmp=ball[0];
//			ball[0]=ball[j];
//			ball[j]=tmp;
//		}
//		for(int i=0; i<6;i++) {
//			System.out.println((i+1)+"번째 공의 번호:"+ball[i]);
//		}
		
//		int[] score=new int[] {50,60,70,80,90};
//		int[] score1= {10,20,30,40,50};
//		
//		for(int i=0; i<score.length;i++) {
//			System.out.println(score1[i]);
//		}
//		System.out.println("");
//		for(int i=0; i<score1.length;i++) {
//			System.out.print(score[i]+" ");
//		}
	
		


	}

}
