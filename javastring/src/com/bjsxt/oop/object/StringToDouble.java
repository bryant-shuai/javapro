package com.bjsxt.oop.object;



///**
// * String��
// * 
// * ������������
// * final��  ���������� 
// *  ���ɱ��ַ�����
//	 * 1.str.length()
//	 * 2.str.toUpperCase()
//	 * 3. str.toLowerCase()
//	 * 4.str.indexOf("ѧ")
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
//		String str ="������ѧ��bjsxt";
//
//		//1.�ַ������Ⱥʹ�Сд
//		System.out.println("str.length="+str.length());//10 Java�ַ�������Unicode�ַ�����
//		str = str.toUpperCase();//���ɱ��ַ�����
//		System.out.println("��д��"+str);
//		str = str.toLowerCase();
//		System.out.println("Сд��"+str);
//		
//		//2.��ȡ�ַ������Ӵ���λ�ã�������
//		int index = str.indexOf("ѧ");
//		System.out.println(index);//3
//		int index2 = str.indexOf("��ѧ��");
//		System.out.println(index2);//2
//		int index3 = str.indexOf("������");
//		System.out.println(index3);//��������ڣ�index=-1		
//		
//		//3.���ַ����н�ȡ�ַ������Ӵ�
//		char ch =str.charAt(5);
//		System.out.println(ch);
//		String substr = str.substring(5);
//		System.out.println(substr);
//		String substr2 = str.substring(5, 7);// 5 ----7-1
//		System.out.println(substr2);
//		
//		//4.ȥ�����˿ո�
//		String  str2 = "   ������ѧ��     bjsxt   ";
//		System.out.println(str2.length());
//		str2 = str2.trim();
//		System.out.println(str2.length());	
//		System.out.println(str2);
//	}
//}
public class StringToDouble {

    public static void main(String[] args) {
        Double s = 2.1;
        System.out.println(s);
        System.out.println("sss:"+s.toString());
        System.out.println("sss+"+String.valueOf(s));
//      Stringת��Double
//        String d = "ddd";
        Double dd = Double.parseDouble("6.6"); 
        
        System.out.println("dd:"+dd);
        
        Double ddd = Double.valueOf("6.66").doubleValue();
        System.out.println("ddd:"+ddd);
        System.out.println("---------------------");      
    }

}