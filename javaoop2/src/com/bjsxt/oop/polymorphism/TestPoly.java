package com.bjsxt.oop.polymorphism;
/**
 * 1.ʲô�Ƕ�̬ 
 *    Person person = new English();
		person.eat();
	 ��������󸳸���������ñ��������ͨ���������ñ������õľ�Ȼ���������д�ķ���
	 �������ͬ������ֶ�����̬ ��̬	 
 * 2.��̬������
 * 		1.�̳� Person  Chinese/English/Italian û�м̳о�û�ж�̬
 *      2.��������д   eat() *      
 *      3.��������󸳸���������ñ�����������д�ķ���  Person person = new English();person.eat();
 *     
 * 3.��̬ �ô�
 *    1.���ٴ�������������ָ���ķ������أ�
 *    2.������չ
 *    
 * 4.��̬������Ҫ��ʹ�ó���
 * 		ʹ�ø������������βΣ�ʵ�ο������������������
 * 		public static void showEat(Person person){}
 * 
 * 
 * @author Administrator
 *
 */
public class TestPoly {

	public static void main(String[] args) {
		Chinese ch = new Chinese();
		ch.sleep();
		ch.eat();
		ch.playShadowboxing();		
		
		Person person = new English();
		person.sleep();//��̬
		person.eat();//��̬
		//person.playShadowboxing();//��̬
	
		

	}

}
