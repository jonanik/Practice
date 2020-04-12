package home0412;

public class Member {
public Member(){
	
}

public Member(String id, String pw, String name, String nickname, String[] hobby, String address){
	this.id=id;
	this.pw=pw;
	this.nickname=nickname;
	this.hobby=hobby;
	this.address=address;
}

private String id;
private String pw;
private String name;
private String nickname;
private String[] hobby;
private String address;

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
public String getNickname() {
	return nickname;
}
public void setNickname(String nickname) {
	this.nickname = nickname;
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
