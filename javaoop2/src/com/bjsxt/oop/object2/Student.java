package com.bjsxt.oop.object2;
/**
 * ���ܣ�static�ؼ���
 * ���ܣ�ѧ�����ҽ���  ѧϰ
 * 
 * ȱ�㣺ѧ����schoolName���ǡ�������ѧ�á�,������200��ѧ�����󣬾ͻ����ڴ��з���200�������ظ�schoolName���˷ѿռ�
 *     �����޸�schoolName�ǣ���Ҫ����޸�
 * ���������ʹ��static����schoolName
 * 		��schoolName���ڴ���ֻ��һ�ݣ�����Student�Ķ�����
 * 
 * 
 * 
 * �ܽ�
 * 
 * 
 * 1.static����
 * 2.static����
 * 3.static�����
 * 	1.ִ�е�ʱ�䣺��һ�μ������ʱ��
 *  2.ִ�еĴ��� ִ��һ��
 *  3.���ã�����ȫ������
 *  ��̬�������ֻ�ܳ��־�̬�����;�̬����
 * 
 * ����� {....}
 * 1.һ�����п����ж�������
 * 2.��������ʱ�������϶���ִ�����еĴ���飬��ִ�й��췽��
 * 3.���ã������й��췽������ͬ�����ݷ������飬�����ظ�
 * 
 * ��ĳ�Ա
 * 1.��Ա��������̬�ͷǾ�̬��
 * 2.��Ա��������̬�ͷǾ�̬��
 * 3.���췽��
 * 
 * 4.�����
 * 5.��̬�����
 * 6.�ڲ���
 * 
 * 
 * ѧ����
 * @author Administrator
 *
 */
public class Student {
	String name;
	int age;
	String sex;
	double score;
	static String schoolName;
	static{
		//name="abc";
		schoolName ="bjsxt";
		System.out.println("{5}");
	}
	
	public Student(){
		
		System.out.println("---Student()----");
	}
	public Student(String name,int age, String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public Student(String name,int age, String sex,double score){		
		//new Student(name,age,sex);
		this(name,age,sex);
		this.score = score;
		System.out.println(" Student(String name,int age, String sex,double score)");

	}
	{
		System.out.println("{1}");
	}
	
	{
		System.out.println("{2}");
	}
	
	public static void main(String[] args) {
		System.out.println(Student.schoolName);
		System.out.println("start");
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student("adf",34,"sd",342);
		
	}
	
	
}
