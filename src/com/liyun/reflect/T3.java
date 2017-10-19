package com.liyun.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class T3 {
	/*
	 * 综合训练，反射操作属性和方法
	 */
	public static void main(String[] args) {
		try {
			Class<?> class1 = Class.forName("com.liyun.reflect.Person");

			// 创建实例
			Object person = class1.newInstance();

			// 获得id属性
			Field idField = class1.getDeclaredField("id");

			// 打破封装 实际上setAccessible是启用和禁用访问安全检查的开关,并不是为true就能访问为false就不能访问
			// 由于JDK的安全检查耗时较多.所以通过setAccessible(true)的方式关闭安全检查就可以达到提升反射速度的目的
			idField.setAccessible(true);

			// 给id赋值属性
			idField.set(person, "100");

			// 获取setName()方法
			Method setName = class1.getMethod("setName", String.class);

			// 打破封装
			setName.setAccessible(true);

			// 调用setName()方法
			setName.invoke(person, "jack");

			// 获取name字段
			Field nameField = class1.getDeclaredField("name");

			nameField.setAccessible(true);

			String id_ = (String) idField.get(person);
			System.out.println("id: " + id_);

			// 打印 person的name属性值
			String name = (String) nameField.get(person);
			System.out.println("name: " + name);

			Method getName = class1.getDeclaredMethod("getName");
			getName.setAccessible(true);

			String name2 = (String) getName.invoke(person);

			System.out.println("name2: " + name2);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
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
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
