package com.bjsxt.oop.inheritance3;
/**
 * 
 * 1.每个构造方法的第一条语句默认是super(),可以省略，含义是调用父类的无参数构造方法，
 * 建议每个类都要提供无参数的构造方法
 * 
 * 2.子类对象的内存分配图
 *   Dog dog = new Dog();
 *   当创建一个子类对象时，会按照继承关系，自上而下依次创建多个对象
 *   Object Animal Dog
 *   每个对象都会有两个属性this和super
 *   this指向当前对象自身
 *   super指向当前对象的直接父类对象
 *   各个上下级对象之间通过super关键字联系起来，
 *   最后将子类对象首地址赋给引用变量
 * 		
 * 3.super关键字的作用
 * 	 每个对象都会有一个super属性，指定当前对象的父类对象
 *  1.访问父类对象的属性  super.color
 *  2.访问父类对象的成员方法   super.introduce(); *  
 *  3.访问父类对象的构造方法    super();   super(color,age);
 *  
 *  
 *  子类构造方法的第一条语句可以是
 *  1.super()  默认
 *  2.super(color,age);
 *  3.this()   this(color,age);  先调用当前对象的其他构造方法，通过其他构造方法调用super来调用父类的构造方法
 *  
 * 在构造方法中，不可以使用this和super同时调用构造方法
 * 因为this和super调用构造方法都必须是第一条语句，
 * 两个关键字都出现，不可能都是第一条语句
 *  * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {	
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
		System.out.println(dog);
		System.out.println(dog.toString());
		
		Dog  dog2 = new Dog("red", 3, "旺旺", "拉布拉多犬");
		System.out.println(dog2.toString());
		

	}

}
