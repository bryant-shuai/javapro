package com.bjsxt.oop.inheritance;
/**
 * ������
 * 
 * ���⣺����Ĺ��е����Ժͷ������ظ��ĳ�����ÿ����Ĵ����У����´����ظ����������޸�ɾ��
 * �����������Ĺ��е����Ժͷ�����ȡ�����ŵ������У��þ���Ķ���̳и��࣬�Ӷ���ȡ���������Ժͷ���
 *     �����˴�����ظ�
 *  
 *   �ܽ�
 *   1.�̳�  
 *   ���� ��Animal
 *   ���ࣺDog Snake
 *   
 *   2.�̳кô�
 *   	��������ظ�
 *   
 *   3.���ʡ��extends,Ĭ��extends Object
 *   	Object�����е���Ķ�����
 *    
 * @author Administrator
 *
 */
public class Dog extends Animal{


	 //Dog���е�����
	String nickName;
	String strain;//sort 
	
	
	public Dog() {
		super();
	}
	public Dog(String color, int age, String nickName, String strain) {
		super();
		this.color = color;
		this.age = age;
		this.nickName = nickName;
		this.strain = strain;	
		
	}

	//��Ա����
	//Dog���еķ���
	public void guard(){
		System.out.println("guarding........");		
	}
}
