package com.bjsxt.oop.polymorphism;
/**
 * 单例模式
 * 
 * 简单工厂模式
 * 1.定义一个static方法，可以通过类名直接访问
 * 2.返回值是父类类型，就可以返回所有的子类的类型
 * 3.需要一个参数，工厂会根据参数生产并返回对应的产品
 * 
 * @author Administrator
 *
 */
public class School {

	public static Person getPerson(String name){
		Person p ;
		
		if("ch".equals(name)){
			p = new Chinese();
		}else if("en".equals(name)){
			p = new English();
		}else {
			p = new Italian();
		}
		return p;
	}
}
