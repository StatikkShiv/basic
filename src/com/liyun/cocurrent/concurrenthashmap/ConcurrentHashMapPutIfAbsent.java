package com.liyun.cocurrent.concurrenthashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class ConcurrentHashMapPutIfAbsent {

	public static void main(String[] args) {
		
		final Map<String,Integer> count=new ConcurrentHashMap();
		final CountDownLatch endLatch=new CountDownLatch(2);
		
		Runnable task=new Runnable() {
			
			@Override
			public void run() {
				
				Integer oldValue,newValue;
				for(int i=0;i<5;i++) {
					//这里用while就是为了保证两个线程的每个加一都会运行，失败了就继续replace尝试
					while(true) {
						oldValue=count.get("a");
						if(null==oldValue) {
							newValue=1;
							if(count.putIfAbsent("a", newValue)==null);
							break;
						}
						else {
							newValue=oldValue+1;
							if(count.replace("a", oldValue, newValue));
							break;
						}
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
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
}
