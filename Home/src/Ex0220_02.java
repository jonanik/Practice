
public class Ex0220_02 {

	public static void main(String[] args) {
		//2)1~100까지의 숫자중 랜덤으로 10개를 추출해서 배열에넣고 (위와방식동일)
		//그 배열을 작은숫자부터 큰숫자 순으로 이쁘게 정렬하세오 
int[]num= new int[100];
int[]arr=new int[10];

		make_num(num);//번호 100개 형성
		shuffle(num);//번호 100개를 섞어줌
		inarr(num,arr);//랜덤으로 섞인 번호를 arr배열에 10개 넣어줌
		sortarr(arr);//넣어준 10개 번호를 오름차순으로 정렬
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
			
		}
		
	}
	static void make_num(int[]num) {
		for(int i=0; i<num.length;i++) {
			num[i]=i+1;
		}
	}
	static void shuffle(int[]num) {
		for(int i=0;i<num.length;i++) {
			int random=(int)(Math.random()*100);
			int temp=num[0];
			num[0]=num[random];
			num[random]=temp;
		}
	}
	static void inarr(int[]num,int[]arr) {
		for(int i=0; i<arr.length;i++) {
			arr[i]=num[i];
		}
	}
	static void sortarr(int[]arr) {
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}//if
			}//for
		}//for
	}//sortarr
}//class
