
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
	return "[���̵�:" + id + "]\t[��ǰ��:" + name + "]\t[����:" + price + "]\t[���ų�¥:" + date+"]";
}



}
