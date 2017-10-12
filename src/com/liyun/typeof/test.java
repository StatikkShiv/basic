package com.liyun.typeof;

import java.util.Scanner;

public class test {
	public static int sum=1;
	public static int factorial(int i) {
		
		if(i==0 || i--==0)
			return 1;
		
			sum=i*factorial(i--);
		return sum;
	}
public static void main(String[] args) {

	double s=0,j=1;
	for (int i=1;i<=100000;i++ )
	{
		j=j*i;
		s=s+1/j;
		System.out.println("J的值是："+j);
		System.out.println("s的值是："+s);
		System.out.println();
	}
	System.out.println("最终的值是："+s);
}
}

