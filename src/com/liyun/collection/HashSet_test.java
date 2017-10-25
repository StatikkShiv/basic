package com.liyun.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_test {
	/*
	 * HashSet 比较两个对象是否相同的机制是 1.hash  2. ==   3.equals()搜索
	 * 
	 * HashSet不能添加重复的元素，当调用add（Object）方法时候，
	 * 首先会调用Object的hashCode方法判hashCode是否已经存在，如不存在则直接插入元素；
	 * 如果已存在则调用Object对象的equals方法判断是否返回true， 如果为true则说明元素已经存在，如为false则插入元素。
	 * 例如Person类，重写hashCode方法和equals方法，用以判断传入集合的元素是否已经存在。
	 * 
	 * HashSet()构造一个新的空set，其底层HashMap 实例的默认初始容量是16，加载因子是0.75. HashSet(Collection<?
	 * extends E> c) 构造一个包含collection中的元素的新set HashSet(int initialCapacity)
	 * 构造一个新的空set,其底层Hashmap实例具有指定的初始容量和默认的加载因子0.75 HashSet(int
	 * initialCapacity,float loadFactor) 构造一个新的set,其底层Hashmap实例具有指定的初始容量和指定的加载因子
	 */
	public static void main(String[] args) {

		HashSet hashset = new HashSet<>();

		// 向hashset添加一个字符串
		hashset.add("abc");

		// 向hashset添加一个整数
		hashset.add(1);

		// 向hashset添加一个字符
		hashset.add('a');

		// 向hashset添加一个数组
		int[] abc = { 10, 11, 12 };
		hashset.add(abc);
		
		//从此set中移除所有元素
		hashset.clear();
		
		//如果指定元素在set中，则移除次元素
		hashset.remove('a');
		
		//set是否为空
		hashset.isEmpty();
		
		//如果set中包含某元素，则返回true
		hashset.contains(1);
		
		//返回set容量
		hashset.size();

		// 遍历hashset
		Iterator it = hashset.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (obj instanceof Integer) {
				System.out.println("Integer: " + obj);

			}
			if (obj instanceof String) {
				System.out.println("String:" + obj);
			}
			if (obj instanceof Character) {
				System.out.println("Character:" + obj);
			}
			if (obj instanceof int[]) {
				System.out.print("int[]:");
				for (int i = 0; i < abc.length; i++) {
					System.out.print(abc[i] + " ");
				}
			}
		}
		
		

	}

}
