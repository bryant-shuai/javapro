package com.sxt.calendar;

import java.text.SimpleDateFormat;
import java.util.Date;


// 
public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		// 创建时间对象
		Date date = new Date();
		//打印当前时间,格式为： yyyy-MM-dd hh:mm:ss
		System.out.println(date.toLocaleString());
		System.out.println(date);
		// 指定格式时间转成字符串
		String strDate = "2008-10-19 10:11:30.345";  
        // 准备第一个模板，从字符串中提取出日期数字  
        String pat1 = "yyyy-MM-dd HH:mm:ss.SSS";  
        // 准备第二个模板，将提取后的日期数字变为指定的格式  
        String pat2 = "yyyy年MM月dd日 HH时mm分ss秒SSS毫秒";  
        SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);
        SimpleDateFormat sdf2 = new SimpleDateFormat(pat2); 
        Date d = null ;  
        try{  
            d = sdf1.parse(strDate);   // 将给定的字符串中的日期提取出来  
//            System.out.println(d);
        }catch(Exception e){           // 如果提供的字符串格式有错误，则进行异常处理
            e.printStackTrace();       // 打印异常信息
        }  
        System.out.println(sdf1.format(d));    // 将日期变为新的格式 
        System.out.println(sdf2.format(d));
	} 
}	

