package com.bjsxt.oop.inheritance;

public class Test {

	public static void main(String[] args) {
		//�������ﲢ����
		Animal an = new Animal();
		an.color="red";
		an.age = 3;
		an.eat();
		an.sleep();
		an.introduce();
		
		
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
		

	}

}
