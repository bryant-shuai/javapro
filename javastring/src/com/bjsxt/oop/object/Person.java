package com.bjsxt.oop.object;
/**
 * 人类
 * @author Administrator
 * 
 * 
 * 
 * 1.类和对象的定义
 * 	类 class     Person   TestPerson  String  System  Scanner
 *  对象 object 实例 instance   xh  lz  input
 *  
 *  类是抽象的，对象是具体的，对象是类的实例  一个类可以创建多个实例
 *  类比作图纸，模具
 *  对象比作按照图纸完成的实物，按照模具制造的铸件
 *  
 *  类分为两大类
 *   自定义类 Person   TestPerson
 *   系统类 String  System  Scanner
 *   
 * 2.类的成员变量
 * 			String name;//姓名
			int age;//年龄
			String sex;//性别
			
 *        成员变量表示类的静态特征，也称为属性，
 * 		成员变量有默认值：int 0 / double 0.0  boolean:false char '\u0000' 引用类型  null
 *      也可以在定义变量时赋值
 *      
 *      成员变量和局部变量的区别
 *      1.成员变量是属于类的，局部变量是属于方法的
 *      2.成员变量有默认值，局部变量没有默认值
 *      3.成员变量的作用域至少是当前类，  局部变量的作用域当前方法
 *      
 * 3.类的成员方法
 * 		public void eat(){ }
 *      public void sleep(String address){ }
 *      public String introduce(){ }
 *      
 *      public          void/String/int  sleep(String address){              }
 *     权限修饰符（作用范围）          返回值类型                               方法名            参数列表（0，1，n）   方法体
 *     
 *     方法的作用：
 *     1.封装了功能，方便调用
 *     2.避免代码重复
 *     
 *     一个类的方法可以直接调用该类的属性和方法
 *
 */
public class Person {
	//静态的特征:名词 属性 成员变量
	String name="无名氏";//姓名
	int age;//年龄
	String sex;//性别
	
	//动态的行为  成员方法 方法   动词
	/**
	 * 吃饭
	 */
	public void eat(){
		//int n=5;
		System.out.println("eating three times every day！！！！");
		//sleep("");
		//return;
	}
	/**
	 * 休息
	 * @param address 地址
	 */
	public void sleep(String address){
		//System.out.println(n);
		System.out.println(name +" sleeping at "+address);
	}
	/**
	 * 自我介绍
	 * @return 自我介绍信息
	 */
	public String introduce(){
		//System.out.println("name is"+name+",age is"+age+",sex is"+sex);
		return "name is"+name+",age is"+age+",sex is"+sex;
	}	
}
