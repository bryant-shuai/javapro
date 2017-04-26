package com.bjsxt.oop.polymorphism;
/**
 * 向下转型
 * 1.将父类的引用转换成子类的引用
      Person p = new Italian();
       Italian it = (Italian)p;
 * 2.必须进行强制转换
 * 3.必须强制转换成真实子类类型，而不能随意强制转换，否则出现异常ClassCastExcepton
 * 4.为了避免类型转换异常，在强制转换之前，先进行类型判断
 *    p instanceof Chinese
 * 5instancof
 * 	对象  instanceof 类/抽象类/接口
 *   要求对象的类型（Person）和后面的类有继承关系上的上下级关系，否则编译出错
 * 
 * 
 * @author Administrator
 *
 */
public class TestPoly4 {

	public static void main(String[] args) {
		//基本数据类型的类型转换(左<右 强制类型转换  做手术)
		//int  n = (int)3.14;
		double d = 3.14;
		int n= (int)d;
		System.out.println(n);
		
		//引用数据类型的类型转换
		//1.企业招聘一名员工，是一名中国人
		Person p = new Chinese();
		//2.老板之前找员工练习太极拳，不可以，因为没有确认员工的国籍
		//p.playShadowboxing();
		//3.老板确认是中国人后，可以练习太极拳
		//Chinese ch = (Chinese)p;
		//ch.playShadowboxing();
		//4.老板确认是英国人后，就可以赛马了 必须强制转换成真实子类型，不能做手术
		//English en = (English)p;
		//en.raceHorse();
		//5.为了避免转换错误，强制转换之前先判断
		 if(p instanceof Chinese){
			 //练习太极
			 Chinese ch = (Chinese)p;
			 ch.playShadowboxing();
		 }else if(p instanceof English){
			 //一起赛马
			 English en2 = (English)p;
			 en2.raceHorse();
		 }else{
			 //踢足球
			 Italian it = (Italian)p;
			 it.playFootBall();
		 }
		 //
		 Person person = new Italian();
		 System.out.println(person instanceof Object);
		 System.out.println(person instanceof Person);
		 System.out.println(person instanceof Italian);
		 System.out.println(person instanceof Chinese);	 
		//System.out.println(person instanceof Scanner);
		

	}

}
