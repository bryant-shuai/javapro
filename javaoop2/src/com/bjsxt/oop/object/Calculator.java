package com.bjsxt.oop.object;
/**
 * 技能：复习类和对象   方法的调用   局部变量和成员变量的区别
 * 功能：使用计算器完成加法运算
 * 
 * 分析：用户只要输入两个加数即可，就可以直接得到结构，而不需要自己进行计算，交给计算器
 * 定义一个方法，直接调用方法即可
 * 
 * 类：Calculator
 * 类的成员变量：brand
 * 类的成员方法：add()  sub()  mul()  div()
 * 对象：calc
 * 
 * 总结1：方法的调用过程
 * 	1.方法声明  方法定义 形式参数  形参
 *  2.方法调用  实在参数  实参
 *  3.形参和实参要求个数相同，类型匹配（不是相同），
 *  4.形参和实参对变量名称没有要求，一般建议一致，增加可读性，减少变量名称的数量
 *  5.方法调用时会将每个实参付给对应的形参，
 *  6.形参和实参都是局部变量，在内存中占用不同的空间
 *  7.一定要明白方法调用时内存分配图：参数的传递过程
 *  
 * 总结2：成员变量和局部变量的区别
 *       brand |  a  b  num1  num2
 * 1.定义的位置不同     类中    方法中
 * 2.作用的范围不同    类中    当前方法中
 * 3.默认值不同      有默认值    没有默认值
 * 4.存放的位置不同  堆内存    栈内存中
 * 
 * 注意：
 * 1.static方法不能直接调用非static方法，必须先创建对象
 * 2.main方法可以直接写在计算器类，也可以拿出去
 * 计算器类
 * @author Administrator
 *
 */
public class Calculator {
	private String brand;//品牌
	
	public static void main(String[] args) {
//		//自己计算
//		int  num1 = 30;
//		int num2 = 20;
//		int result = num1+num2;//不仅要知道做什么，还得知道怎么做
//		System.out.println(result);
		
		//使用计算器计算
		int a = 40;
		int b = 60;
		//拿来一个计算器
		Calculator calc= new Calculator();
		//使用计算器进行计算
		int sum = calc.add(a, b);//方法调用  实在参数  实参
		//add(num1,num2);
		//输出结果
		System.out.println(sum);
	}
	
	public int add(int num1,int num2){//方法声明  方法定义 形式参数  形参
		//计算
		int sum = num1+num2;
		System.out.println(sum);
		//返回结果
		return sum;
		
	}
}
