package com.bjsxt.oop.object;
/**
 * 技能：方法的重载
 * 功能：使用计算器完成加法运算
 * 
 * 分析：目前计算器类的缺陷：
 * 	三个整数求和，两个double数求和
 * 
 * 总结：方法的重载
 * 1.方法重载的定义
 *    overload  
 *    方法名相同，参数不同，
 *    一个方法名具有多种形式，java会根据参数的情况自动调用相应的方法
 * 2.判断的依据
 * 		1.方法名相同
 * 		2.参数不同：个数不同  类型不同，
 * 		3.和参数名没关系
 * 		4.和返回值类型，和权限修饰符没有关系
 * 3.好处
 *    一个方法名可以实现，增加了功能，提高了可读性 * 
 * 4.已经学过了方法的重载
 *  System.out.println();
 * 
 * 计算器类
 * @author Administrator
 *
 */
public class Calculator2 {
	private String brand;//品牌
	
	public static void main(String[] args) {
		
		//使用计算器计算
		int num1 = 40;
		int num2 = 60;
		int num3 = 80;
		//拿来一个计算器
		Calculator2 calc= new Calculator2();
		//使用计算器进行计算
		int sum = calc.add(num1, num2);//方法调用  实在参数  实参		
		//输出结果
		System.out.println(sum);
		
		//三个整数相加
		int sum2 = calc.add(10, 30, 90);
		System.out.println(sum2);
		//两个double数相加
		System.out.println(calc.add(3.14, 4.31));
		
	}
	
	public int add(int num1,int num2){//方法声明  方法定义 形式参数  形参
		//计算
		int sum = num1+num2;
		//返回结果
		return sum;
		
	}
	/*
	 * 三个整数相加
	 */
	public int add(int num1,int num2,int num3){		
		return num1+num2+num3;
	}
	/*
	 * 两个double数相加
	 */
	public double add(double num1,double num2){
		return num1+num2;
	}
}
