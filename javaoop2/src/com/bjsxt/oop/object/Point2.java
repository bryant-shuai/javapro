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
public class Point2 {
	//��Ա����
	int x;
	int y;
	int z;
	//���췽��
	public Point2(){
		//super();
	}	
	public Point2(int x,int y ,int z){
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
	/**
	 * ���㵱ǰ����㵽����һ�������ľ���
	 * @param x ����һ������� ��x
	 * @param y ����һ������� ��y
	 * @param z ����һ������� ��z
	 * @return
	 * pow ƽ��
	 * sqrt ��ƽ��
	 */
	public double calcDistance(int x,int y,int z){
		//System.out.println("��������㣨"+x+" "+y+" "+z+"��");
		//System.out.println("��ǰ����㣨"+this.x+" "+this.y+" "+this.z+"��");
		int power =  (this.x-x)*(this.x-x)+(this.y-y)*(this.y-y)+(this.z-z)*(this.z-z);		
		double result = Math.sqrt(power);
		return result;		
	}
	/**
	 * ���㵱ǰ����㵽����һ�������ľ���
	 * @param p  ����һ�������
	 * @return
	 */
	public double calcDistance(Point2 p){
		System.out.println("��ǰ����㣨"+this.x+" "+this.y+" "+this.z+"��");
		System.out.println("��������㣨"+p.x+" "+p.y+" "+p.z+"��");
		int power =  (this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y)+(this.z-p.z)*(this.z-p.z);		
		double result = Math.sqrt(power);
		return result;		
	}
	
	public static void main(String[] args) {
		//��������1�����
		Point2 p1 = new Point2();
		p1.x = 10;
		p1.y = 10;
		p1.z = 20;
		p1.showInfo();
		//��������2�����
		Point2 p2 = new Point2(10,20,30);
		p2.showInfo();
		
		//����p1��p2��֮��ľ���
		double dis = p1.calcDistance(10, 20, 30);
		System.out.println(dis);
		
		//����p1��p2��֮��ľ���
		double dis2 = p2.calcDistance(p2);
		System.out.println(dis2);
		
		
	}
	

}
