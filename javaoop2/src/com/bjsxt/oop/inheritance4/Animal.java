package com.bjsxt.oop.inheritance4;

public class Animal extends Object {

	// 所有动物都具有的属性
	String color;
	int age;

	public Animal() {
		super();
	}

	public Animal(String color, int age) {
		super();
		this.color = color;
		this.age = age;

	}

	// 所有动物共有的方法
	public void eat() {
		System.out.println("eating ......");
	}

	public void sleep() {
		System.out.println("sleeping.......");
	}

	public void introduce() {
		System.out.println("Animal " + color + "  " + age);
	}
	/**
	 * Animal类重写其父类Object的toString()
	 */
	public String toString() {
		return "[Animal:color ="+color+",age="+age+"]";
	}
	
	 public boolean equals(Object obj) {
	     //如果obj是null ，直接返回false
		 if(obj == null){
			 return false;
		 }
		 //如果obj和this是同一个对象，无需比较，直接返回true
		 if(this == obj){
			 return true;
		 }
		 //比较两个对象的color属性和age属性是否相同
		 Animal other = (Animal)obj;
		 if(this.color.equals(other.color)&&this.age==other.age){
			 return true;
		 }else{
			 return false;
		 }		 
	  }
}
