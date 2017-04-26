package com.sxt.calendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



// 
public class TestCalendartDemo {
	public static void main(String[] args) {
		// 获取日历对象
		Calendar cal = Calendar.getInstance();
		String str = "1990-03-03";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = df.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cal.setTime(date);

		System.out.println(cal.getTime());
		// 这一天是今年的第几天
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		cal.add(Calendar.DATE, 35);
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
		
	} 
}	

