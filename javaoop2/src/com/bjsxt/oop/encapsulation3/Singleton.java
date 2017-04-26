package com.bjsxt.oop.encapsulation3;
/**
 *  一个类可以有多个实例（对象）
 *  但是在某种情况下，可能需要一个类只能有一个实例
 *  
 *  1.某种情况
 *   Windows的Task Manager（任务管理器）就是很典型的单例模式
 *   windows的Recycle Bin（回收站）也是典型的单例应用
 *   网站的计数器，一般也是采用单例模式实现，否则难以同步
 *   
 *  
 *  2.实现一个类只能有一个实例
 *    1.构造方法私有 (外部无法创建多个对象，但是一个对象也无法创建了)
 *    2.提供一个Singleton属性private static
 *    3.提供一个public static方法，返回单例
 *    
 *    
 *  饿汉式单例模式：定义变量的时候就创建对象
 *  懒汉式单例模式：调用方法是才创建对象
 * @author Administrator
 *
 */
public class Singleton {
	private static Singleton instance ;
	
	private Singleton(){
		
	}	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}		
		return instance;
	}	
}
