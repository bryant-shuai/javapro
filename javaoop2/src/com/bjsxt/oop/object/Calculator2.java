package com.bjsxt.oop.object;
/**
 * ���ܣ�����������
 * ���ܣ�ʹ�ü�������ɼӷ�����
 * 
 * ������Ŀǰ���������ȱ�ݣ�
 * 	����������ͣ�����double�����
 * 
 * �ܽ᣺����������
 * 1.�������صĶ���
 *    overload  
 *    ��������ͬ��������ͬ��
 *    һ�����������ж�����ʽ��java����ݲ���������Զ�������Ӧ�ķ���
 * 2.�жϵ�����
 * 		1.��������ͬ
 * 		2.������ͬ��������ͬ  ���Ͳ�ͬ��
 * 		3.�Ͳ�����û��ϵ
 * 		4.�ͷ���ֵ���ͣ���Ȩ�����η�û�й�ϵ
 * 3.�ô�
 *    һ������������ʵ�֣������˹��ܣ�����˿ɶ��� * 
 * 4.�Ѿ�ѧ���˷���������
 *  System.out.println();
 * 
 * ��������
 * @author Administrator
 *
 */
public class Calculator2 {
	private String brand;//Ʒ��
	
	public static void main(String[] args) {
		
		//ʹ�ü���������
		int num1 = 40;
		int num2 = 60;
		int num3 = 80;
		//����һ��������
		Calculator2 calc= new Calculator2();
		//ʹ�ü��������м���
		int sum = calc.add(num1, num2);//��������  ʵ�ڲ���  ʵ��		
		//������
		System.out.println(sum);
		
		//�����������
		int sum2 = calc.add(10, 30, 90);
		System.out.println(sum2);
		//����double�����
		System.out.println(calc.add(3.14, 4.31));
		
	}
	
	public int add(int num1,int num2){//��������  �������� ��ʽ����  �β�
		//����
		int sum = num1+num2;
		//���ؽ��
		return sum;
		
	}
	/*
	 * �����������
	 */
	public int add(int num1,int num2,int num3){		
		return num1+num2+num3;
	}
	/*
	 * ����double�����
	 */
	public double add(double num1,double num2){
		return num1+num2;
	}
}
