package com.bjsxt.oop.object2;
/**
 * 技能：this关键字
 * 功能：学生自我介绍  学习
 * 
 * 
 * 总结
 * 1.this是一个引用变量，执行当前对象自身。
 * 每一个对象都会有一个this引用变量
 * 当在堆内存中分配空间的时候同时给this分配空间
 * 
 * 2.要理解this内存分配图
 * 
 * 3.this的使用
 *  1.this调用成员变量
 *  	如果局部变量和成员变量同名，this不可以省略 this不修饰局部变量
 *  	如果没有和成员变量同名的局部变量，this可以省略
 *  2.this调用成员方法
 *  	this可以省略
 *   *  
 *  3.this可以调用构造方法
 *     this(name,age,sex);
 *     在构造方法中使用this调用当前类的其他构造方法，必须是第一条语句
 * 
 * 学生类
 * @author Administrator
 *
 */
public class Student2 {

	String name;
	int age;
	String sex;
	double score;
	
	public Student2(){
		
	}
	
	public Student2(String name,int age, String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public Student2(String name,int age, String sex,double score){
		
		//new Student(name,age,sex);
		this(name,age,sex);
		this.score = score;
//		this.name = name;
//		this.age = age;
//		this.sex = sex;
	}
	
	public  void introduce(){
		String  name ="abcdedfg";
		System.out.println(this.name+"  "+age+"   "+sex+"  "+ score);
	}
	
	public void study(){
		
		this.introduce();		
		//introduce();
		System.out.println(this.name +" study hard!");
	}
	
	public static void main(String[] args) {
		Student2 stu = new Student2();
		stu.name="小张";
		stu.age = 19;
		stu.sex ="男";
		stu.score = 98.5;
		
		//stu.introduce();
		stu.study();
		
		Student2 stu2 = new Student2("小偷",78,"男",0.5);
		//stu2.introduce();
		stu2.study();
	}
	
	
}
