package com.liyun.reflect;

import java.lang.reflect.Method;

public class getMethods {

	public static void main(String[] args) {

        try {
        	//������
        	Class<?> class1=Class.forName("com.liyun.reflect.Person");
        	
        	//��ȡ���еĹ����ķ���
        	Method[] methods=class1.getMethods();
        	
        	for(Method method :methods) {
        		System.out.println(method);
        	}
        	
        }catch(ClassNotFoundException e) {
        	e.printStackTrace();
        }
	}

}
