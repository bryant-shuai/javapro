package com.bjsxt.oop.object2;
/**
 * ���ܣ���������ʱ�������ݣ�������������  �����������ͣ�
 * ���ܣ���������������ֵ
 * 
 * ���ۣ�ʹ����������������������������swap�������޸�main�б�����ֵ
 * 
 * @author Administrator
 *
 */
public class TestMethod2 {

	int num1;
	int num2;
	
	public static void main(String[] args) {
		//����2������
		TestMethod2 tm2 = new TestMethod2();
		tm2.num1 = 10;
		tm2.num2 = 20;
		//�������ǰ����������ֵ
		System.out.println("����ǰ��num1="+tm2.num1+",num2="+tm2.num2);
		//����
		swap(tm2);
		//�������������������ֵ
		System.out.println("������num1="+tm2.num1+",num2="+tm2.num2);		
	}
	
	public static void swap(TestMethod2 tm){
		int temp;		
		temp = tm.num1;
		tm.num1 = tm.num2;
		tm.num2 = temp;		
	}	
	
}
