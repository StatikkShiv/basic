package com.liyun.reflect;

import java.lang.reflect.Field;

public class T2 {
/*
 * 通过反射获取对象字段属性，并且赋值
 */
	public static void main(String[] args) {

		try {
			Class<?> class1=Class.forName("com.liyun.reflect.Person");
			
			//创建实例
			Object person=class1.newInstance();
			
			//获取id属性
			Field idField=class1.getDeclaredField("id");
			
			//打破封装  实际上setAccessible 是启用和禁用访问安全检查的开关，并不是为true就能访问为false就不能访问
			//由于JDK的安全检查耗时较多，所有通过setAccessible(true)的方式关闭安全检查就可以达到提升反射速度的目的
			idField.setAccessible(true);
			
			//给id属性 赋值
			idField.set( person , "100");
			
			System.out.println(idField.get(person));
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
