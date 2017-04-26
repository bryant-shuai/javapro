package com.bjsxt.oop.polymorphism;
/**
 * ����ģʽ
 * 
 * �򵥹���ģʽ
 * 1.����һ��static����������ͨ������ֱ�ӷ���
 * 2.����ֵ�Ǹ������ͣ��Ϳ��Է������е����������
 * 3.��Ҫһ����������������ݲ������������ض�Ӧ�Ĳ�Ʒ
 * 
 * @author Administrator
 *
 */
public class School {

	public static Person getPerson(String name){
		Person p ;
		
		if("ch".equals(name)){
			p = new Chinese();
		}else if("en".equals(name)){
			p = new English();
		}else {
			p = new Italian();
		}
		return p;
	}
}
