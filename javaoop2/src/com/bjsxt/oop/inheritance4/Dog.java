package com.bjsxt.oop.inheritance4;
/**
 * ������
 * 
 * ���⣺����Ĺ��е����Ժͷ������ظ��ĳ�����ÿ����Ĵ����У����´����ظ����������޸�ɾ��
 * �����������Ĺ��е����Ժͷ�����ȡ�����ŵ������У��þ���Ķ���̳и��࣬�Ӷ���ȡ���������Ժͷ���
 *     �����˴�����ظ�
 *  
 *   �ܽ�
 *   1.�̳�  
 *   ���� ��Animal
 *   ���ࣺDog Snake
 *   
 *   2.�̳кô�
 *   	��������ظ�
 *   
 *   3.���ʡ��extends,Ĭ��extends Object
 *   	Object�����е���Ķ�����
 *    
 * @author Administrator
 *
 */
public class Dog extends Animal{
	 //Dog���е�����
	//String color;
	String nickName;
	String strain;//sort 	
	
	public Dog() {
		super();
	}
	
	public Dog(String color, int age) {
		//super();
		this();
		this.color = color;
		this.age = age;		
	}
	
	public Dog(String color, int age, String nickName, String strain) {
//		super();
//		this.color = color;
//		this.age = age;		
		//this(color,age);
		super(color,age);
		this.nickName = nickName;
		this.strain = strain;		
	}
	//��Ա����
	//Dog���еķ���
	public void guard(){
		System.out.println("guarding........");		
	}
	public void introduce(){
		//�Ӹ���̳е�����(���ø����introduce)
		//super.introduce();
		//System.out.println("Animal "+ color+"  "+ age );
		//�����Լ�������
		//System.out.println("Dog "+  nickName+"   "+strain );
		//System.out.println("Dog "+ super.color+" "+super.age+ "  "+ this.nickName+"   "+this.strain);
		System.out.println("Dog "+ this.color+" "+this.age+ "  "+ this.nickName+"   "+this.strain);
	}
	@Override
	public String toString() {
		return "[Dog: color="+color+",age="+age+",nickName="+nickName+",strain="+strain+"]";
	}

	@Override
	public boolean equals(Object obj) {
		//�ȱȽ�color��age�����Ƿ���ͬ
		boolean flag = super.equals(obj);
		if(flag == false){
			return false;
		}else{
			//�����ͬ���ٱȽ�nickName��strain
			
			Dog other = (Dog)obj;
		
			if(this.nickName.equals(other.nickName)  
					&& this.strain.equals(other.strain)){
				return true;
			}else{
				return false;
			}
		}
	}
	
	
	
	
}
