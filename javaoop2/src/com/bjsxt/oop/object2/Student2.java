package com.bjsxt.oop.object2;
/**
 * ���ܣ�this�ؼ���
 * ���ܣ�ѧ�����ҽ���  ѧϰ
 * 
 * 
 * �ܽ�
 * 1.this��һ�����ñ�����ִ�е�ǰ��������
 * ÿһ�����󶼻���һ��this���ñ���
 * ���ڶ��ڴ��з���ռ��ʱ��ͬʱ��this����ռ�
 * 
 * 2.Ҫ���this�ڴ����ͼ
 * 
 * 3.this��ʹ��
 *  1.this���ó�Ա����
 *  	����ֲ������ͳ�Ա����ͬ����this������ʡ�� this�����ξֲ�����
 *  	���û�кͳ�Ա����ͬ���ľֲ�������this����ʡ��
 *  2.this���ó�Ա����
 *  	this����ʡ��
 *   *  
 *  3.this���Ե��ù��췽��
 *     this(name,age,sex);
 *     �ڹ��췽����ʹ��this���õ�ǰ����������췽���������ǵ�һ�����
 * 
 * ѧ����
 * @author Administrator
 *
 */
public class Student2 {

	String name;
	int age;
	String sex;
	double score;
	
	public Student2(){
		
	}
	
	public Student2(String name,int age, String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public Student2(String name,int age, String sex,double score){
		
		//new Student(name,age,sex);
		this(name,age,sex);
		this.score = score;
//		this.name = name;
//		this.age = age;
//		this.sex = sex;
	}
	
	public  void introduce(){
		String  name ="abcdedfg";
		System.out.println(this.name+"  "+age+"   "+sex+"  "+ score);
	}
	
	public void study(){
		
		this.introduce();		
		//introduce();
		System.out.println(this.name +" study hard!");
	}
	
	public static void main(String[] args) {
		Student2 stu = new Student2();
		stu.name="С��";
		stu.age = 19;
		stu.sex ="��";
		stu.score = 98.5;
		
		//stu.introduce();
		stu.study();
		
		Student2 stu2 = new Student2("С͵",78,"��",0.5);
		//stu2.introduce();
		stu2.study();
	}
	
	
}
