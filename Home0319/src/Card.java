
public class Card {
String kind;
char num;

final int TCARDNUM=52;
final int KINDNUM=4;
final int NUMNUM=13;

Card(){
	
}
Card(String kind,char num){
	this.kind=kind;
	this.num=num;
}

public String toString() {
	return kind+"\t"+num;
}

}
