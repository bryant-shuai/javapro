package com.bjsxt.oop.inheritance5;

public class Fish extends Animal{
	double weight;//����	
	
	public Fish(){		
	}	
	public Fish(int age,double weight){
		//this.age = age;
		super(age);
		this.weight = weight;
	}
	public void swim(){
		System.out.println("����ˮ����������");
	}	
	public void introduce(){
		System.out.println("����һ��"+weight+"���ص���");
		//System.out.println("����"+age+"����");
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
