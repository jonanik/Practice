package home.javalec.ex;

import java.sql.Timestamp;

public class MemberDto {

	MemberDto(String id,String pw,String name,String address,Timestamp birth){
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.address=address;
		this.birth=birth;
	}
	
	private String id,pw,name,address;
	private Timestamp birth;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Timestamp getBirth() {
		return birth;
	}
	public void setBirth(Timestamp birth) {
		this.birth = birth;
	}
	
	
	
}
