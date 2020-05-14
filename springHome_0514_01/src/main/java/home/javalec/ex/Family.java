package home.javalec.ex;

public class Family {

	String motherName;
	String fatherName;
	String sisterName;
	String brotherName;
	
	public Family() {}
	public Family(String motherName,String fatherName) {
		this.motherName=motherName;
		this.fatherName=fatherName;
	}
	
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getSisterName() {
		return sisterName;
	}
	public void setSisterName(String sisterName) {
		this.sisterName = sisterName;
	}
	public String getBrotherName() {
		return brotherName;
	}
	public void setBrotherName(String brotherName) {
		this.brotherName = brotherName;
	}
	
	
	
}
