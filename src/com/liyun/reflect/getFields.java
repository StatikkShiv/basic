package com.liyun.reflect;

import java.lang.reflect.Field;

public class getFields {

	public static void main(String[] args) {

		try {
			Class<?> class1=Class.forName("com.liyun.reflect.Person");
			
			//��ȡ���й��е��ֶ�����
			Field[] field=class1.getFields();
			
			for(Field field2:field) {
				System.out.println(field2);
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
