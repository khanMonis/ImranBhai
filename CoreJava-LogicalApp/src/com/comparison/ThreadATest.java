package com.comparison;

public class ThreadATest {
	
	public synchronized void  m1() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("AAAAAA");
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadATest o1 = new  ThreadATest();
		ThreadATest o2 = new  ThreadATest();
		o1.m1();
		o2.m1();
	}

}
