package com.bjsxt.oop.object2;

import com.bjsxt.oop.*;
import com.bjsxt.oop.object.*;
import com.bjsxt.oop.object.Student;

import static java.lang.Math.*;
/**
 * һ����package
 * 
 * 1.Ϊʲô��Ҫ��
 *   Ϊʲô�������Ӳ����Ҫ��ͬ������ļ���
 *  	 ��ΪӲ�����ļ�̫����
 *   	1.������� 
 *      2.һ���ļ����в�����ͬ�����ļ������ǲ�ͬ�ļ����п�����ͬ���ļ�
 *    �й��ܶ������ʹ�ׯ
 *    	�ӱ�ʡ ʯ��ׯ��  ����  ƽɽ  ������*  * 
 * 2.��ζ����
 *    com.bjsxt.oop.object
 *    cn.com.sina.video....
 *    com.bjsxt.stumgr.dao
 *    com.bjsxt.stumgr.dao.impl
 *    ��������.����.��Ŀ��.ģ��.��ģ��
 *    
 *    ����ȫ��Сд
 *    
 *    java.util    
 * 
 * 3.���ʹ�ð�
 * 		package com.bjsxt.oop.object;
 * 		 ���룻��β
 *      ��������ĵ�һ����� * 
 * 
 * 4.Java���ð�
 *     java.util.Scanner(utility ����)
 *     java.lang.String(language ����   �ð��µ������ֱ��ʹ�ã�����Ҫimport)
 *     java.lang.System
 *     java.io input/ouput ���������
 *     java.net ������
 
 * 
 * ����import ����
 *   1.Ϊʲô��Ҫ����
 *   	ͬ�����е��಻��Ҫ����
 *      ʹ�ò�ͬ���е��ࣨ�ͽӿڣ���Ҫ����
 *      ������Ҳ���� ��Ҫ����·��  
 *      java.util.Scanner input = new java.util.Scanner(System.in);
 *   2.��ε���
 *   	import com.bjsxt.oop.object.Calculator;
			import com.bjsxt.oop.object.Computer;
			import com.bjsxt.oop.object.Person;
		import com.bjsxt.oop.object.*;
		
		
 *   3.ע������
 * 		1.Ĭ���ǵ�ǰ��
 *      2.java.lang���µ���ͽӿڲ���Ҫ����
 *      3.import com.bjsxt.oop.object.*; ����ð���������ͽӿڣ��������¼�����
 *      4.������������ͬ���ֻ࣬��ʹ��import����һ���࣬����ͬ������Ҫ��������·��
 *      5.��̬����  ����Ĳ����࣬����ľ�̬����������
 *          import static java.lang.Math.*;
 * 
 * 
 * @author Administrator
 *
 */
public class TestPackageImport {

	public static void main(String[] args) {
//		java.util.Scanner input = new java.util.Scanner(System.in);
//		com.bjsxt.oop.object.Person person = new com.bjsxt.oop.object.Person();//		
//		TestMethod t = new TestMethod();
		Test test = new Test();
		Calculator calc = new Calculator();
		Person person = new Person();
		Point p = new Point();
		Computer comp = new Computer();//ctrl+shift+o
		
		Student stu = new Student();
		com.bjsxt.oop.object2.Student stu2 = new com.bjsxt.oop.object2.Student();
		com.bjsxt.oop.Student stu3 = new com.bjsxt.oop.Student();
		
//		System.out.println(Math.sqrt(25));
//		System.out.println(Math.pow(4, 2));
//		System.out.println(Math.abs(-34));
//		System.out.println(Math.PI);
		
		System.out.println(sqrt(25));
		System.out.println(pow(4, 2));
		System.out.println(abs(-34));
		System.out.println(PI);
		
		
		

	}

}
