
public class Ex0220_02 {

	public static void main(String[] args) {
		//2)1~100������ ������ �������� 10���� �����ؼ� �迭���ְ� (���͹�ĵ���)
		//�� �迭�� �������ں��� ū���� ������ �̻ڰ� �����ϼ��� 
int[]num= new int[100];
int[]arr=new int[10];

		make_num(num);//��ȣ 100�� ����
		shuffle(num);//��ȣ 100���� ������
		inarr(num,arr);//�������� ���� ��ȣ�� arr�迭�� 10�� �־���
		sortarr(arr);//�־��� 10�� ��ȣ�� ������������ ����
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
