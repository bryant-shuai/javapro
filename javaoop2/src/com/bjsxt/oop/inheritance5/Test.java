package com.bjsxt.oop.inheritance5;
/**
 * 继承内容
 * 1.继承的定义和实现（extends）
 * 
 * 
 * 
 * 2.方法重写 override  introduce()  toString()  equals();
 * 3.super 
 * 		1.只有创建了对象后才有，每个对象都有一个super属性
 *      2.super当前对象的直接父类对象
 *      3.super可以访问成员变量  成员方法  构造方法 *      
 * 4.继承条件下创建子类对象的内存分配机制
 * 	Dog dog= new Dog()
 *  自上而下创建Object、Animal和Dog三个对象，各对象之间通过super关键字联系 *  
 * 5.==和equals()的区别和联系
 * 
 * 
 * 6.组合
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		Animal an = new Animal(6);
		an.introduce();
		System.out.println(an.toString());
		
		Animal an2 = new Animal(6);
		System.out.println(an.equals(an2));

	}

}
