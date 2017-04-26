package com.bjsxt.oop.inheritance5;

public class Fish extends Animal{
	double weight;//重量	
	
	public Fish(){		
	}	
	public Fish(int age,double weight){
		//this.age = age;
		super(age);
		this.weight = weight;
	}
	public void swim(){
		System.out.println("我在水里有限吐泡");
	}	
	public void introduce(){
		System.out.println("我是一条"+weight+"斤重的鱼");
		//System.out.println("今年"+age+"岁了");
		super.introduce();
	}	
	public  String toString(){
		return "[Fish:age="+super.age+",weight="+this.weight+"]";
	}	
	public boolean equals(Object obj){
		//1.
		boolean flag = super.equals(obj);
		if(!flag){
			return false;
		}
		//2.
		Fish other =(Fish)obj;
		if(this.weight == other.weight){
			return true;
		}else{
			return false;
		}
	}
}
