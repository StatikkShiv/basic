package com.liyun.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class T4 {
/*
 * ��̬���ԣ���̬��������
 * 	//��ȡnameField��ֵ,,��̬������û����get(Util)����ֱ�Ӱ�����д������

 */
	public static void main(String[] args) {
try {
	Class<?> class1=Class.forName("com.liyun.reflect.Util");
	
	//��ȡ nameField����
	Field nameField =class1.getDeclaredField("name");
	
	//��ȡnameField��ֵ,,��̬������û����get(Util)����ֱ�Ӱ�����д������
	String name_=(String) nameField.get(nameField);
	
	System.out.println(name_);
	
	//û�з���ֵ��û�в���
	Method getTipMethod1=class1.getDeclaredMethod("getTips");
	
	//��û������getTipMethod1.invoke(Util,);
	getTipMethod1.invoke(null);
	
	//�з���ֵ��û�в���
	Method getTipMethod2 =class1.getDeclaredMethod("getTip");
	String result_2=(String)getTipMethod2.invoke(null);
	System.out.println("����ֵ�� "+ result_2);
	
	//û�з���ֵ���в���
	Method getTipMethod3=class1.getDeclaredMethod("getTip",String.class);
	String result_3=(String) getTipMethod3.invoke(null, "����������");
	System.out.println("����ֵ�� "+result_3);
	
	//�з���ֵ���в��� ��������Intʱ��Ӧ����int.class������Integer.class
	Method getTipMethod4=class1.getDeclaredMethod("getTip",int.class);
	String result_4=(String) getTipMethod4.invoke(null, 1);
	System.out.println("����ֵ�� "+result_4);
	
	
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
