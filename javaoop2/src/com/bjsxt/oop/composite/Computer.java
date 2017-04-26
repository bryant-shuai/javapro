package com.bjsxt.oop.composite;
/**
 * 组合
 * 表示的不是is-a的关系，表示的是一种has-a的功能
 * 
 * 继承和组合是Java中复用代码的两种方式
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
