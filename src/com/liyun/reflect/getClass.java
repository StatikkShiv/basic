package com.liyun.reflect;

public class getClass {
	/*
	 * TODO
	 * getClass().getGenericSuperclass()���ر�ʾ�� Class ����ʾ��ʵ�壨�ࡢ�ӿڡ��������ͻ� void����ֱ�ӳ���� Type
	 */

	public static void main(String[] args) {
		
		//��һ�ַ���:forName
       try {
    	   Class<?> class1=Class.forName("com.liyun.reflect.Person");
    	   
    	   System.out.println(class1);
       }catch(ClassNotFoundException e) {
    	   e.printStackTrace();
       }
       
       //�ڶ��ַ���:class
       Class<?> class2=Person.class;
       
       //�����ַ���:getClass
       Person person=new Person();
       Class<?> class3=person.getClass();
       
       System.out.println(class2);
       System.out.println(class2);
	}

}
