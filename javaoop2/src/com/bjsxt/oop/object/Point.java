package com.bjsxt.oop.object;
/**
 *���ܣ���ϰ����������������
 *1.��Ķ���!
 *2.��ĳ�Ա���������ԣ�!
 *3.��ĳ�Ա����!
 *4.��Ĺ��췽��!
 *5.�ֲ������ͳ�Ա����
 *6.����Ĵ�����ʹ��!
 *7.���������أ�
 *8.���췽��������!
 *9.ջ�ڴ�Ͷ��ڴ�
 *10.�����ĵ��ã������Ĵ���  ʵ�� �βΣ�
 *
 *���ܣ��������λ�ã��������������֮��ľ���
 * 
 * 
 * �����
 * @author Administrator
 *
 */
public class Point {
	//��Ա����
	int x;
	int y;
	int z;
	//���췽��
	public Point(){
		//super();
	}	
	public Point(int x,int y ,int z){
		//super();
		this.x = x;
		this.y = y;
		this.z =z;
	}
	//��Ա����
	/**
	 * ���������Ϣ
	 */
	public void showInfo(){
		System.out.println("x="+x+",y="+y+",z="+z);
	}
		
	public static void main(String[] args) {
		//��������1�����
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 10;
		p1.z = 20;
		p1.showInfo();
		//��������2�����
		Point p2 = new Point(10,20,30);
		p2.showInfo();		
	
		
	}
	

}
