package com.bjsxt.oop.polymorphism;
/**
 * 向上转型（将子类对象赋给父类的引用变量）
 * 
 *  Person person = new Chinese();//自动转换
	person.sleep();//调用的是从父类继承的
	person.eat();//调用的是子类的（重写父类的）
	person.playShadowboxing();//无法调用子类特有的方法	
 * 
 * 企业招聘员工
 * 
 * Person person = new Chinese();//中国人，英国人都可以成为公司的员工，不需要特别申明，符合要求
 * person.sleep();//中午午休时，所有的员工休息的方式都是一样的
 * person.eat();//中午去食堂吃饭，原形毕露，每个国家人吃饭方式不一样
 * person.playShadowboxing();//老板随便找个员工一起练习太极拳，不可以，因为这个员工可能是英国人，意大利人
 * 
 * @author Administrator
 *
 */
public class TestPoly2 {

	public static void main(String[] args) {
		//基本数据类型的类型转换（左>右 自动转换）
		int n =5;
		double d= n;//自动转换
		//double d = 5;
		System.out.println(d);
		
		//引用数据类型的类型转换(父类引用变量 = 子类对象 自动转换)
		Person person = new Chinese();
		person.sleep();
		person.eat();
		//person.playShadowboxing();
	}

}
