package com.bjsxt.oop.object2;
/**
 * ���ܣ���������ʱ�������ݣ�������������  �����������ͣ�
 * ���ܣ���������������ֵ
 * 
 * ���ۣ�ʹ�û��������������������޷���swap�������޸�main�б�����ֵ
 * 
 * @author Administrator
 *
 */
public class TestMethod {

	public static void main(String[] args) {
		//����2������
		int num1 = 30;
		int num2 = 50;
		//�������ǰ����������ֵ
		System.out.println("����ǰ��num1="+num1+",num2="+num2);
		//����
		swap(num1,num2);
		//�������������������ֵ
		System.out.println("������num1="+num1+",num2="+num2);
		
	}
	
	public static void  swap(int num1,int num2){
		System.out.println("swap ����ǰ��num1="+num1+",num2="+num2);
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("swap ������num1="+num1+",num2="+num2);
	}
}
