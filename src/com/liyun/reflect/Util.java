package com.liyun.reflect;

public class Util {

	public static String name = "json";

	/*
	 * 没有返回值，没有参数
	 */
	public static void getTips() {
		System.out.println("执行了-------getTips()");
	}

	/*
	 * 有返回值，没有参数
	 */
	public static String getTip() {
		System.out.println("执行了---------getTip()");
		return "tip2";
	}

	/*
	 * 没有返回值，有参数
	 */
	public static void getTip(String name) {
		System.out.println("执行了---------getTip 参数name：" + name);
	}

	/*
	 * 没有返回值，有参数
	 */

	public static String getTip(int id) {
		System.out.println("执行了---------getTip 参数id: " + id);
		if (id == 0)
			return "getTip id==0";
		else
			return "getTip id!=0";

	}
}
