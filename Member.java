package home0411;

public class Member {
public Member(){
	
}

public Member(String id,String pw,String name, String nickName, String[] hobby, String address){
	this.id=id;
	this.pw=pw;
	this.name=name;
	this.nickName=nickName;
	this.hobby=hobby;
	this.address=address;
}

String id;
String pw;
String name;
String nickName;
String[] hobby;
String address;

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

public String[] getHobby() {
	return hobby;
}

public void setHobby(String[] hobby) {
	this.hobby = hobby;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

}
