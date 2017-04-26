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
 * 	1.作用：用来操作static变量 *  
 *  2.访问方式
 *  	Student.getShoolName(); 推荐使用该方式
 *      stu.getShoolName(); * 
 *  3.不可以
 *     static方法中不可以访问非static变量   name age
 *       static方法中不可以访问this *       
 *     static方法中不可以访问非static方法  study()
 *     
 *     因为非static变量，this，只有在创建了对象后才会分配空间
 *     非static方法也只有在创建了对象后才可以调用 *     
 *     但是调用static方法是，对象可能还没有创建呢 *   
 *  
 *  
 *  4.可以
		 非静态方法可以访问静态变量
		非静态方法可以访问静态方法
		
		why
		可以使用非静态方法时，静态变量和静态方法都已经存在

 * 
 * 学生类
 * @author Administrator
 *
 */
public class Student4 {

	String name;
	int age;
	String sex;
	double score;
	static String  schoolName;
	
	public Student4(){
		
	}
	
	public Student4(String name,int age, String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public Student4(String name,int age, String sex,double score){		
		//new Student(name,age,sex);
		this(name,age,sex);
		this.score = score;

	}
	
	
	public static void getShoolName(){
		System.out.println("学校名称："+schoolName);
		//System.out.println(name);
		//System.out.println(this);
		//study();
		
	}
	public  void introduce(){
		//String  name ="abcdedfg";
		System.out.println(this.name+"  "+age+"   "+sex+"  "+ score+"  "+schoolName);		
		getShoolName();
	}
	
	
	public void study(){
		
		this.introduce();		
		//introduce();
		System.out.println(this.name +" study hard!");
	}
	
	public static void main(String[] args) {
		System.out.println(Student4.schoolName);
		Student4.schoolName="北京大学";
		
		Student4.getShoolName();
		
		//Student.name="abc";
		
		Student4 stu = new Student4();
		stu.name="小张";
		stu.age = 19;
		stu.sex ="男";
		stu.score = 98.5;
	//	stu.schoolName="北京尚学堂";
		
		//stu.introduce();
		stu.getShoolName();
		
		Student4 stu2 = new Student4("小王",78,"男",0.5);
		//stu2.schoolName="bjsxt";
		//stu2.introduce();
		
		
		stu.study();
		stu2.study();
		
		//创建很多的学生
	}
	
	
}
