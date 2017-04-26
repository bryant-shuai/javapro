package com.bjsxt.oop.object2;
/**
 * 技能：方法调用时参数传递（基本数据类型  引用数据类型）
 * 功能：交换两个变量的值
 * 
 * 结论：使用基本类型数据做参数，无法再swap方法中修改main中变量的值
 * 
 * @author Administrator
 *
 */
public class TestMethod {

	public static void main(String[] args) {
		//定义2个变量
		int num1 = 30;
		int num2 = 50;
		//输出交换前两个变量的值
		System.out.println("交换前：num1="+num1+",num2="+num2);
		//交换
		swap(num1,num2);
		//输出交换后两个变量的值
		System.out.println("交换后：num1="+num1+",num2="+num2);
		
	}
	
	public static void  swap(int num1,int num2){
		System.out.println("swap 交换前：num1="+num1+",num2="+num2);
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("swap 交换后：num1="+num1+",num2="+num2);
	}
}
