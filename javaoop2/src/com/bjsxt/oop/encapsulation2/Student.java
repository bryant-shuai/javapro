package com.bjsxt.oop.encapsulation2;

import com.bjsxt.oop.encapsulation.Person;

public class Student extends Person{	
	private double score;
	private String schoolName;	
	public void setScore(double score){		
		this.score = score;
	}	
	public void setSchoolName(String schoolName){
		this.schoolName = schoolName;
	}	
	public double getScore(){		
		return score;
	}	
	public String getSchoolName(){
		return schoolName;
	}	
	public Student(String name,int age,double score,String schoolName){
		//this.name = name;
		//this.age = age;
//		this.setName(name);
//		this.setAge(age);
		super(name,age);
		this.schoolName=schoolName;
		this.score = score;
	}
	
	public void study(){
//		System.out.println(this.getAge());
//		System.out.println(this.getName());	
		super.method1();
		System.out.println("study at home");
	}
	
	
}
