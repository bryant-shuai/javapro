package com.bjsxt.oop.encapsulation;

public class Person {

	private String name;
	private int age;
	
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		//this.age = age;
		this.setAge(age);
	}

	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		if(age <0 || age>130){
			this.age = 20;
		}else{
			this.age = age;
		}		
	}	
	public String getName(){
		return name;
	}	
	public int getAge(){
		return age;
	}
	
	public void introduce(){
		System.out.println(name+"  "+age);
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.name="ÕÅÈý";
		person.age = 300;
		person.introduce();
	}
	
	public void method1(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
}
