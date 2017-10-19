package com.liyun.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class T3 {
	/*
	 * �ۺ�ѵ��������������Ժͷ���
	 */
	public static void main(String[] args) {
		try {
			Class<?> class1 = Class.forName("com.liyun.reflect.Person");

			// ����ʵ��
			Object person = class1.newInstance();

			// ���id����
			Field idField = class1.getDeclaredField("id");

			// ���Ʒ�װ ʵ����setAccessible�����úͽ��÷��ʰ�ȫ���Ŀ���,������Ϊtrue���ܷ���Ϊfalse�Ͳ��ܷ���
			// ����JDK�İ�ȫ����ʱ�϶�.����ͨ��setAccessible(true)�ķ�ʽ�رհ�ȫ���Ϳ��Դﵽ���������ٶȵ�Ŀ��
			idField.setAccessible(true);

			// ��id��ֵ����
			idField.set(person, "100");

			// ��ȡsetName()����
			Method setName = class1.getMethod("setName", String.class);

			// ���Ʒ�װ
			setName.setAccessible(true);

			// ����setName()����
			setName.invoke(person, "jack");

			// ��ȡname�ֶ�
			Field nameField = class1.getDeclaredField("name");

			nameField.setAccessible(true);

			String id_ = (String) idField.get(person);
			System.out.println("id: " + id_);

			// ��ӡ person��name����ֵ
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
