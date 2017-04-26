package com.bjsxt.oop.inheritance2;
/**
 * 问题1：Animal yellow  5 
 * Dog对象调用introduce方法，
 * 只能显示所有动物共有的属性，无法显示自己特有的属性
 * 解决：方法的重写（覆盖）  override
 * 
 * 
 * 方法的重写 override
 * 1.使用的时间
 * 	 父类的方法无法满足子类的要求
 * 
 * 2.重写的要求
 *  方法名相同
 *  参数相同
 *  返回值，权限修饰符相同肯定没有问题，也可以不同，后续深入讲解
 * 
 *  问题2：
 * System.out.println(an);
 * System.out.println(an.toString()) 默认调用toString()
 * 无论Animal，还是Dog，调用toString().调用的都是从Object继承的，但是已经无法满足要求，
 * 解决：重写
 * 不仅Animal重写，Dog也要重写
 * 
 * Object的toString()
 *   public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		//创建动物并操作
		Animal an = new Animal();
		an.color="red";
		an.age = 3;
		an.eat();
		an.sleep();
		an.introduce();
		System.out.println(an);//将参数转换成字符串并输出
		System.out.println(an.toString());		
		//创建Dog并操作
		Dog dog = new Dog();
		dog.color="yellow";//从父类继承的
		dog.age= 5;//从父类继承的
		dog.nickName="9527";//子类自己的
		dog.strain="哈士奇";//子类自己的
		dog.eat();//从父类继承的
		dog.sleep();//从父类继承的
		dog.introduce();//从父类继承的
		dog.guard();//子类自己的
		System.out.println(dog);
		System.out.println(dog.toString());

	}
	
	

}
