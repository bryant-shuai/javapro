package com.bjsxt.oop.inheritance5;
/**
 * �̳�����
 * 1.�̳еĶ����ʵ�֣�extends��
 * 
 * 
 * 
 * 2.������д override  introduce()  toString()  equals();
 * 3.super 
 * 		1.ֻ�д����˶������У�ÿ��������һ��super����
 *      2.super��ǰ�����ֱ�Ӹ������
 *      3.super���Է��ʳ�Ա����  ��Ա����  ���췽�� *      
 * 4.�̳������´������������ڴ�������
 * 	Dog dog= new Dog()
 *  ���϶��´���Object��Animal��Dog�������󣬸�����֮��ͨ��super�ؼ�����ϵ *  
 * 5.==��equals()���������ϵ
 * 
 * 
 * 6.���
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		Animal an = new Animal(6);
		an.introduce();
		System.out.println(an.toString());
		
		Animal an2 = new Animal(6);
		System.out.println(an.equals(an2));

	}

}
