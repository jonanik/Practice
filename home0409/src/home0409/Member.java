package home0409;

public class Member {
public Member() {
	
}
public Member(String id,String pw,String name,String nickName) {
	this.id=id;
	this.pw=pw;
	this.name=name;
	this.nickName=nickName;
	
}
String id;
String pw;
String name;
String nickName;

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNickName() {
	return nickName;
}
public void setNickName(String nickName) {
	this.nickName = nickName;
}

}
