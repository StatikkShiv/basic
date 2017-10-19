package com.liyun.reflect;

public class getInterfaces {

	public static void main(String[] args) {

		try {
			Class<?> class1=Class.forName("com.liyun.reflect.Person");
			
			//获取所有接口
			Class<?>[] interS=class1.getInterfaces();
			
			for(Class<?> class2:interS) {
				System.out.println(class2);
			}
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
