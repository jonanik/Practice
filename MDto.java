package home.java.Dto;

import java.sql.Timestamp;

public class MDto {

	MDto(){
		
	}
	
	MDto(String id,String pw,String name,Timestamp b_date){
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.b_date=b_date;
	}
	
private	String id;
private	String pw;
private	String name;
private	Timestamp b_date;

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

	public Timestamp getB_date() {
		return b_date;
	}

	public void setB_date(Timestamp b_date) {
		this.b_date = b_date;
	}
	
	
	
}
