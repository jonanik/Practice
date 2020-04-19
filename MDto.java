package home0419_01;

import java.sql.Timestamp;

public class MDto {

	
	MDto(int mNum,String id,String pw,String name,String address,Timestamp birth,Timestamp mDate){
		this.mNum=mNum;
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.address=address;
		this.birth=birth;
		this.mDate=mDate;
	}
	
	private int mNum;
	private String id;
	private String pw;
	private String name;
	private String address;
	private Timestamp birth;
	private Timestamp mDate;
	
	public int getmNum() {
		return mNum;
	}
	public void setmNum(int mNum) {
		this.mNum = mNum;
	}
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
	public Timestamp getmDate() {
		return mDate;
	}
	public void setmDate(Timestamp mDate) {
		this.mDate = mDate;
	}
	
}