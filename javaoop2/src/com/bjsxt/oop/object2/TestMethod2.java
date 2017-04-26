package com.bjsxt.oop.object2;
/**
 * 技能：方法调用时参数传递（基本数据类型  引用数据类型）
 * 功能：交换两个变量的值
 * 
 * 结论：使用引用类型数据做参数，可以在swap方法中修改main中变量的值
 * 
 * @author Administrator
 *
 */
public class TestMethod2 {

	int num1;
	int num2;
	
	public static void main(String[] args) {
		//定义2个变量
		TestMethod2 tm2 = new TestMethod2();
		tm2.num1 = 10;
		tm2.num2 = 20;
		//输出交换前两个变量的值
		System.out.println("交换前：num1="+tm2.num1+",num2="+tm2.num2);
		//交换
		swap(tm2);
		//输出交换后两个变量的值
		System.out.println("交换后：num1="+tm2.num1+",num2="+tm2.num2);		
	}
	
	public static void swap(TestMethod2 tm){
		int temp;		
		temp = tm.num1;
		tm.num1 = tm.num2;
		tm.num2 = temp;		
	}	
	
}
