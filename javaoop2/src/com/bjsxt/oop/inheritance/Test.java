package com.bjsxt.oop.inheritance;

public class Test {

	public static void main(String[] args) {
		//创建动物并操作
		Animal an = new Animal();
		an.color="red";
		an.age = 3;
		an.eat();
		an.sleep();
		an.introduce();
		
		
		//创建Dog并操作
		Dog dog = new Dog();
		dog.color="yellow";//从父类继承的
		dog.age= 5;//从父类继承的
		dog.nickName="9527";//子类自己的
		dog.strain="哈士奇";//子类自己的
		dog.eat();//从父类继承的
		dog.sleep();//从父类继承的
		dog.introduce();//从父类继承的
		dog.guard();//子类自己的
		

	}

}
