
public class Board {
static int num=0;
int bNum;
String name;
String subject;
String contents;
String date;
int readNum;
{
	num++;
	bNum=num;
}

Board(){}
Board(int bNum,String name,String subject,String contents,String date,int readNum){
	this.bNum=bNum;
	this.name=name;
	this.subject=subject;
	this.contents=contents;
	this.date=date;
	this.readNum=readNum;
}
@Override
public String toString() {
	return bNum+"\t"+name+"\t"+subject+"\t\t"+contents+"\t\t\t"+date+"\t"+readNum;
}



}
