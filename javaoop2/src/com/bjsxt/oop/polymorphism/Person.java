package com.bjsxt.oop.polymorphism;

public class Person {

	//属性
	 String name="小明";
	
	//方法1：子类来继承的
	public void sleep(){
		System.out.println("闭上眼睛就睡觉呀");
	}
	//方法2：子类来重写的
	public void eat(){
		System.out.println("张开嘴巴就吃饭呀");
	}
}
