

	public class Member extends ShoppinList {

int mNum;
String id;
String psw;

int money=100000;
int bonusPoint;


Member(){
	
}
Member(String id,String psw){
	this.id=id;
	this.psw=psw;
}
Member(int mNum,String id,String psw){
	this.mNum=mNum;
	this.id=id;
	this.psw=psw;
}
void buy(Product p) {
	this.money-=p.price;
	this.bonusPoint+=p.price/10;
}



public String toString() {
	
	return mNum+"\t"+id+"\t"+psw+"\t"+money+"\t"+bonusPoint;
}

}