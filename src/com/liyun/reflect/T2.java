package com.liyun.reflect;

import java.lang.reflect.Field;

public class T2 {
/*
 * ͨ�������ȡ�����ֶ����ԣ����Ҹ�ֵ
 */
	public static void main(String[] args) {

		try {
			Class<?> class1=Class.forName("com.liyun.reflect.Person");
			
			//����ʵ��
			Object person=class1.newInstance();
			
			//��ȡid����
			Field idField=class1.getDeclaredField("id");
			
			//���Ʒ�װ  ʵ����setAccessible �����úͽ��÷��ʰ�ȫ���Ŀ��أ�������Ϊtrue���ܷ���Ϊfalse�Ͳ��ܷ���
			//����JDK�İ�ȫ����ʱ�϶࣬����ͨ��setAccessible(true)�ķ�ʽ�رհ�ȫ���Ϳ��Դﵽ���������ٶȵ�Ŀ��
			idField.setAccessible(true);
			
			//��id���� ��ֵ
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
