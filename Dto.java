package home.java.ex.Dto;

import java.sql.Timestamp;

public class Dto {

	public Dto(){
		
	}
	
	public Dto(int num,String name,String title,String content,Timestamp wdate,int hit) {
		this.num=num;
		this.name=name;
		this.title=title;
		this.content=content;
		this.wdate=wdate;
		this.hit=hit;
	}
	
private	int num;
private	String name;
private	String title;
private	String content;
private	Timestamp wdate;
private	int hit;
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getWdate() {
		return wdate;
	}

	public void setWdate(Timestamp wdate) {
		this.wdate = wdate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
	
}
