package com.bjsxt.oop.polymorphism;
/**
 * ��̬��ʹ�ó��� 
 * 1.ʹ�ø������������β�  ����Ҫ��
 *    showEat(Person person)
 *    equals(Object obj)
 * 2. ʹ�ø���������ֵ���� * 
 * ȱ�ݣ�Person p1 = new Chinese(); ��ҵҪ��ͷ����Ա�����ɱ��ߣ�������
 * �������ҵֱ�Ӵ�ѧУ��Ƹ������Ӧ���ܵ�Ա�����ɣ������Ĺ�����ר�ŵĻ�����ɣ�ѧУ��
 * 		
 * @author Administrator *
 */
public class TestPoly5 {

	public static void main(String[] args) {
		//��ҵ������һ��Ա��
		//Person p1 = new Chinese();
		//��ҵ��ѧУֱ����Ƹ��һ��Ա��
		Person p1 = School.getPerson("ch");
		//Ա������ҵ�Է� ����  ����
		p1.eat();
		p1.sleep();		
		
		//��ҵ������һ��Ա��
		//Person p2 = new English();
		//��ҵ��ѧУֱ����Ƹ��һ��Ա��
		Person p2 = School.getPerson("en");
		p2.eat();
		p2.sleep();		
		
		//��ҵ������һ��Ա��
		//Person p3 = new Italian();
		Person p3 = School.getPerson("it");
		p3.eat();
		p3.sleep();
	}

}
