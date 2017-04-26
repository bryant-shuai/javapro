package com.bjsxt.oop.polymorphism;
/**
 * ����ת��
 * 1.�����������ת�������������
      Person p = new Italian();
       Italian it = (Italian)p;
 * 2.�������ǿ��ת��
 * 3.����ǿ��ת������ʵ�������ͣ�����������ǿ��ת������������쳣ClassCastExcepton
 * 4.Ϊ�˱�������ת���쳣����ǿ��ת��֮ǰ���Ƚ��������ж�
 *    p instanceof Chinese
 * 5instancof
 * 	����  instanceof ��/������/�ӿ�
 *   Ҫ���������ͣ�Person���ͺ�������м̳й�ϵ�ϵ����¼���ϵ������������
 * 
 * 
 * @author Administrator
 *
 */
public class TestPoly4 {

	public static void main(String[] args) {
		//�����������͵�����ת��(��<�� ǿ������ת��  ������)
		//int  n = (int)3.14;
		double d = 3.14;
		int n= (int)d;
		System.out.println(n);
		
		//�����������͵�����ת��
		//1.��ҵ��Ƹһ��Ա������һ���й���
		Person p = new Chinese();
		//2.�ϰ�֮ǰ��Ա����ϰ̫��ȭ�������ԣ���Ϊû��ȷ��Ա���Ĺ���
		//p.playShadowboxing();
		//3.�ϰ�ȷ�����й��˺󣬿�����ϰ̫��ȭ
		//Chinese ch = (Chinese)p;
		//ch.playShadowboxing();
		//4.�ϰ�ȷ����Ӣ���˺󣬾Ϳ��������� ����ǿ��ת������ʵ�����ͣ�����������
		//English en = (English)p;
		//en.raceHorse();
		//5.Ϊ�˱���ת������ǿ��ת��֮ǰ���ж�
		 if(p instanceof Chinese){
			 //��ϰ̫��
			 Chinese ch = (Chinese)p;
			 ch.playShadowboxing();
		 }else if(p instanceof English){
			 //һ������
			 English en2 = (English)p;
			 en2.raceHorse();
		 }else{
			 //������
			 Italian it = (Italian)p;
			 it.playFootBall();
		 }
		 //
		 Person person = new Italian();
		 System.out.println(person instanceof Object);
		 System.out.println(person instanceof Person);
		 System.out.println(person instanceof Italian);
		 System.out.println(person instanceof Chinese);	 
		//System.out.println(person instanceof Scanner);
		

	}

}
