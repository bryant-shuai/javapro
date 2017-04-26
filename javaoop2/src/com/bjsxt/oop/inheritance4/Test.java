package com.bjsxt.oop.inheritance4;
/**
 * 技能：==  equals的区别联系   方法的重写
 * 功能：判断两个对象内容是否相同
 * 
 * 总结
 * 1.==
	 * 基本数据类型比较的是值
	 * 引用数据类型比较的是地址
	 * == 比较的都是栈内存的中内容
 * 
 * 2.equals（）用来比较内容的、、
 * 
 * 记住Object的equels()比较的还是地址，所以子类如果希望通过equals比较内容，必须重写
   public boolean equals(Object obj) {
        return (this == obj);
    }
    
    3.对于每个自定义类，建议都要重写toString()和equals()

 * abcd
 * abce
 */
public class Test {

	public static void main(String[] args) {	
//		//基本数据类型的比较
//		int n1 = 5;
//		int n2 = 5;
//		System.out.println(n1==n2);//true
//		//System.out.println(n1.equals(n2));//基本数据类型没有方法
//		
//		//引用数据类型的比较
//		Animal an1 = new Animal("yellow", 23);
//		Animal an2 = new Animal("yellow", 23);
//		
//		System.out.println(an1==an2);//false
//		
//		
//		System.out.println(an1.equals(an2));// not false   should true 
//		System.out.println(an1.equals(null));
//		Animal an3 = an1;
//		System.out.println(an1==an3);
//		System.out.println(an1.equals(an3));
//		
//		Animal an4 = new Animal("yellow", 34);
//		System.out.println(an1.equals(an4));//false
		
		Dog dog1 = new Dog("yellow", 3, "旺财", "拉布拉多犬");
		Dog dog2 = new Dog("yellow", 3, "旺财",  "拉布拉多犬");
		System.out.println(dog1==dog2);//false
		System.out.println(dog1.equals(dog2));
		

	}

}
