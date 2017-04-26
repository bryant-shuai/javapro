package com.bjsxt.oop.object;



///**
// * String类
// * 
// * 引用数据类型
// * final类  不能有子类 
// *  不可变字符序列
//	 * 1.str.length()
//	 * 2.str.toUpperCase()
//	 * 3. str.toLowerCase()
//	 * 4.str.indexOf("学")
//	 * 5.str.charAt(5)
//	 * 6.str.substring(5)
//	 * 7.str.substring(5, 7)
//	 * 8.str2.trim();
// * 
// * @author liukaili
// *
// */
//public class TestString {
//
//	public static void main(String[] args) {
//		String str ="北京尚学堂bjsxt";
//
//		//1.字符串长度和大小写
//		System.out.println("str.length="+str.length());//10 Java字符串就是Unicode字符序列
//		str = str.toUpperCase();//不可变字符序列
//		System.out.println("大写："+str);
//		str = str.toLowerCase();
//		System.out.println("小写："+str);
//		
//		//2.获取字符或者子串的位置（索引）
//		int index = str.indexOf("学");
//		System.out.println(index);//3
//		int index2 = str.indexOf("尚学堂");
//		System.out.println(index2);//2
//		int index3 = str.indexOf("西三旗");
//		System.out.println(index3);//如果不存在，index=-1		
//		
//		//3.从字符串中截取字符或者子串
//		char ch =str.charAt(5);
//		System.out.println(ch);
//		String substr = str.substring(5);
//		System.out.println(substr);
//		String substr2 = str.substring(5, 7);// 5 ----7-1
//		System.out.println(substr2);
//		
//		//4.去除两端空格
//		String  str2 = "   北京尚学堂     bjsxt   ";
//		System.out.println(str2.length());
//		str2 = str2.trim();
//		System.out.println(str2.length());	
//		System.out.println(str2);
//	}
//}
public class TestString {
    /**
     * 
    基本数据类型的值传递,不改变其值
    引用数据类型的值传递,改变其值

    String类虽然是引用数据类型,但是他当作参数传递时和基本数据类型是一样的
     */
    public static void main(String[] args) {
        String s = "heima";
        System.out.println(s);
//        changeString(s);
        change(s);
        System.out.println(s);


        System.out.println("---------------------");
        StringBuffer sb = new StringBuffer();
        sb.append("heima");
        System.out.println(sb);
        change(sb);
        System.out.println(sb);
        
        String a = "a  b  c";
//      双引号可以，单引号不可以；
        System.out.println(a.replace("  ", ""));
        
    }
    public static void change(StringBuffer sb) {
        //调用该方法时实际参数的sb和形式参数的sb指向的是同一个对象(StringBuffer容器)
        //方法内部又在该容器里添加了"itcast",所以方法结束时,局部变量的sb消失,但是实际参数的sb所指向的容器的内部的内容已经发生了改变
        sb.append("itcast");
    }
    public static void change(String s) {
        s += "itcast";
    }
    //为了便于大家理解,再建立一个changeString方法
    public static void changeString(String str) {
        //因为str是属于局部变量,在调用该方法是实际参数s和形式参数str指向同一个字符串对象
        //但是在方法内部将str又指向了一个新的字符串对象,而此时s还是指向的原来的字符串对象
        //changeString方法执行完毕,局部变量str消失,方法内部产生的新的字符串对象称为垃圾
        //但是s还是指向的原有的字符串对象,并没有改变
        str += "itcast";
    }
}