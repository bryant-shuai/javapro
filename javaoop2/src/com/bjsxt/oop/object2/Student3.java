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
 * 1.static�������ڴ����ͼ���ڷ�������
 * 
 * 
 * 2.�Ǿ�̬�����;�̬����
 * double score;               �Ǿ�̬����   ʵ������   ÿ������һ��
 * static String  schoolName;  ��̬����    �����       ÿ��������ж�����һ��
 * 
 * 3.�Ǿ�̬�����;�̬����������
 *  1.���ڴ��д洢��λ�ò�ͬ
 *       ���ڴ�           ������ *  
 *  2.���ڴ��з�����ͬ
 *      ÿ������һ��       ���ж�����һ��  *      
 *  3.���ʵķ�ʽ��ͬ
 *  	������.�Ǿ�̬����  stu.name="С��"; *  
 *  	������.��̬����  stu.schoolName="������ѧ��";
 *  	����.��̬����  Student.schoolName="������ѧ"; �Ƽ��÷�ʽ *  
 *  4.���ڴ��з���ռ��ʱ�䲻ͬ
 *  	��������ʱ���Ǿ�̬��������ռ�
 *       ��һ�μ������ʱ�򣬾ͻ��ڷ������и���̬��������ռ�
 * 
 * 
 * 

 * 
 * ѧ����
 * @author Administrator
 *
 */
public class Student3 {

	String name;
	int age;
	String sex;
	double score;
	static String  schoolName;
	
	public Student3(){
		
	}
	
	public Student3(String name,int age, String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public Student3(String name,int age, String sex,double score){		
		//new Student(name,age,sex);
		this(name,age,sex);
		this.score = score;

	}
	
	public  void introduce(){
		//String  name ="abcdedfg";
		System.out.println(this.name+"  "+age+"   "+sex+"  "+ score+"  "+schoolName);
	}
	
	public void study(){
		
		this.introduce();		
		//introduce();
		System.out.println(this.name +" study hard!");
	}
	
	public static void main(String[] args) {
		System.out.println(Student3.schoolName);
		Student3.schoolName="������ѧ";
		//Student.name="abc";
		
		Student3 stu = new Student3();
		stu.name="С��";
		stu.age = 19;
		stu.sex ="��";
		stu.score = 98.5;
	//	stu.schoolName="������ѧ��";
		
		//stu.introduce();
		
		
		Student3 stu2 = new Student3("С��",78,"��",0.5);
		//stu2.schoolName="bjsxt";
		//stu2.introduce();
		
		
		stu.study();
		stu2.study();
		
		//�����ܶ��ѧ��
	}
	
	
}
