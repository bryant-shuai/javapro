package com.bjsxt.oop.inheritance2;
/**
 * ����1��Animal yellow  5 
 * Dog�������introduce������
 * ֻ����ʾ���ж��ﹲ�е����ԣ��޷���ʾ�Լ����е�����
 * �������������д�����ǣ�  override
 * 
 * 
 * ��������д override
 * 1.ʹ�õ�ʱ��
 * 	 ����ķ����޷����������Ҫ��
 * 
 * 2.��д��Ҫ��
 *  ��������ͬ
 *  ������ͬ
 *  ����ֵ��Ȩ�����η���ͬ�϶�û�����⣬Ҳ���Բ�ͬ���������뽲��
 * 
 *  ����2��
 * System.out.println(an);
 * System.out.println(an.toString()) Ĭ�ϵ���toString()
 * ����Animal������Dog������toString().���õĶ��Ǵ�Object�̳еģ������Ѿ��޷�����Ҫ��
 * �������д
 * ����Animal��д��DogҲҪ��д
 * 
 * Object��toString()
 *   public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		//�������ﲢ����
		Animal an = new Animal();
		an.color="red";
		an.age = 3;
		an.eat();
		an.sleep();
		an.introduce();
		System.out.println(an);//������ת�����ַ��������
		System.out.println(an.toString());		
		//����Dog������
		Dog dog = new Dog();
		dog.color="yellow";//�Ӹ���̳е�
		dog.age= 5;//�Ӹ���̳е�
		dog.nickName="9527";//�����Լ���
		dog.strain="��ʿ��";//�����Լ���
		dog.eat();//�Ӹ���̳е�
		dog.sleep();//�Ӹ���̳е�
		dog.introduce();//�Ӹ���̳е�
		dog.guard();//�����Լ���
		System.out.println(dog);
		System.out.println(dog.toString());

	}
	
	

}
