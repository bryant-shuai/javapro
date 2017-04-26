package com.sxt.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
// 创建自动输入的日历
public class CalendarDemo {
	public static void main(String[] args) {
		//输入指定日期
//		System.out.println("请输入指定格式的日期\n");
//		Scanner input = new Scanner(System.in);
//		String str = input.next();
		//创建日历头部信息
		System.out.println("日\t一\t二\t三\t四\t五\t六\t");
		//创建Calendar对象
		Calendar cal = new GregorianCalendar();
//		System.out.println("当前日期"+cal);
		System.out.println(cal.get(Calendar.MONTH));
		//获取当前天数
		int day = cal.get(Calendar.DATE);
		//System.out.println(day);
		cal.set(Calendar.DATE,1);
		//System.out.println(day);
		//根据一号是周几输入空格
		int week = cal.get(Calendar.DAY_OF_WEEK);
		for(int i = 1;i<week;i++) {
			System.out.print("\t");
		}
		//获取这个月的最大天数
		int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int i=1;i < maxDay;i++) {
			if(i == day ) {
				System.out.print("*");
			}
			//如果是周六就换行
			System.out.print(i+"\t");
			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				System.out.println("");
			}
			cal.add(Calendar.DATE, 1);
		}
		
		
	}
}
