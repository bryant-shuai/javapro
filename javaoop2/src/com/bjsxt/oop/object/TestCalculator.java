package com.bjsxt.oop.object;

public class TestCalculator {

	public static void main(String[] args) {
		//�Լ�����
		int  num1 = 30;
		int num2 = 20;
		int result = num1+num2;//����Ҫ֪����ʲô������֪����ô��
		System.out.println(result);
		
		//ʹ�ü���������
		num1 = 40;
		num2 = 60;
		//����һ��������
		Calculator calc= new Calculator();
		//ʹ�ü��������м���
		int sum = calc.add(num1, num2);
		//add(num1,num2);
		//������
		System.out.println(sum);
	}
	
}
