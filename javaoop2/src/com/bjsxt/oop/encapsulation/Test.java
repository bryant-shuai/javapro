package com.bjsxt.oop.encapsulation;
/**
 * ����1��person.age = 300; ������ʵ���������Ҫ��Ӧ�Ŀ���
 * ����2��person.name="����";��ͬ������ڲ�ͬ�����У���ͬ�İ��п��ܻ���ִ���
 * 
 * ���������ķ�װ
 * 
 * 1.ʲô�Ƿ�װ
 *   ���ӻ�
 *   ����
 *   �ô�
 *   1.��󽵵���ʹ�õ��Ѷ�
 *   2.�������˰�ȫ��
 * 
 * 2.ʹ��Ȩ�����η����з�װ
 * 	 private  ��ǰ��  ��ɼ�  ��Χ��С
 *   Ĭ�� ��ǰ����������   ���ɼ�
 *   protected  ��ǰ��������+��������������
 *   public  ��ǰ��Ŀ���а���������  ��Χ���  ��ǰ��������+������������ *   
 *   Ȩ�޷�ΧԽ��Խ��
 * 
 * 
 * 3.����ĳ�Ա���з�װ
 *  	1.��Ա����
 *  		1.����private   private int age;
 *  		2.�ṩpublic�ķ��������Խ��в���
 *  			public int getAge(){
					return age;
				}
				public void setAge(int age){		
					this.age = age;			
				}
			3.�����ڷ����жԷ�Χ�����ж�
				public void setAge(int age){
					if(age <0 || age>130){
						this.age = 20;
					}else{
						this.age = age;
					}		
				}
		  ����������private�����ڸ����������protected��������ֱ�ӷ���		  
 *      2.��Ա����
 *      	1.���ϣ�������������ʣ�����Ϊpublic
 *      	2.���ֻ�Ǳ���ǰ���ĳЩ�������ã�����ϣ���ⲿ�������ʣ�����Ϊprivate
 *      	3.����ΪĬ�ϻ���protected��������� *      
 *      3.���췽��
 *      	1.һ�㶼��public	2.һ�ּ����������Ϊprivate�����絥��ģʽ��*   * 
 * 4.������з�װ 
 * 	ֻ��ʹ��public��Ĭ�ϣ�����ʹ��protected��private
 * public ���а����ɼ�   ����Ҫ���������ļ�����ͬ
 * Ĭ��  ��ǰ���ɼ�
 * 
 * 
 * 
 * 
 */
public class Test {
	public static void main(String[] args) {
		Person person = new Person();			
		//person.name="����";
		//person.age = 300;
		person.setName("����");
		person.setAge(30);
		person.introduce();
		System.out.println(person.getName());
		int age = person.getAge();
		System.out.println(age);
	}
}
