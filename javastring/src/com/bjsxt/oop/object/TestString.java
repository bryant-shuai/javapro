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
public class TestString {
    /**
     * 
    �����������͵�ֵ����,���ı���ֵ
    �����������͵�ֵ����,�ı���ֵ

    String����Ȼ��������������,������������������ʱ�ͻ�������������һ����
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
//      ˫���ſ��ԣ������Ų����ԣ�
        System.out.println(a.replace("  ", ""));
        
    }
    public static void change(StringBuffer sb) {
        //���ø÷���ʱʵ�ʲ�����sb����ʽ������sbָ�����ͬһ������(StringBuffer����)
        //�����ڲ����ڸ�������������"itcast",���Է�������ʱ,�ֲ�������sb��ʧ,����ʵ�ʲ�����sb��ָ����������ڲ��������Ѿ������˸ı�
        sb.append("itcast");
    }
    public static void change(String s) {
        s += "itcast";
    }
    //Ϊ�˱��ڴ������,�ٽ���һ��changeString����
    public static void changeString(String str) {
        //��Ϊstr�����ھֲ�����,�ڵ��ø÷�����ʵ�ʲ���s����ʽ����strָ��ͬһ���ַ�������
        //�����ڷ����ڲ���str��ָ����һ���µ��ַ�������,����ʱs����ָ���ԭ�����ַ�������
        //changeString����ִ�����,�ֲ�����str��ʧ,�����ڲ��������µ��ַ��������Ϊ����
        //����s����ָ���ԭ�е��ַ�������,��û�иı�
        str += "itcast";
    }
}