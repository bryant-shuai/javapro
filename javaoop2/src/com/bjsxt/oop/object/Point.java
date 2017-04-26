package com.bjsxt.oop.object;
/**
 *技能：复习面向对象的所有内容
 *1.类的定义!
 *2.类的成员变量（属性）!
 *3.类的成员方法!
 *4.类的构造方法!
 *5.局部变量和成员变量
 *6.对象的创建和使用!
 *7.方法的重载！
 *8.构造方法的重载!
 *9.栈内存和堆内存
 *10.方法的调用（参数的传递  实参 形参）
 *
 *功能：输出坐标位置，计算两个坐标点之间的距离
 * 
 * 
 * 坐标点
 * @author Administrator
 *
 */
public class Point {
	//成员变量
	int x;
	int y;
	int z;
	//构造方法
	public Point(){
		//super();
	}	
	public Point(int x,int y ,int z){
		//super();
		this.x = x;
		this.y = y;
		this.z =z;
	}
	//成员方法
	/**
	 * 输出坐标信息
	 */
	public void showInfo(){
		System.out.println("x="+x+",y="+y+",z="+z);
	}
		
	public static void main(String[] args) {
		//创建坐标1并输出
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 10;
		p1.z = 20;
		p1.showInfo();
		//创建坐标2并输出
		Point p2 = new Point(10,20,30);
		p2.showInfo();		
	
		
	}
	

}
