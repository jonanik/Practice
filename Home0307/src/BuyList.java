
public class BuyList {
String id;
String name;
int price;
String date;

BuyList(){}

BuyList(String id,String name,int price,String date){
	this.id=id;
	this.name=name;
	this.price=price;
	this.date=date;
}

@Override
public String toString() {
	return "[아이디:" + id + "]\t[제품명:" + name + "]\t[가격:" + price + "]\t[구매날짜:" + date+"]";
}



}
