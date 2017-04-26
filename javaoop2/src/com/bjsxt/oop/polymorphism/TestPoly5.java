package com.bjsxt.oop.polymorphism;
/**
 * 多态的使用场合 
 * 1.使用父类做方法的形参  最主要的
 *    showEat(Person person)
 *    equals(Object obj)
 * 2. 使用父类做返回值类型 * 
 * 缺陷：Person p1 = new Chinese(); 企业要从头培养员工，成本高，不合算
 * 解决：企业直接从学校招聘具有相应技能的员工即可，培养的工作由专门的机构完成（学校）
 * 		
 * @author Administrator *
 */
public class TestPoly5 {

	public static void main(String[] args) {
		//企业培养了一名员工
		//Person p1 = new Chinese();
		//企业从学校直接招聘了一名员工
		Person p1 = School.getPerson("ch");
		//员工在企业吃饭 午休  工作
		p1.eat();
		p1.sleep();		
		
		//企业培养了一名员工
		//Person p2 = new English();
		//企业从学校直接招聘了一名员工
		Person p2 = School.getPerson("en");
		p2.eat();
		p2.sleep();		
		
		//企业培养了一名员工
		//Person p3 = new Italian();
		Person p3 = School.getPerson("it");
		p3.eat();
		p3.sleep();
	}

}
