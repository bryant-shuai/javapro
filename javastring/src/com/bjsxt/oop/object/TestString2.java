package com.bjsxt.oop.object;


import java.util.Arrays;

/**
 * String类
 * 引用数据类型 不可变字符序列
	 * 1.str.length()
	 * 2.str.toUpperCase()
	 * 3. str.toLowerCase()
	 * 4.str.indexOf("学")
	 * 5.str.charAt(5)
	 * 6.str.substring(5)
	 * 7.str.substring(5, 7)
	 * 8.str2.trim();
	 * 
	 * 
	 * 
	 * 9.str3.replace("j", "J");
	 * 10.str3.replaceAll("j\\d", "##");
	 * 11.str4.isEmpty()
	 * 12str4.contains("struts2")
	 * 13str4.concat("#spring").concat("#ibatis")
 * 
 * @author liukaili
 *
 */
public class TestString2 {

	public static void main(String[] args) {
	
		//5.字符替换
		String  str3 = "j1ava,j2sp,servlet,struts,js,html,css";
		//str3= str3.replace("j", "J");
		//		str3 = str3.replaceAll("j\\w", "##");
		str3 = str3.replaceAll("j\\d", "##");
		System.out.println(str3);
		//6.分割字符串
		String  str4 = "java#jsp#servlet#struts#js#html#css";
		//String strarr [] = str4.split("#");
		String strarr [] = str4.split("s");//java#j    p#   ervlet#   trut   #j   #html#c     
		System.out.println(Arrays.toString(strarr));
//		//7.其他
		System.out.println(str4.isEmpty());
		System.out.println(str4.contains("struts"));
		str4 =str4.concat("#spring").concat("#ibatis");
		System.out.println(str4);
	}
}
