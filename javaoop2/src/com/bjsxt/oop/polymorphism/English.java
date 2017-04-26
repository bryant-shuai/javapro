package com.bjsxt.oop.polymorphism;

public class English extends Person{

	//从父类继承的方法 sleep
	
	
	//重写父类的方法
	public void eat(){
		System.out.println("English eating meat by knife");
	}
	//子类特有的方法
	public void raceHorse(){
		System.out.println("English like horse racing");
	}
}
