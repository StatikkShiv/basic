package com.liyun.reflect;

public class Util {

	public static String name = "json";

	/*
	 * û�з���ֵ��û�в���
	 */
	public static void getTips() {
		System.out.println("ִ����-------getTips()");
	}

	/*
	 * �з���ֵ��û�в���
	 */
	public static String getTip() {
		System.out.println("ִ����---------getTip()");
		return "tip2";
	}

	/*
	 * û�з���ֵ���в���
	 */
	public static void getTip(String name) {
		System.out.println("ִ����---------getTip ����name��" + name);
	}

	/*
	 * û�з���ֵ���в���
	 */

	public static String getTip(int id) {
		System.out.println("ִ����---------getTip ����id: " + id);
		if (id == 0)
			return "getTip id==0";
		else
			return "getTip id!=0";

	}
}
