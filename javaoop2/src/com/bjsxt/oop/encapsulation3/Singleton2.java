package com.bjsxt.oop.encapsulation3;
/**
 *  һ��������ж��ʵ��������
 *  ������ĳ������£�������Ҫһ����ֻ����һ��ʵ��
 *  
 *  1.ĳ�����
 *   Windows��Task Manager����������������Ǻܵ��͵ĵ���ģʽ
 *   windows��Recycle Bin������վ��Ҳ�ǵ��͵ĵ���Ӧ��
 *   ��վ�ļ�������һ��Ҳ�ǲ��õ���ģʽʵ�֣���������ͬ��
 *   
 *  
 *  2.ʵ��һ����ֻ����һ��ʵ��
 *    1.���췽��˽�� (�ⲿ�޷�����������󣬵���һ������Ҳ�޷�������)
 *    2.�ṩһ��Singleton����private static
 *    3.�ṩһ��public static���������ص���
 *    
 *    
 *  ����ʽ����ģʽ�����������ʱ��ʹ�������
 *  ����ʽ����ģʽ�����÷����ǲŴ�������
 * @author Administrator
 *
 */
public class Singleton2 {
	private static Singleton2 instance = new Singleton2();
	
	private Singleton2(){
		
	}	
	public static Singleton2 getInstance(){
		return instance;
	}	
}
