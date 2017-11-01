package com.liyun.cocurrent.concurrenthashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentHashMapAtomicInteger {

	public static void main(String[] args) {

		final Map<String,AtomicInteger> count=new ConcurrentHashMap<>();
		final CountDownLatch endLatch=new CountDownLatch(2);
		
		Runnable task=new Runnable() {
			
			@Override
			public void run() {

				AtomicInteger oldValue;
				for(int i=0;i<5;i++) {
					oldValue=count.get("a");
					//初始为零的情况
					if(null==oldValue) {
						AtomicInteger zeroValue=new AtomicInteger(0);
						oldValue=count.putIfAbsent("a", zeroValue);
						if(null==oldValue)
							oldValue=zeroValue;
					}
					oldValue.incrementAndGet();
				}
				endLatch.countDown();
			}
		};
		
		new Thread(task).start();
		new Thread(task).start();
		
		try {
			endLatch.await();
			System.out.println(count);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
