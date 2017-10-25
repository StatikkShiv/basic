package com.liyun.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_test {
	/*
	 * offer��add����
	 * 
	 * һЩ�����д�С���ƣ�����������һ�����Ķ����м���һ������������ͻᱻ�ܾ���
	 * 
	 * ��ʱ�µ� offer �����Ϳ����������ˡ������ǶԵ��� add() �����׳�һ�� unchecked �쳣����ֻ�ǵõ��� offer() ���ص�
	 * false��
	 * 
	 * 
	 * 
	 * poll��remove����
	 * 
	 * remove() �� poll() �������ǴӶ�����ɾ����һ��Ԫ�ء�remove() ����Ϊ�� Collection �ӿڵİ汾���ƣ�
	 * 
	 * �����µ� poll() �������ÿռ��ϵ���ʱ�����׳��쳣��ֻ�Ƿ��� null������µķ������ʺ����׳����쳣�����������
	 * 
	 * 
	 * 
	 * peek��element���� element() �� peek() �����ڶ��е�ͷ����ѯԪ�ء��� remove() �������ƣ��ڶ���Ϊ��ʱ��
	 * element() �׳�һ���쳣���� peek() ���� null
	 */

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();

		// ���Ԫ�ص��б�ͷ
		linkedList.addFirst(0);

		// ���б��β���Ԫ��
		linkedList.add(1);

		// ��ָ��λ�����Ԫ��
		linkedList.add(2, 2);

		// ���Ԫ�ص��б��β
		linkedList.addLast(3);

		System.out.println("LinkedList: " + linkedList);

		// ****************λ�÷��ʲ���****************************

		System.out.println("λ�ò���");

		// �����б���ָ��λ�õ�Ԫ���滻Ϊָ����Ԫ��
		linkedList.set(1, 3);
		System.out.println("After set(1,3): " + linkedList);

		// ���ش��б���ָ��λ�ô���Ԫ��
		System.out.println("get(1): " + linkedList.get(1));

		// ****************Search����****************************
		System.out.println("Search����");
		linkedList.add(3);

		// �����б����״γ���ָ��Ԫ�ص�����
		System.out.println("indexOf(3): " + linkedList.indexOf(3));

		// �����б�������ָ��Ԫ�ص�����
		System.out.println("lastIndexOf(3): " + linkedList.lastIndexOf(3));

		// ****************Queue����****************************
		System.out.println("Queue����");

		// element() �� peek() �����ڶ��е�ͷ����ѯԪ�ء��� remove() �������ƣ��ڶ���Ϊ��ʱ�� element() �׳�һ���쳣����
		// peek() ���� null
		// ��ȡ�����Ƴ����б��ͷ
		System.out.println("peek(): " + linkedList.peek());

		// ��ȡ�����Ƴ����б��ͷ
		System.out.println("element(): " + linkedList.element());

		// remove() �� poll() �������ǴӶ�����ɾ����һ��Ԫ�ء�remove() ����Ϊ�� Collection �ӿڵİ汾���ƣ�
		// �����µ� poll() �������ÿռ��ϵ���ʱ�����׳��쳣��ֻ�Ƿ��� null������µķ������ʺ����׳����쳣���������
		// ��ȡ���Ƴ����б��ͷ
		linkedList.poll();
		System.out.println("After pool(): " + linkedList);

		// ��ȡ���Ƴ����б��ͷ
		linkedList.remove();
		System.out.println("After remove(): " + linkedList);

		// һЩ�����д�С���ƣ�����������һ�����Ķ����м���һ������������ͻᱻ�ܾ���
		// ��ʱ�µ� offer �����Ϳ����������ˡ������ǶԵ��� add() �����׳�һ�� unchecked �쳣����ֻ�ǵõ��� offer() ���ص�
		// false��
		// ��ָ��Ԫ����ӵ����б��ĩβ
		linkedList.offer(4);
		System.out.println("After offer(4): " + linkedList);
		
		// ****************Deque����****************************
        System.out.println("Deque����");
        
        //�ڴ��б�ͷ����ָ����Ԫ��
        linkedList.offerFirst(2);
        System.out.println("After offerFirst(2): "+linkedList);
        
        //�ڴ��б�ĩβ����ָ����Ԫ��
        linkedList.offerLast(5);
        System.out.println("After offerLast(5): "+linkedList);;
        
        //��ȡ�����Ƴ����б�ĵ�һ��Ԫ��
        System.out.println("peekFirst(): "+linkedList.peekFirst());
        
        //��ȡ�����Ƴ����б�����һ��Ԫ��
        System.out.println("peekLast(): "+linkedList.peekLast());
        
        //��ȡ���Ƴ����б�ĵ�һ��Ԫ��
        linkedList.pollFirst();
        System.out.println("After pollFirst"+linkedList);
        
        //��ȡ���Ƴ����б�����һ��Ԫ��
        linkedList.peekLast();
        System.out.println("After pollLast"+linkedList);
        
        //��Ԫ��������б�����ʾ�Ķ�ջ�����뵽�б��ͷ��
        linkedList.push(2);
        System.out.println("After push(2): "+linkedList);
        
        //�Ӵ��б�����ʾ�Ķ�ջ������һԪ�أ���ȡ���Ƴ���һ��Ԫ�أ�
        linkedList.pop();
        System.out.println("After pop(): "+linkedList);
        
        linkedList.add(3);
        
        //�Ӵ��б����Ƴ���һ�γ��ֵ�ָ��Ԫ�أ���ͷ��λ�����б�
        linkedList.removeFirstOccurrence(3);
        System.out.println("After removeFirstOccurrence(3): "+linkedList);
        
        //�Ӵ��б����Ƴ����һ�γ��ֵĵ�ָ��Ԫ�أ���ͷ����β�����б�
        linkedList.removeLastOccurrence(3);
        System.out.println("After removeLastOccurrence(3): "+linkedList);
        
        
		// ****************��������****************************
        System.out.println("��������");
        
        linkedList.clear();
        
        for(int i=0;i<20;i++) {
        	linkedList.add(i);
        }
        
        //����������
        long start=System.currentTimeMillis();
        Iterator<Integer> iterator=linkedList.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator);
        	iterator.next();
        }
        long end=System.currentTimeMillis();
        
        System.out.println("time of Iterator: "+(end-start));
        
        //˳����������������
        start=System.currentTimeMillis();
        for(int i=0;i<linkedList.size();i++) {
        	
        	System.out.println(linkedList.get(i));
        }
        end=System.currentTimeMillis();
        System.out.println("time of for: "+(end-start));
        //��һ��forѭ������
        start=System.currentTimeMillis();
        for(Integer i:linkedList) {
        	System.out.println(i);
        }
        end=System.currentTimeMillis();
        System.out.println("time of for2: "+(end-start));
        
        //  ͨ��pollFirst()��pollLast()������LinkedList
        LinkedList<Integer> temp1 = new LinkedList<>();
        temp1.addAll(linkedList);
        start = System.currentTimeMillis();
        while(temp1.size() != 0){
            temp1.pollFirst();
        }
        end = System.currentTimeMillis();
        System.out.println("pollFirst()��pollLast()��" + (end - start) +" ms");

        // ͨ��removeFirst()��removeLast()������LinkedList
        LinkedList<Integer> temp2 = new LinkedList<>();
        temp2.addAll(linkedList);
        start = System.currentTimeMillis();
        while(temp2.size() != 0){
            temp2.removeFirst();
        }
        end = System.currentTimeMillis();
        System.out.println("removeFirst()��removeLast()��" + (end - start) +" ms");
	}

}
