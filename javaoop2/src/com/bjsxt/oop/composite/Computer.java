package com.bjsxt.oop.composite;
/**
 * ���
 * ��ʾ�Ĳ���is-a�Ĺ�ϵ����ʾ����һ��has-a�Ĺ���
 * 
 * �̳к������Java�и��ô�������ַ�ʽ
 * 
 * @author Administrator
 *
 */
public class Computer{
	Cpu cpu;
	Memory memory;
	MainBoard mainBoard;
	
	public void start(){
		cpu.calc();
		memory.store();		
	}	
}
