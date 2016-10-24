package com.protocal.zhangxuefeng.po;

public class ThreadDemo extends Thread{

	private volatile int count = 5;
	
	Object a = new Object();
	Object b = new Object();
	boolean flag = true;
	@Override
	public void run() {
		//会在这里开启一个线程 执行这里的逻辑。单独执行这里的逻辑
		while(true){
			if(flag){
				synchronized (a) {
					count--;
					System.out.println("thread-name=" + this.currentThread().getName() + "count=" + count);
					synchronized (b) {
						System.out.println("one donging..........");
					}
				}
			}else{
				synchronized (b) {
					count--;
					System.out.println("thread-name=" + this.currentThread().getName() + "count=" + count);
					synchronized (a) {
						System.out.println("one donging..........");
					}
				}
			}
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		
		Thread t1 = new Thread(td,"t1");
		Thread t2 = new Thread(td,"t2");
		Thread t3 = new Thread(td,"t3");
		
		Thread t4 = new Thread(td,"t4");
		Thread t5 = new Thread(td,"t5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
}
