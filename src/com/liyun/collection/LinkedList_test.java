package com.liyun.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_test {
	/*
	 * offer，add区别：
	 * 
	 * 一些队列有大小限制，因此如果想在一个满的队列中加入一个新项，多出的项就会被拒绝。
	 * 
	 * 这时新的 offer 方法就可以起作用了。它不是对调用 add() 方法抛出一个 unchecked 异常，而只是得到由 offer() 返回的
	 * false。
	 * 
	 * 
	 * 
	 * poll，remove区别：
	 * 
	 * remove() 和 poll() 方法都是从队列中删除第一个元素。remove() 的行为与 Collection 接口的版本相似，
	 * 
	 * 但是新的 poll() 方法在用空集合调用时不是抛出异常，只是返回 null。因此新的方法更适合容易出现异常条件的情况。
	 * 
	 * 
	 * 
	 * peek，element区别： element() 和 peek() 用于在队列的头部查询元素。与 remove() 方法类似，在队列为空时，
	 * element() 抛出一个异常，而 peek() 返回 null
	 */

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();

		// 添加元素到列表开头
		linkedList.addFirst(0);

		// 在列表结尾添加元素
		linkedList.add(1);

		// 在指定位置添加元素
		linkedList.add(2, 2);

		// 添加元素到列表结尾
		linkedList.addLast(3);

		System.out.println("LinkedList: " + linkedList);

		// ****************位置访问操作****************************

		System.out.println("位置操作");

		// 将此列表中指定位置的元素替换为指定的元素
		linkedList.set(1, 3);
		System.out.println("After set(1,3): " + linkedList);

		// 返回此列表中指定位置处的元素
		System.out.println("get(1): " + linkedList.get(1));

		// ****************Search操作****************************
		System.out.println("Search操作");
		linkedList.add(3);

		// 返回列表中首次出现指定元素的索引
		System.out.println("indexOf(3): " + linkedList.indexOf(3));

		// 返回列表最后出现指定元素的索引
		System.out.println("lastIndexOf(3): " + linkedList.lastIndexOf(3));

		// ****************Queue操作****************************
		System.out.println("Queue操作");

		// element() 和 peek() 用于在队列的头部查询元素。与 remove() 方法类似，在队列为空时， element() 抛出一个异常，而
		// peek() 返回 null
		// 获取但不移除次列表额头
		System.out.println("peek(): " + linkedList.peek());

		// 获取但不移除此列表的头
		System.out.println("element(): " + linkedList.element());

		// remove() 和 poll() 方法都是从队列中删除第一个元素。remove() 的行为与 Collection 接口的版本相似，
		// 但是新的 poll() 方法在用空集合调用时不是抛出异常，只是返回 null。因此新的方法更适合容易出现异常条件的情况
		// 获取并移除此列表的头
		linkedList.poll();
		System.out.println("After pool(): " + linkedList);

		// 获取并移除此列表的头
		linkedList.remove();
		System.out.println("After remove(): " + linkedList);

		// 一些队列有大小限制，因此如果想在一个满的队列中加入一个新项，多出的项就会被拒绝。
		// 这时新的 offer 方法就可以起作用了。它不是对调用 add() 方法抛出一个 unchecked 异常，而只是得到由 offer() 返回的
		// false。
		// 将指定元素添加到此列表的末尾
		linkedList.offer(4);
		System.out.println("After offer(4): " + linkedList);
		
		// ****************Deque操作****************************
        System.out.println("Deque操作");
        
        //在此列表开头插入指定的元素
        linkedList.offerFirst(2);
        System.out.println("After offerFirst(2): "+linkedList);
        
        //在此列表末尾插入指定的元素
        linkedList.offerLast(5);
        System.out.println("After offerLast(5): "+linkedList);;
        
        //获取但不移除此列表的第一个元素
        System.out.println("peekFirst(): "+linkedList.peekFirst());
        
        //获取但不移除此列表的最后一个元素
        System.out.println("peekLast(): "+linkedList.peekLast());
        
        //获取并移除此列表的第一个元素
        linkedList.pollFirst();
        System.out.println("After pollFirst"+linkedList);
        
        //获取并移除此列表的最后一个元素
        linkedList.peekLast();
        System.out.println("After pollLast"+linkedList);
        
        //将元素推入此列表所表示的堆栈（插入到列表的头）
        linkedList.push(2);
        System.out.println("After push(2): "+linkedList);
        
        //从此列表所表示的堆栈处弹出一元素（获取并移除第一个元素）
        linkedList.pop();
        System.out.println("After pop(): "+linkedList);
        
        linkedList.add(3);
        
        //从此列表中移除第一次出现的指定元素（从头到位遍历列表）
        linkedList.removeFirstOccurrence(3);
        System.out.println("After removeFirstOccurrence(3): "+linkedList);
        
        //从此列表中移除最后一次出现的的指定元素（从头到到尾遍历列表）
        linkedList.removeLastOccurrence(3);
        System.out.println("After removeLastOccurrence(3): "+linkedList);
        
        
		// ****************遍历操作****************************
        System.out.println("遍历操作");
        
        linkedList.clear();
        
        for(int i=0;i<20;i++) {
        	linkedList.add(i);
        }
        
        //迭代器遍历
        long start=System.currentTimeMillis();
        Iterator<Integer> iterator=linkedList.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator);
        	iterator.next();
        }
        long end=System.currentTimeMillis();
        
        System.out.println("time of Iterator: "+(end-start));
        
        //顺序遍历（随机遍历）
        start=System.currentTimeMillis();
        for(int i=0;i<linkedList.size();i++) {
        	
        	System.out.println(linkedList.get(i));
        }
        end=System.currentTimeMillis();
        System.out.println("time of for: "+(end-start));
        //另一种for循环遍历
        start=System.currentTimeMillis();
        for(Integer i:linkedList) {
        	System.out.println(i);
        }
        end=System.currentTimeMillis();
        System.out.println("time of for2: "+(end-start));
        
        //  通过pollFirst()或pollLast()来遍历LinkedList
        LinkedList<Integer> temp1 = new LinkedList<>();
        temp1.addAll(linkedList);
        start = System.currentTimeMillis();
        while(temp1.size() != 0){
            temp1.pollFirst();
        }
        end = System.currentTimeMillis();
        System.out.println("pollFirst()或pollLast()：" + (end - start) +" ms");

        // 通过removeFirst()或removeLast()来遍历LinkedList
        LinkedList<Integer> temp2 = new LinkedList<>();
        temp2.addAll(linkedList);
        start = System.currentTimeMillis();
        while(temp2.size() != 0){
            temp2.removeFirst();
        }
        end = System.currentTimeMillis();
        System.out.println("removeFirst()或removeLast()：" + (end - start) +" ms");
	}

}
