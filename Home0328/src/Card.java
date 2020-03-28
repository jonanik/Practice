
public class Card {
String kind;
char numb;

final int KINDNUM=4;
final int NUMNUM=13;
final int TCARDNUM=52;

Card (){
	
}
Card(String kind, char numb){
	this.kind=kind;
	this.numb=numb;
}

public String toString() {
	return kind+"\t"+numb;
}

}
