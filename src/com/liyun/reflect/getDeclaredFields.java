package com.liyun.reflect;

import java.lang.reflect.Field;

public class getDeclaredFields {

	public static void main(String[] args) {

		try {
			Class<?> class1=Class.forName("com.liyun.reflect.Person");
			
			//ȡ�ñ����ȫ������
			Field[] field=class1.getDeclaredFields();
			
			for(Field filed2:field) {
				System.out.println(filed2);
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
