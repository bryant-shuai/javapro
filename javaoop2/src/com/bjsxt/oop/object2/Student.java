package com.bjsxt.oop.object2;
/**
 * 技能：static关键字
 * 功能：学生自我介绍  学习
 * 
 * 缺点：学生的schoolName都是“北京尚学堂”,创建了200个学生对象，就会在内存中分配200个内容重复schoolName，浪费空间
 *     并且修改schoolName是，需要逐个修改
 * 解决方案：使用static修饰schoolName
 * 		则schoolName在内存中只有一份，所有Student的对象共享
 * 
 * 
 * 
 * 总结
 * 
 * 
 * 1.static变量
 * 2.static方法
 * 3.static代码块
 * 	1.执行的时间：第一次加载类的时候
 *  2.执行的次数 执行一次
 *  3.作用：加载全局内容
 *  静态代码块中只能出现静态变量和静态方法
 * 
 * 代码块 {....}
 * 1.一个类中可以有多个代码块
 * 2.创建对象时，先自上而下执行所有的代码块，再执行构造方法
 * 3.作用：将所有构造方法的相同的内容放入代码块，避免重复
 * 
 * 类的成员
 * 1.成员变量（静态和非静态）
 * 2.成员方法（静态和非静态）
 * 3.构造方法
 * 
 * 4.代码块
 * 5.静态代码块
 * 6.内部类
 * 
 * 
 * 学生类
 * @author Administrator
 *
 */
public class Student {
	String name;
	int age;
	String sex;
	double score;
	static String schoolName;
	static{
		//name="abc";
		schoolName ="bjsxt";
		System.out.println("{5}");
	}
	
	public Student(){
		
		System.out.println("---Student()----");
	}
	public Student(String name,int age, String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public Student(String name,int age, String sex,double score){		
		//new Student(name,age,sex);
		this(name,age,sex);
		this.score = score;
		System.out.println(" Student(String name,int age, String sex,double score)");

	}
	{
		System.out.println("{1}");
	}
	
	{
		System.out.println("{2}");
	}
	
	public static void main(String[] args) {
		System.out.println(Student.schoolName);
		System.out.println("start");
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student("adf",34,"sd",342);
		
	}
	
	
}
