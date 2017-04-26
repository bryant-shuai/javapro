package com.bjsxt.oop.encapsulation;
/**
 * 问题1：person.age = 300; 不符合实际情况，需要相应的控制
 * 问题2：person.name="张三";相同的语句在不同的类中，不同的包中可能会出现错误
 * 
 * 解决：合理的封装
 * 
 * 1.什么是封装
 *   电视机
 *   汽车
 *   好处
 *   1.大大降低了使用的难度
 *   2.大大提高了安全性
 * 
 * 2.使用权限修饰符进行封装
 * 	 private  当前类  类可见  范围最小
 *   默认 当前包的所有类   包可见
 *   protected  当前包所有类+其他包所有子类
 *   public  当前项目所有包的所有类  范围最大  当前包所有类+其他包所有类 *   
 *   权限范围越来越大
 * 
 * 
 * 3.对类的成员进行封装
 *  	1.成员变量
 *  		1.属性private   private int age;
 *  		2.提供public的方法对属性进行操作
 *  			public int getAge(){
					return age;
				}
				public void setAge(int age){		
					this.age = age;			
				}
			3.可以在方法中对范围进行判断
				public void setAge(int age){
					if(age <0 || age>130){
						this.age = 20;
					}else{
						this.age = age;
					}		
				}
		  大多数情况下private，对于个别情况可以protected，让子类直接访问		  
 *      2.成员方法
 *      	1.如果希望其他类来访问，设置为public
 *      	2.如果只是被当前类的某些方法调用，而不希望外部类来访问，设置为private
 *      	3.设置为默认或者protected的情况不多 *      
 *      3.构造方法
 *      	1.一般都是public	2.一种极度情况设置为private（必如单例模式）*   * 
 * 4.对类进行封装 
 * 	只能使用public和默认，不能使用protected和private
 * public 所有包都可见   并且要求类名和文件名相同
 * 默认  当前包可见
 * 
 * 
 * 
 * 
 */
public class Test {
	public static void main(String[] args) {
		Person person = new Person();			
		//person.name="张三";
		//person.age = 300;
		person.setName("张三");
		person.setAge(30);
		person.introduce();
		System.out.println(person.getName());
		int age = person.getAge();
		System.out.println(age);
	}
}
