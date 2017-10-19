package com.liyun.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class getConstructor {
	/*
	 * 获取构造参数
	 */
public static void main(String[] args) {
	
	try {
		Class<?> class1=Class.forName("com.liyun.reflect.Person");
		
		//无参构造参数
		Object object=class1.newInstance();
		
		//有残构造函数：一个参数
		Constructor<?> constructor=class1.getDeclaredConstructor(String.class);
		constructor.newInstance("1000");
		
		//有参构造函数：二个参数
		Constructor<?> constructor2=class1.getDeclaredConstructor(String.class,String.class);
		constructor2.newInstance("1001","jack");
		
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NoSuchMethodException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
