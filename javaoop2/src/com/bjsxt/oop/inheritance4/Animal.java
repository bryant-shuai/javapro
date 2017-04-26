package com.bjsxt.oop.inheritance4;

public class Animal extends Object {

	// ���ж��ﶼ���е�����
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

	// ���ж��ﹲ�еķ���
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
	 * Animal����д�丸��Object��toString()
	 */
	public String toString() {
		return "[Animal:color ="+color+",age="+age+"]";
	}
	
	 public boolean equals(Object obj) {
	     //���obj��null ��ֱ�ӷ���false
		 if(obj == null){
			 return false;
		 }
		 //���obj��this��ͬһ����������Ƚϣ�ֱ�ӷ���true
		 if(this == obj){
			 return true;
		 }
		 //�Ƚ����������color���Ժ�age�����Ƿ���ͬ
		 Animal other = (Animal)obj;
		 if(this.color.equals(other.color)&&this.age==other.age){
			 return true;
		 }else{
			 return false;
		 }		 
	  }
}
