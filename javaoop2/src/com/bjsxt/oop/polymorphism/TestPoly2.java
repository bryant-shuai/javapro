package com.bjsxt.oop.polymorphism;
/**
 * ����ת�ͣ���������󸳸���������ñ�����
 * 
 *  Person person = new Chinese();//�Զ�ת��
	person.sleep();//���õ��ǴӸ���̳е�
	person.eat();//���õ�������ģ���д����ģ�
	person.playShadowboxing();//�޷������������еķ���	
 * 
 * ��ҵ��ƸԱ��
 * 
 * Person person = new Chinese();//�й��ˣ�Ӣ���˶����Գ�Ϊ��˾��Ա��������Ҫ�ر�����������Ҫ��
 * person.sleep();//��������ʱ�����е�Ա����Ϣ�ķ�ʽ����һ����
 * person.eat();//����ȥʳ�óԷ���ԭ�α�¶��ÿ�������˳Է���ʽ��һ��
 * person.playShadowboxing();//�ϰ�����Ҹ�Ա��һ����ϰ̫��ȭ�������ԣ���Ϊ���Ա��������Ӣ���ˣ��������
 * 
 * @author Administrator
 *
 */
public class TestPoly2 {

	public static void main(String[] args) {
		//�����������͵�����ת������>�� �Զ�ת����
		int n =5;
		double d= n;//�Զ�ת��
		//double d = 5;
		System.out.println(d);
		
		//�����������͵�����ת��(�������ñ��� = ������� �Զ�ת��)
		Person person = new Chinese();
		person.sleep();
		person.eat();
		//person.playShadowboxing();
	}

}
