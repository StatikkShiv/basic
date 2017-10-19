package com.liyun.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class T4 {
/*
 * 静态属性，静态方法调用
 * 	//获取nameField的值,,静态变量并没有用get(Util)而是直接把属性写在里面

 */
	public static void main(String[] args) {
try {
	Class<?> class1=Class.forName("com.liyun.reflect.Util");
	
	//获取 nameField属性
	Field nameField =class1.getDeclaredField("name");
	
	//获取nameField的值,,静态变量并没有用get(Util)而是直接把属性写在里面
	String name_=(String) nameField.get(nameField);
	
	System.out.println(name_);
	
	//没有返回值，没有参数
	Method getTipMethod1=class1.getDeclaredMethod("getTips");
	
	//并没有用是getTipMethod1.invoke(Util,);
	getTipMethod1.invoke(null);
	
	//有返回值，没有参数
	Method getTipMethod2 =class1.getDeclaredMethod("getTip");
	String result_2=(String)getTipMethod2.invoke(null);
	System.out.println("返回值： "+ result_2);
	
	//没有返回值，有参数
	Method getTipMethod3=class1.getDeclaredMethod("getTip",String.class);
	String result_3=(String) getTipMethod3.invoke(null, "第三个方法");
	System.out.println("返回值： "+result_3);
	
	//有返回值，有参数 当参数是Int时，应该用int.class而不是Integer.class
	Method getTipMethod4=class1.getDeclaredMethod("getTip",int.class);
	String result_4=(String) getTipMethod4.invoke(null, 1);
	System.out.println("返回值： "+result_4);
	
	
}catch(ClassNotFoundException e) {
	e.printStackTrace();
} catch (NoSuchFieldException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SecurityException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IllegalArgumentException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IllegalAccessException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (NoSuchMethodException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (InvocationTargetException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
