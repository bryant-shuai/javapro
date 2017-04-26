package com.sxt.calendar;

import java.text.SimpleDateFormat;
import java.util.Date;


// 
public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		// ����ʱ�����
		Date date = new Date();
		//��ӡ��ǰʱ��,��ʽΪ�� yyyy-MM-dd hh:mm:ss
		System.out.println(date.toLocaleString());
		System.out.println(date);
		// ָ����ʽʱ��ת���ַ���
		String strDate = "2008-10-19 10:11:30.345";  
        // ׼����һ��ģ�壬���ַ�������ȡ����������  
        String pat1 = "yyyy-MM-dd HH:mm:ss.SSS";  
        // ׼���ڶ���ģ�壬����ȡ����������ֱ�Ϊָ���ĸ�ʽ  
        String pat2 = "yyyy��MM��dd�� HHʱmm��ss��SSS����";  
        SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);
        SimpleDateFormat sdf2 = new SimpleDateFormat(pat2); 
        Date d = null ;  
        try{  
            d = sdf1.parse(strDate);   // ���������ַ����е�������ȡ����  
//            System.out.println(d);
        }catch(Exception e){           // ����ṩ���ַ�����ʽ�д���������쳣����
            e.printStackTrace();       // ��ӡ�쳣��Ϣ
        }  
        System.out.println(sdf1.format(d));    // �����ڱ�Ϊ�µĸ�ʽ 
        System.out.println(sdf2.format(d));
	} 
}	
