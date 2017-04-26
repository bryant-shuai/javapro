package com.bjsxt.oop.polymorphism;

public class Chinese extends Person {	
	 String name="小肖";
	//从父类继承的方法 sleep
	
	//重写父类的方法
	public void eat(){
		System.out.println("Chinese eating rice with chopticks");
	}
	//子类特有的方法
	public void playShadowboxing(){
		System.out.println("Chinese like play  shadowboxing ");
	}
}
