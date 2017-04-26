package com.bjsxt.oop.polymorphism;
/**
 * 多态只和方法有关，和属性无关
 * @author Administrator
 *
 */
public class TestPoly3 {

	public static void main(String[] args) {
		Chinese ch = new Chinese();
		System.out.println(ch.name);
		
		Person p = new Person();
		System.out.println(p.name);
		
		Person p2 = new Chinese();
		System.out.println(p2.name);//小明
	}

}
