package com.bjsxt.oop.object;


/**
 * ���ܣ���ʶ��Ͷ���
 * ���ܣ�С�죬���������˳Է������ҽ��ܣ���Ϣ
 * 
 * 4.��δ�������
 * Person xh = new Person();
 * Scanner  input  = new Scanner(System.in)
 * 
 * 5.��β�������
 * 	   xh.name="С��";
		xh.age=18;
		xh.sex="Ů";
 * ������.����
 * 
 * 
 * 6.��ε��÷���
 * xh.eat();
	String info =xh.introduce();
    xh.sleep("����");
 * ������.������
 * 
 * 7.��������ʱ�ڴ����ͼ
 * 
 *   �����������͵��ڴ����ֻ��ջ�ڴ��з���ռ�
 *   �����������͵��ڴ������ջ�ڴ�Ͷ��ڴ�����ռ�
 *   ջ�ڴ棺��������ñ���xh  lz
 *   ���ڴ棺����ľ�������
 * 
 * @author Administrator
 *
 */
public class TestPerson {

	public static void main(String[] args) {
		
		int  n = 5;
		//int n;
		//n=5;
		
		//С��Է������ҽ��ܣ���Ϣ
		//1.��������
		//Scanner  input  = new Scanner(System.in);//ctrl+shift+o
		//input.nextInt();
		//Person xh = new Person();
		Person xh;
		xh = new Person();
		//2.���Ը�ֵ
		xh.name="С��";
		xh.age=18;
		xh.sex="Ů";
		//3.���÷���
		xh.eat();
		String info =xh.introduce();
		System.out.println(info);
		xh.sleep("����");
		
		System.out.println("==================");
		
		//���ųԷ������ҽ��ܣ���Ϣ
		//1.��������
		Person  lz= new Person();
		//2.���Ը�ֵ
		lz.name="����";
		lz.age=54;
		lz.sex="��";
		//3.���÷���
		lz.eat();
		String  info2 = lz.introduce();
		System.out.println(info2);
		lz.sleep("�ù�");
	}
}