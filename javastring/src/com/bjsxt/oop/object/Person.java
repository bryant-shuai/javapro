package com.bjsxt.oop.object;
/**
 * ����
 * @author Administrator
 * 
 * 
 * 
 * 1.��Ͷ���Ķ���
 * 	�� class     Person   TestPerson  String  System  Scanner
 *  ���� object ʵ�� instance   xh  lz  input
 *  
 *  ���ǳ���ģ������Ǿ���ģ����������ʵ��  һ������Դ������ʵ��
 *  �����ͼֽ��ģ��
 *  �����������ͼֽ��ɵ�ʵ�����ģ�����������
 *  
 *  ���Ϊ������
 *   �Զ����� Person   TestPerson
 *   ϵͳ�� String  System  Scanner
 *   
 * 2.��ĳ�Ա����
 * 			String name;//����
			int age;//����
			String sex;//�Ա�
			
 *        ��Ա������ʾ��ľ�̬������Ҳ��Ϊ���ԣ�
 * 		��Ա������Ĭ��ֵ��int 0 / double 0.0  boolean:false char '\u0000' ��������  null
 *      Ҳ�����ڶ������ʱ��ֵ
 *      
 *      ��Ա�����;ֲ�����������
 *      1.��Ա������������ģ��ֲ����������ڷ�����
 *      2.��Ա������Ĭ��ֵ���ֲ�����û��Ĭ��ֵ
 *      3.��Ա�����������������ǵ�ǰ�࣬  �ֲ�������������ǰ����
 *      
 * 3.��ĳ�Ա����
 * 		public void eat(){ }
 *      public void sleep(String address){ }
 *      public String introduce(){ }
 *      
 *      public          void/String/int  sleep(String address){              }
 *     Ȩ�����η������÷�Χ��          ����ֵ����                               ������            �����б�0��1��n��   ������
 *     
 *     ���������ã�
 *     1.��װ�˹��ܣ��������
 *     2.��������ظ�
 *     
 *     һ����ķ�������ֱ�ӵ��ø�������Ժͷ���
 *
 */
public class Person {
	//��̬������:���� ���� ��Ա����
	String name="������";//����
	int age;//����
	String sex;//�Ա�
	
	//��̬����Ϊ  ��Ա���� ����   ����
	/**
	 * �Է�
	 */
	public void eat(){
		//int n=5;
		System.out.println("eating three times every day��������");
		//sleep("");
		//return;
	}
	/**
	 * ��Ϣ
	 * @param address ��ַ
	 */
	public void sleep(String address){
		//System.out.println(n);
		System.out.println(name +" sleeping at "+address);
	}
	/**
	 * ���ҽ���
	 * @return ���ҽ�����Ϣ
	 */
	public String introduce(){
		//System.out.println("name is"+name+",age is"+age+",sex is"+sex);
		return "name is"+name+",age is"+age+",sex is"+sex;
	}	
}
