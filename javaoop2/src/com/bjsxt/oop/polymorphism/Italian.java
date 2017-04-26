package com.bjsxt.oop.polymorphism;

public class Italian extends Person{
	//从父类继承的方法 sleep
	
	
	//重写父类的方法
	public void eat(){
		System.out.println("Italian eating pizza with hand");
	}

	//子类特有的方法
	public void playFootBall(){
		System.out.println("Italian like football Roberto Baggio");
	}
}
