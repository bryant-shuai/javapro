package com.bjsxt.oop.inheritance4;
/**
 * 请你写出Object类的六个方法并说明其功能
 * 
 * 
 * @author Administrator
 *
 *      obj.toString(); 将对象内容转换为字符串形式
		obj.equals(""); 比较两个对象的内容
 *      
 *      obj.getClass();获取一个对象的结构信息（反射）
		
		obj.hashCode(); 哈希码 (集合)
		
		obj.notify(); 唤醒一个等待的线程(多线程)
		obj.notifyAll(); 唤醒所有的等待线程(多线程)
		obj.wait();让线程等待(多线程)
		
		protected clone() 克隆  快速复制（原型模式）
		
		protected finalize() 垃圾回收前调用
		
 */
public class TestObject {

	public static void main(String[] args) {
		Object obj = new Object();
		obj.getClass();
		obj.toString();
		obj.equals("");
		obj.hashCode();
		obj.notify();
		obj.notifyAll();
		try {
			obj.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	

	}

}
