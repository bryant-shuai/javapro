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
 * 	1.���ã���������static���� *  
 *  2.���ʷ�ʽ
 *  	Student.getShoolName(); �Ƽ�ʹ�ø÷�ʽ
 *      stu.getShoolName(); * 
 *  3.������
 *     static�����в����Է��ʷ�static����   name age
 *       static�����в����Է���this *       
 *     static�����в����Է��ʷ�static����  study()
 *     
 *     ��Ϊ��static������this��ֻ���ڴ����˶����Ż����ռ�
 *     ��static����Ҳֻ���ڴ����˶����ſ��Ե��� *     
 *     ���ǵ���static�����ǣ�������ܻ�û�д����� *   
 *  
 *  
 *  4.����
		 �Ǿ�̬�������Է��ʾ�̬����
		�Ǿ�̬�������Է��ʾ�̬����
		
		why
		����ʹ�÷Ǿ�̬����ʱ����̬�����;�̬�������Ѿ�����

 * 
 * ѧ����
 * @author Administrator
 *
 */
public class Student4 {

	String name;
	int age;
	String sex;
	double score;
	static String  schoolName;
	
	public Student4(){
		
	}
	
	public Student4(String name,int age, String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public Student4(String name,int age, String sex,double score){		
		//new Student(name,age,sex);
		this(name,age,sex);
		this.score = score;

	}
	
	
	public static void getShoolName(){
		System.out.println("ѧУ���ƣ�"+schoolName);
		//System.out.println(name);
		//System.out.println(this);
		//study();
		
	}
	public  void introduce(){
		//String  name ="abcdedfg";
		System.out.println(this.name+"  "+age+"   "+sex+"  "+ score+"  "+schoolName);		
		getShoolName();
	}
	
	
	public void study(){
		
		this.introduce();		
		//introduce();
		System.out.println(this.name +" study hard!");
	}
	
	public static void main(String[] args) {
		System.out.println(Student4.schoolName);
		Student4.schoolName="������ѧ";
		
		Student4.getShoolName();
		
		//Student.name="abc";
		
		Student4 stu = new Student4();
		stu.name="С��";
		stu.age = 19;
		stu.sex ="��";
		stu.score = 98.5;
	//	stu.schoolName="������ѧ��";
		
		//stu.introduce();
		stu.getShoolName();
		
		Student4 stu2 = new Student4("С��",78,"��",0.5);
		//stu2.schoolName="bjsxt";
		//stu2.introduce();
		
		
		stu.study();
		stu2.study();
		
		//�����ܶ��ѧ��
	}
	
	
}
