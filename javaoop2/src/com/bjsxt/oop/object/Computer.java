package com.bjsxt.oop.object;
/**
 * 技能：复习类和对象，构造方法及其重载
 * 功能：购买指定配置的计算机并运行
 * 
 * 
 * 总结
 * 1.构造方法constructor
 *  1.特征  方法名和类名相同   不写返回值类型
 *  2.作用: 初始化操作  必如给成员变量赋初始值
 *  3.调用：new Computer()
 *  4.不提供构造方法，系统会默认提供一个无参数的构造方法
 *  
 * 缺点： 组装一台计算机使用的语句太多了，繁琐
 * 解决：在创建对象时提供属性值
 *   如果在类中，成员变量和局部变量同名，该定义局部变量的方法中，起作用的是局部变量，成员变量被屏蔽
 *   如果想使用成员变量，需要使用this前缀
 *   
 *   构造方法的重载
 *   
 * 如果没有提供构造方法，默认提供一个无参数的构造方法
 * 如果已经提供了有参数构造方法，则无参数构造方法将不再提供
 * 如果需要，手动添加无参数构造方法
 * 记住:每个类最好都要提供一个无参数的构造方法
 * 计算机类
 * @author Administrator
 *
 */
public class Computer {
	//属性
	private String cpu;
	private String mainBoard;
	private String memory;
	private String keyboard;
	private String mouse;
	//构造方法 构造器
	public  Computer(){
		System.out.println("-----Computer()-----");
		cpu="AMD123";
	}
	
	
	public Computer(String cpu,String mainBoard,String memory,String keyboard,String mouse){
		//System.out.println(cpu);
		this.cpu = cpu;
		this.mainBoard = mainBoard;
		this.memory = memory;
		this.keyboard = keyboard;
		this.mouse=mouse;
	}
//	public Computer(String cpu1,String mainBoard1,String memory1,String keyboard1,String mouse1){
//		cpu = cpu1;
//		mainBoard = mainBoard1;
//		memory = memory1;
//		keyboard = keyboard1;
//		mouse=mouse1;
//	}
	//方法	
	public void start(){
		System.out.println("starting...........");
	}	
	
	public void close(){
		System.out.println("closing............");
	}
	
	public void showInfo(){
		System.out.println(cpu+"   "+mainBoard+"   "+memory+"   "+keyboard+"   "+mouse);
	}
	
	public static void main(String[] args) {
		//购买电脑（创建对象）
		Computer computer = new Computer();
		//指定配置（给属性赋值）
		computer.cpu="Intel i7";
		computer.mainBoard="ASUS";
		computer.memory="金士顿";
		computer.keyboard="罗技键盘";
		computer.mouse="罗技鼠标";		
		//测试电脑（调用方法）
		computer.start();
		computer.showInfo();
		computer.close();
		
		////购买电脑并指定配置
		Computer computer2 = new Computer("AMD","技嘉","三星","双飞燕键盘","双飞燕鼠标");
		////测试电脑
		computer2.start();
		computer2.showInfo();
		computer2.close();
	}
	
}
