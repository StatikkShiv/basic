package com.liyun.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_test {
	/*
	 * HashSet �Ƚ����������Ƿ���ͬ�Ļ����� 1.hash  2. ==   3.equals()����
	 * 
	 * HashSet��������ظ���Ԫ�أ�������add��Object������ʱ��
	 * ���Ȼ����Object��hashCode������hashCode�Ƿ��Ѿ����ڣ��粻������ֱ�Ӳ���Ԫ�أ�
	 * ����Ѵ��������Object�����equals�����ж��Ƿ񷵻�true�� ���Ϊtrue��˵��Ԫ���Ѿ����ڣ���Ϊfalse�����Ԫ�ء�
	 * ����Person�࣬��дhashCode������equals�����������жϴ��뼯�ϵ�Ԫ���Ƿ��Ѿ����ڡ�
	 * 
	 * HashSet()����һ���µĿ�set����ײ�HashMap ʵ����Ĭ�ϳ�ʼ������16������������0.75. HashSet(Collection<?
	 * extends E> c) ����һ������collection�е�Ԫ�ص���set HashSet(int initialCapacity)
	 * ����һ���µĿ�set,��ײ�Hashmapʵ������ָ���ĳ�ʼ������Ĭ�ϵļ�������0.75 HashSet(int
	 * initialCapacity,float loadFactor) ����һ���µ�set,��ײ�Hashmapʵ������ָ���ĳ�ʼ������ָ���ļ�������
	 */
	public static void main(String[] args) {

		HashSet hashset = new HashSet<>();

		// ��hashset���һ���ַ���
		hashset.add("abc");

		// ��hashset���һ������
		hashset.add(1);

		// ��hashset���һ���ַ�
		hashset.add('a');

		// ��hashset���һ������
		int[] abc = { 10, 11, 12 };
		hashset.add(abc);
		
		//�Ӵ�set���Ƴ�����Ԫ��
		hashset.clear();
		
		//���ָ��Ԫ����set�У����Ƴ���Ԫ��
		hashset.remove('a');
		
		//set�Ƿ�Ϊ��
		hashset.isEmpty();
		
		//���set�а���ĳԪ�أ��򷵻�true
		hashset.contains(1);
		
		//����set����
		hashset.size();

		// ����hashset
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
