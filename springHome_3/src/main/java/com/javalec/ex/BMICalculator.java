package com.javalec.ex;

public class BMICalculator {
	
private	double lowWeight;
private	double normal;
private	double overWeight;
private	double obesity;

public void setLowWeight(double lowWeight) {
	this.lowWeight = lowWeight;
}
public void setNormal(double normal) {
	this.normal = normal;
}
public void setOverWeight(double overWeight) {
	this.overWeight = overWeight;
}
public void setObesity(double obesity) {
	this.obesity = obesity;
}

public void bmiCalculator(double weight,double height) {
	double h=height*0.01;
	double result=weight/(h*h);
	System.out.println("당신의 BMI지수"+result);
	if(result>obesity) {
		System.out.println("고도비만입니다.");
	}else if(result>=overWeight) {
		System.out.println("과체중입니다.");
	}else if(result>=normal) {
		System.out.println("보통입니다.");
	}else if(result>=lowWeight) {
		System.out.println("저체중입니다.");
	}
	
}

}
