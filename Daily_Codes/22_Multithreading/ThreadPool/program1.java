/*  Concept = Creating ThreadPool using newFixedThreadPool(int) Method 
 */

import java.util.concurrent.*;

class MyThreadPool1 implements Runnable  {

	int num = 0;

	MyThreadPool1 (int num) {

		this.num = num;
	}
	public void run () {

		System.out.println(Thread.currentThread()+" start "+num);
		task();
		System.out.println(Thread.currentThread()+" end "+num);
	}
	void task (){

		try{

			Thread.sleep(40000);
		}
		catch (InterruptedException e ){

		}
	}

}

class ThreadPoolDemo1 {

	public static void main(String [] args ){

		ExecutorService ser = Executors.newFixedThreadPool(5);

		for (int i = 1; i<=10; i++) {
	
			MyThreadPool1 obj = new MyThreadPool1 (i);
			ser.execute(obj);
		}
		ser.shutdown();
	}
}
