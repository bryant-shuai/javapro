package com.bjsxt.oop.inheritance4;
/**
 * ����д��Object�������������˵���书��
 * 
 * 
 * @author Administrator
 *
 *      obj.toString(); ����������ת��Ϊ�ַ�����ʽ
		obj.equals(""); �Ƚ��������������
 *      
 *      obj.getClass();��ȡһ������Ľṹ��Ϣ�����䣩
		
		obj.hashCode(); ��ϣ�� (����)
		
		obj.notify(); ����һ���ȴ����߳�(���߳�)
		obj.notifyAll(); �������еĵȴ��߳�(���߳�)
		obj.wait();���̵߳ȴ�(���߳�)
		
		protected clone() ��¡  ���ٸ��ƣ�ԭ��ģʽ��
		
		protected finalize() ��������ǰ����
		
 */
public class TestObject {

	public static void main(String[] args) {
		Object obj = new Object();
		obj.getClass();
		obj.toString();
		obj.equals("");
		obj.hashCode();
		obj.notify();
		obj.notifyAll();
		try {
			obj.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	

	}

}
