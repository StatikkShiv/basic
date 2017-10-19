package com.liyun.reflect;

public class T1 {
/*
 * ͨ�����䣬��ȡ����ʵ�������Ҳ�������ķ���
 */
	public static void main(String[] args) {

		try {
			Class<?> class1=Class.forName("com.liyun.reflect.Person");
			
			//����ʵ�������൱��new��һ������
			Object object = class1.newInstance();
			
			//����ת��
			Person person=(Person) object;
			
			person.setId("100");
			person.setName("jack");
			
			System.out.println("id: "+person.getId()+" name: "+person.getName());
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
