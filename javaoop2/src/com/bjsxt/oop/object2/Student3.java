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
 * 1.static变量的内存分配图：在方法区中
 * 
 * 
 * 2.非静态变量和静态变量
 * double score;               非静态变量   实例变量   每个对象一份
 * static String  schoolName;  静态变量    类变量       每个类的所有对象共用一份
 * 
 * 3.非静态变量和静态变量的区别
 *  1.在内存中存储的位置不同
 *       堆内存           方法区 *  
 *  2.在内存中份数不同
 *      每个对象一份       所有对象共享一份  *      
 *  3.访问的方式不同
 *  	对象名.非静态变量  stu.name="小张"; *  
 *  	对象名.静态变量  stu.schoolName="北京尚学堂";
 *  	类名.静态变量  Student.schoolName="北京大学"; 推荐该方式 *  
 *  4.在内存中分配空间的时间不同
 *  	创建对象时给非静态变量分配空间
 *       第一次加载类的时候，就会在方法区中给静态变量分配空间
 * 
 * 
 * 

 * 
 * 学生类
 * @author Administrator
 *
 */
public class Student3 {

	String name;
	int age;
	String sex;
	double score;
	static String  schoolName;
	
	public Student3(){
		
	}
	
	public Student3(String name,int age, String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public Student3(String name,int age, String sex,double score){		
		//new Student(name,age,sex);
		this(name,age,sex);
		this.score = score;

	}
	
	public  void introduce(){
		//String  name ="abcdedfg";
		System.out.println(this.name+"  "+age+"   "+sex+"  "+ score+"  "+schoolName);
	}
	
	public void study(){
		
		this.introduce();		
		//introduce();
		System.out.println(this.name +" study hard!");
	}
	
	public static void main(String[] args) {
		System.out.println(Student3.schoolName);
		Student3.schoolName="北京大学";
		//Student.name="abc";
		
		Student3 stu = new Student3();
		stu.name="小张";
		stu.age = 19;
		stu.sex ="男";
		stu.score = 98.5;
	//	stu.schoolName="北京尚学堂";
		
		//stu.introduce();
		
		
		Student3 stu2 = new Student3("小王",78,"男",0.5);
		//stu2.schoolName="bjsxt";
		//stu2.introduce();
		
		
		stu.study();
		stu2.study();
		
		//创建很多的学生
	}
	
	
}
