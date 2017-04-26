package com.bjsxt.oop.inheritance5;
/**
 * 动物类  父类
 * @author Administrator
 *
 */
public class Animal extends Object{

	int age;
	
	public Animal(){
		
	}
	
	public Animal(int age){
		this.age = age;
	}
	
	public void introduce(){
		System.out.println("今年"+age+"岁了");
	}

	public  String toString(){
		return "[Animal:age="+age+"]";
	}
	
	public boolean equals(Object obj){
		//1.
		if(obj == null){
			return false;
		}
		//2.
		if(this == obj){
			return true;
		}
		//3.
		Animal other = (Animal)obj;
		if(this.age == other.age){
			return true;
		}else{
			return false;
		}
	}
}
