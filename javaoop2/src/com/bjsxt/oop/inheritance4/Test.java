package com.bjsxt.oop.inheritance4;
/**
 * ���ܣ�==  equals��������ϵ   ��������д
 * ���ܣ��ж��������������Ƿ���ͬ
 * 
 * �ܽ�
 * 1.==
	 * �����������ͱȽϵ���ֵ
	 * �����������ͱȽϵ��ǵ�ַ
	 * == �ȽϵĶ���ջ�ڴ��������
 * 
 * 2.equals���������Ƚ����ݵġ���
 * 
 * ��סObject��equels()�ȽϵĻ��ǵ�ַ�������������ϣ��ͨ��equals�Ƚ����ݣ�������д
   public boolean equals(Object obj) {
        return (this == obj);
    }
    
    3.����ÿ���Զ����࣬���鶼Ҫ��дtoString()��equals()

 * abcd
 * abce
 */
public class Test {

	public static void main(String[] args) {	
//		//�����������͵ıȽ�
//		int n1 = 5;
//		int n2 = 5;
//		System.out.println(n1==n2);//true
//		//System.out.println(n1.equals(n2));//������������û�з���
//		
//		//�����������͵ıȽ�
//		Animal an1 = new Animal("yellow", 23);
//		Animal an2 = new Animal("yellow", 23);
//		
//		System.out.println(an1==an2);//false
//		
//		
//		System.out.println(an1.equals(an2));// not false   should true 
//		System.out.println(an1.equals(null));
//		Animal an3 = an1;
//		System.out.println(an1==an3);
//		System.out.println(an1.equals(an3));
//		
//		Animal an4 = new Animal("yellow", 34);
//		System.out.println(an1.equals(an4));//false
		
		Dog dog1 = new Dog("yellow", 3, "����", "��������Ȯ");
		Dog dog2 = new Dog("yellow", 3, "����",  "��������Ȯ");
		System.out.println(dog1==dog2);//false
		System.out.println(dog1.equals(dog2));
		

	}

}
