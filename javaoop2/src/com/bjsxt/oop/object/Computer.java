package com.bjsxt.oop.object;
/**
 * ���ܣ���ϰ��Ͷ��󣬹��췽����������
 * ���ܣ�����ָ�����õļ����������
 * 
 * 
 * �ܽ�
 * 1.���췽��constructor
 *  1.����  ��������������ͬ   ��д����ֵ����
 *  2.����: ��ʼ������  �������Ա��������ʼֵ
 *  3.���ã�new Computer()
 *  4.���ṩ���췽����ϵͳ��Ĭ���ṩһ���޲����Ĺ��췽��
 *  
 * ȱ�㣺 ��װһ̨�����ʹ�õ����̫���ˣ�����
 * ������ڴ�������ʱ�ṩ����ֵ
 *   ��������У���Ա�����;ֲ�����ͬ�����ö���ֲ������ķ����У������õ��Ǿֲ���������Ա����������
 *   �����ʹ�ó�Ա��������Ҫʹ��thisǰ׺
 *   
 *   ���췽��������
 *   
 * ���û���ṩ���췽����Ĭ���ṩһ���޲����Ĺ��췽��
 * ����Ѿ��ṩ���в������췽�������޲������췽���������ṩ
 * �����Ҫ���ֶ�����޲������췽��
 * ��ס:ÿ������ö�Ҫ�ṩһ���޲����Ĺ��췽��
 * �������
 * @author Administrator
 *
 */
public class Computer {
	//����
	private String cpu;
	private String mainBoard;
	private String memory;
	private String keyboard;
	private String mouse;
	//���췽�� ������
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
	//����	
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
		//������ԣ���������
		Computer computer = new Computer();
		//ָ�����ã������Ը�ֵ��
		computer.cpu="Intel i7";
		computer.mainBoard="ASUS";
		computer.memory="��ʿ��";
		computer.keyboard="�޼�����";
		computer.mouse="�޼����";		
		//���Ե��ԣ����÷�����
		computer.start();
		computer.showInfo();
		computer.close();
		
		////������Բ�ָ������
		Computer computer2 = new Computer("AMD","����","����","˫�������","˫�������");
		////���Ե���
		computer2.start();
		computer2.showInfo();
		computer2.close();
	}
	
}
