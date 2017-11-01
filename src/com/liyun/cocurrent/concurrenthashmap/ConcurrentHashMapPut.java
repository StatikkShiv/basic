package com.liyun.cocurrent.concurrenthashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
/*
 * ConcurrentHashmap 
 * 在put操作时并没有对整个Map加锁，所以一个线程正在put(k,v)的时候，
 * 另一个线程调用get(k)会得到null，这就会造成一个线程put的值会被另一个线程put的值所覆盖。
 * 所以两个线程调用run的时候，如果一个线程正在访问，另一个线程就会返回null然后就会put("a",1)覆盖
 */
public class ConcurrentHashMapPut {
	public static void main(String[] args) {

		final Map<String, Integer> count = new ConcurrentHashMap<>();
		final CountDownLatch endLatch = new CountDownLatch(2);

		Runnable task = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					Integer value = count.get("a");
					if (null == value) {
						count.put("a", 1);
					} else {
						count.put("a", value + 1);
					}
				}
				endLatch.countDown();
			}
		};

		new Thread(task).start();
		new Thread(task).start();

		try {
			endLatch.await();
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
