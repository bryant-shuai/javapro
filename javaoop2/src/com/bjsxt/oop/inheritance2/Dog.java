package com.bjsxt.oop.inheritance2;
/**
 * 狗狗类
 * 
 * 问题：动物的共有的属性和方法会重复的出现在每个类的代码中，导致代码重复，不利于修改删除
 * 解决：将动物的共有的属性和方法提取出来放到父类中，让具体的动物继承父类，从而获取公共的属性和方法
 *     避免了代码的重复
 *  
 *   总结
 *   1.继承  
 *   父类 ：Animal
 *   子类：Dog Snake
 *   
 *   2.继承好处
 *   	避免代码重复
 *   
 *   3.如果省略extends,默认extends Object
 *   	Object是所有的类的顶级类
 *    
 * @author Administrator
 *
 */
public class Dog extends Animal{
	 //Dog特有的属性
	//String color;
	String nickName;
	String strain;//sort 	
	
	public Dog() {
		super();
	}
	public Dog(String color, int age, String nickName, String strain) {
		super();
		this.color = color;
		this.age = age;
		this.nickName = nickName;
		this.strain = strain;		
	}
	//成员方法
	//Dog特有的方法
	public void guard(){
		System.out.println("guarding........");		
	}
	public void introduce(){
		//从父类继承的内容(调用父类的introduce)
		//super.introduce();
		//System.out.println("Animal "+ color+"  "+ age );
		//子类自己的内容
		//System.out.println("Dog "+  nickName+"   "+strain );
		//System.out.println("Dog "+ super.color+" "+super.age+ "  "+ this.nickName+"   "+this.strain);
		System.out.println("Dog "+ this.color+" "+this.age+ "  "+ this.nickName+"   "+this.strain);
	}
	@Override
	public String toString() {
		return "[Dog: color="+color+",age="+age+",nickName="+nickName+",strain="+strain+"]";
	}
	
	
	public Dog method1(String str,int n) throws RuntimeException{
		return null;
	}
	
}
