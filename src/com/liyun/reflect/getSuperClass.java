package com.liyun.reflect;

public class getSuperClass {

	public static void main(String[] args) {

		try {
			Class<?> class1=Class.forName("com.liyun.reflect.Person");
			
			//ªÒ»°∏∏¿‡
			Class<?> superclass=class1.getSuperclass();
			
			System.out.println(superclass);
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
