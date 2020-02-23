 public class Home0223_01 {
       public static void main(String[] args) {
        Card[] c=new Card[52];
        Card[] c2=new Card[52];
        String[] kind= {"하트","스페이드","클로버","다이아"};
        String num="0123456789XJQK";
        for(int i=0;i<kind.length;i++ ) {
        	for(int j=0;j<13;j++) {
        		c[i*13+j]=new Card();
        		c[i*13+j].kind=kind[i];
        		c[i*13+j].num=j+1;
//        		System.out.println(c[i*13+j].kind+c[i*13+j].num);
        		System.out.println(c[i*13+j].kind+num.charAt(c[i*13+j].num));
        	}
        }
    	for(int i=0; i<kind.length;i++) {
    		for(int j=0; j<13;j++) {
    			c2[i*13+j]=new Card(kind[i],j+1);
    			System.out.println(c2[i*13+j].kind+c2[i*13+j].num);
    			System.out.println(c2[i*13+j].kind+num.charAt(c2[i*13+j].num));
    			
    		}
    	}
    	   
    	   
    	   
   }

}
      
   class Card{
	   Card(){
		   
	   }
	   Card(String k, int n){
		   kind=k;
		   num=n;
	   }
	   
	   
	   String kind;
	   int num;
   }