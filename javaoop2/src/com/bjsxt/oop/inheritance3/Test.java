package com.bjsxt.oop.inheritance3;
/**
 * 
 * 1.ÿ�����췽���ĵ�һ�����Ĭ����super(),����ʡ�ԣ������ǵ��ø�����޲������췽����
 * ����ÿ���඼Ҫ�ṩ�޲����Ĺ��췽��
 * 
 * 2.���������ڴ����ͼ
 *   Dog dog = new Dog();
 *   ������һ���������ʱ���ᰴ�ռ̳й�ϵ�����϶������δ����������
 *   Object Animal Dog
 *   ÿ�����󶼻�����������this��super
 *   thisָ��ǰ��������
 *   superָ��ǰ�����ֱ�Ӹ������
 *   �������¼�����֮��ͨ��super�ؼ�����ϵ������
 *   �����������׵�ַ�������ñ���
 * 		
 * 3.super�ؼ��ֵ�����
 * 	 ÿ�����󶼻���һ��super���ԣ�ָ����ǰ����ĸ������
 *  1.���ʸ�����������  super.color
 *  2.���ʸ������ĳ�Ա����   super.introduce(); *  
 *  3.���ʸ������Ĺ��췽��    super();   super(color,age);
 *  
 *  
 *  ���๹�췽���ĵ�һ����������
 *  1.super()  Ĭ��
 *  2.super(color,age);
 *  3.this()   this(color,age);  �ȵ��õ�ǰ������������췽����ͨ���������췽������super�����ø���Ĺ��췽��
 *  
 * �ڹ��췽���У�������ʹ��this��superͬʱ���ù��췽��
 * ��Ϊthis��super���ù��췽���������ǵ�һ����䣬
 * �����ؼ��ֶ����֣������ܶ��ǵ�һ�����
 *  * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {	
		//����Dog������
		Dog dog = new Dog();
		
		dog.color="yellow";//�Ӹ���̳е�
		dog.age= 5;//�Ӹ���̳е�
		dog.nickName="9527";//�����Լ���
		dog.strain="��ʿ��";//�����Լ���
		
		dog.eat();//�Ӹ���̳е�
		dog.sleep();//�Ӹ���̳е�
		dog.introduce();//�Ӹ���̳е�
		dog.guard();//�����Լ���
		System.out.println(dog);
		System.out.println(dog.toString());
		
		Dog  dog2 = new Dog("red", 3, "����", "��������Ȯ");
		System.out.println(dog2.toString());
		

	}

}
