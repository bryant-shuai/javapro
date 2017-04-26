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
public class Point2 {
	//成员变量
	int x;
	int y;
	int z;
	//构造方法
	public Point2(){
		//super();
	}	
	public Point2(int x,int y ,int z){
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
	/**
	 * 计算当前坐标点到另外一个坐标点的距离
	 * @param x 另外一个坐标点 的x
	 * @param y 另外一个坐标点 的y
	 * @param z 另外一个坐标点 的z
	 * @return
	 * pow 平方
	 * sqrt 开平方
	 */
	public double calcDistance(int x,int y,int z){
		//System.out.println("另外坐标点（"+x+" "+y+" "+z+"）");
		//System.out.println("当前坐标点（"+this.x+" "+this.y+" "+this.z+"）");
		int power =  (this.x-x)*(this.x-x)+(this.y-y)*(this.y-y)+(this.z-z)*(this.z-z);		
		double result = Math.sqrt(power);
		return result;		
	}
	/**
	 * 计算当前坐标点到另外一个坐标点的距离
	 * @param p  另外一个坐标点
	 * @return
	 */
	public double calcDistance(Point2 p){
		System.out.println("当前坐标点（"+this.x+" "+this.y+" "+this.z+"）");
		System.out.println("另外坐标点（"+p.x+" "+p.y+" "+p.z+"）");
		int power =  (this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y)+(this.z-p.z)*(this.z-p.z);		
		double result = Math.sqrt(power);
		return result;		
	}
	
	public static void main(String[] args) {
		//创建坐标1并输出
		Point2 p1 = new Point2();
		p1.x = 10;
		p1.y = 10;
		p1.z = 20;
		p1.showInfo();
		//创建坐标2并输出
		Point2 p2 = new Point2(10,20,30);
		p2.showInfo();
		
		//计算p1到p2点之间的距离
		double dis = p1.calcDistance(10, 20, 30);
		System.out.println(dis);
		
		//计算p1到p2点之间的距离
		double dis2 = p2.calcDistance(p2);
		System.out.println(dis2);
		
		
	}
	

}
