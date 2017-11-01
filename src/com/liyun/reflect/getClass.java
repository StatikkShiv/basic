package com.liyun.reflect;

public class getClass {
	/*
	 * TODO
	 * getClass().getGenericSuperclass()返回表示此 Class 所表示的实体（类、接口、基本类型或 void）的直接超类的 Type
	 */

	public static void main(String[] args) {
		
		//第一种方法:forName
       try {
    	   Class<?> class1=Class.forName("com.liyun.reflect.Person");
    	   
    	   System.out.println(class1);
       }catch(ClassNotFoundException e) {
    	   e.printStackTrace();
       }
       
       //第二种方法:class
       Class<?> class2=Person.class;
       
       //第三种方法:getClass
       Person person=new Person();
       Class<?> class3=person.getClass();
       
       System.out.println(class2);
       System.out.println(class2);
	}

}
