package com.sxt.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
// �����Զ����������
public class CalendarAutoDemo {
	public static void main(String[] args) {
		//����ָ������
		System.out.println("���������\n");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println("�������·�");
		String mon = input.nextLine();
		System.out.println("������һ��");
		String today = input.nextLine();
		//������������
		Calendar cal = new GregorianCalendar();
		//����ʱ��
		cal.set(Calendar.DATE,1);
		//���
		cal.set(Calendar.YEAR,Integer.parseInt(str));
		//�·�
		cal.set(Calendar.MONTH, Integer.parseInt(mon)-1);
		//��������ͷ����Ϣ
		System.out.println("��\tһ\t��\t��\t��\t��\t��\t");
		//����Calendar����
//		System.out.println("��ǰ����"+cal);
//		System.out.println(cal.get(Calendar.MONTH));
		//��ȡ��ǰ����

		int day = Integer.parseInt(today);
		//System.out.println(day);
		//����һ�����ܼ�����ո�
		int week = cal.get(Calendar.DAY_OF_WEEK);
		for(int i = 1;i<week;i++) {
			System.out.print("\t");
		}
		//��ȡ����µ��������
		int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int i=1;i < maxDay;i++) {
			if(i == day ) {
				System.out.print("*");
			}
			//����������ͻ���
			System.out.print(i+"\t");
			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				System.out.println("");
			}
			cal.add(Calendar.DATE, 1);
		}
		
		
	}
}