package com.sxt.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
// �����Զ����������
public class CalendarDemo {
	public static void main(String[] args) {
		//����ָ������
//		System.out.println("������ָ����ʽ������\n");
//		Scanner input = new Scanner(System.in);
//		String str = input.next();
		//��������ͷ����Ϣ
		System.out.println("��\tһ\t��\t��\t��\t��\t��\t");
		//����Calendar����
		Calendar cal = new GregorianCalendar();
//		System.out.println("��ǰ����"+cal);
		System.out.println(cal.get(Calendar.MONTH));
		//��ȡ��ǰ����
		int day = cal.get(Calendar.DATE);
		//System.out.println(day);
		cal.set(Calendar.DATE,1);
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