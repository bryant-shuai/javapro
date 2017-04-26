package com.bjsxt.oop.polymorphism;
/**
 * 1.什么是多态 
 *    Person person = new English();
		person.eat();
	 将子类对象赋给父类的引用变量，结果通过父类引用变量调用的居然是子类的重写的方法
	 子类对象不同，会出现多种形态 多态	 
 * 2.多态的条件
 * 		1.继承 Person  Chinese/English/Italian 没有继承就没有多态
 *      2.方法的重写   eat() *      
 *      3.将子类对象赋给父类的引用变量并调用重写的方法  Person person = new English();person.eat();
 *     
 * 3.多态 好处
 *    1.减少代码量（避免出现更多的方法重载）
 *    2.便于扩展
 *    
 * 4.多态的最主要的使用场合
 * 		使用父类做方法的形参（实参可以它的任意子类对象）
 * 		public static void showEat(Person person){}
 * 
 * 
 * @author Administrator
 *
 */
public class TestPoly {

	public static void main(String[] args) {
		Chinese ch = new Chinese();
		ch.sleep();
		ch.eat();
		ch.playShadowboxing();		
		
		Person person = new English();
		person.sleep();//单态
		person.eat();//多态
		//person.playShadowboxing();//无态
	
		

	}

}
