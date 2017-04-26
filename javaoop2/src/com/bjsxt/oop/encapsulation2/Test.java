package com.bjsxt.oop.encapsulation2;

import com.bjsxt.oop.encapsulation.Person;

public class Test {

	public static void main(String[] args) {
//		Person person = new Person();
//		person.name="张三";
//		person.age = 300;
		
		Person person = new Person("张三",50);
		person.introduce();
	}
}
