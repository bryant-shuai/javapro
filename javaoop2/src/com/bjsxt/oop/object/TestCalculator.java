package com.bjsxt.oop.object;

public class TestCalculator {

	public static void main(String[] args) {
		//自己计算
		int  num1 = 30;
		int num2 = 20;
		int result = num1+num2;//不仅要知道做什么，还得知道怎么做
		System.out.println(result);
		
		//使用计算器计算
		num1 = 40;
		num2 = 60;
		//拿来一个计算器
		Calculator calc= new Calculator();
		//使用计算器进行计算
		int sum = calc.add(num1, num2);
		//add(num1,num2);
		//输出结果
		System.out.println(sum);
	}
	
}
