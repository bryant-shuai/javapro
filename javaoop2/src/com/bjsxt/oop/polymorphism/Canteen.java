package com.bjsxt.oop.polymorphism;
/**
 * ȱ��1��showEat()̫���ˣ����ÿһ�����ҵ��˶�Ҫ��һ��showEat()
 * ȱ��2��ÿ����һ�����࣬��Ҫ������һ���Է��ķ���showEat().,�����Ͽ���ԭ��
 * 
 * �����������̬�� ʹ�ø������β�
 * 
 * �ŵ�1���������˴�������
 * �ŵ�2�����Ͽ���ԭ�������޸ĺ�ά��
 * 
 * @author Administrator
 *
 */
public class Canteen {

	public static void main(String[] args) {
		//�й������˲��Է�
		Chinese  ch = new Chinese();
		Person p = ch;
		showEat(p);//
		//Ӣ�������˲��Է�
		English en = new English();
		showEat(en);
		//person���˲��Է�
		Person person = new Person();
		showEat(person);
		//����������˲��Է�
		Italian it = new Italian();
		showEat(it);
		
		Person person2 = new English();
		showEat(person2);
		
	}
	
	public static void showEat(Person person){
		person.eat();//���õ�������ķ����������Ǹ����
	}
}