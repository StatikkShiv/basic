package com.liyun.reflect;

public class T1 {
/*
 * 通过反射，获取对象实例，并且操作对象的方法
 */
	public static void main(String[] args) {

		try {
			Class<?> class1=Class.forName("com.liyun.reflect.Person");
			
			//创建实例化：相当于new了一个对象
			Object object = class1.newInstance();
			
			//向下转型
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
