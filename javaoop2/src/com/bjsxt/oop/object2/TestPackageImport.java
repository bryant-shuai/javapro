package com.bjsxt.oop.object2;

import com.bjsxt.oop.*;
import com.bjsxt.oop.object.*;
import com.bjsxt.oop.object.Student;

import static java.lang.Math.*;
/**
 * 一、包package
 * 
 * 1.为什么需要包
 *   为什么计算机的硬盘需要不同级别的文件夹
 *  	 因为硬盘上文件太多了
 *   	1.方便管理 
 *      2.一个文件夹中不能有同名的文件，但是不同文件夹中可以有同名文件
 *    中国很多社区和村庄
 *    	河北省 石家庄市  赵县  平山  西柏坡*  * 
 * 2.如何定义包
 *    com.bjsxt.oop.object
 *    cn.com.sina.video....
 *    com.bjsxt.stumgr.dao
 *    com.bjsxt.stumgr.dao.impl
 *    顶级域名.机构.项目名.模块.子模块
 *    
 *    包名全部小写
 *    
 *    java.util    
 * 
 * 3.如何使用包
 * 		package com.bjsxt.oop.object;
 * 		 必须；结尾
 *      必须是类的第一条语句 * 
 * 
 * 4.Java常用包
 *     java.util.Scanner(utility 工具)
 *     java.lang.String(language 语音   该包下的类可以直接使用，不需要import)
 *     java.lang.System
 *     java.io input/ouput 输入输出流
 *     java.net 网络编程
 
 * 
 * 二、import 导入
 *   1.为什么需要导入
 *   	同个包中的类不需要导入
 *      使用不同包中的类（和接口）需要导入
 *      不导入也可以 需要完整路径  
 *      java.util.Scanner input = new java.util.Scanner(System.in);
 *   2.如何导入
 *   	import com.bjsxt.oop.object.Calculator;
			import com.bjsxt.oop.object.Computer;
			import com.bjsxt.oop.object.Person;
		import com.bjsxt.oop.object.*;
		
		
 *   3.注意事项
 * 		1.默认是当前包
 *      2.java.lang包下的类和接口不需要导入
 *      3.import com.bjsxt.oop.object.*; 导入该包下所有类和接口（不包括下级包）
 *      4.如果多个包下有同名类，只能使用import导入一个类，其他同名类需要给出完整路径
 *      5.静态导入  导入的不是类，是类的静态方法和属性
 *          import static java.lang.Math.*;
 * 
 * 
 * @author Administrator
 *
 */
public class TestPackageImport {

	public static void main(String[] args) {
//		java.util.Scanner input = new java.util.Scanner(System.in);
//		com.bjsxt.oop.object.Person person = new com.bjsxt.oop.object.Person();//		
//		TestMethod t = new TestMethod();
		Test test = new Test();
		Calculator calc = new Calculator();
		Person person = new Person();
		Point p = new Point();
		Computer comp = new Computer();//ctrl+shift+o
		
		Student stu = new Student();
		com.bjsxt.oop.object2.Student stu2 = new com.bjsxt.oop.object2.Student();
		com.bjsxt.oop.Student stu3 = new com.bjsxt.oop.Student();
		
//		System.out.println(Math.sqrt(25));
//		System.out.println(Math.pow(4, 2));
//		System.out.println(Math.abs(-34));
//		System.out.println(Math.PI);
		
		System.out.println(sqrt(25));
		System.out.println(pow(4, 2));
		System.out.println(abs(-34));
		System.out.println(PI);
		
		
		

	}

}
