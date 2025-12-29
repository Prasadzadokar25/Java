/* Concept = creating ThreadPool using 'newCachedThreadPool' method 
 */

import java.util.concurrent.*;
class MyThreadPool2 implements Runnable {

	int num = 0;

	MyThreadPool2(int num) {

		this.num = num;
	}
	public void run() {
		System.out.println(Thread.currentThread()+" start "+num);
                task();
                System.out.println(Thread.currentThread()+" end "+num);
        }
        void task (){

                try{

                        Thread.sleep(4000);
                }
                catch (InterruptedException e ){

                }
	}

}

class ThreadPoolDemo2 {

	public static void main(String args[] ) {

		ExecutorService obj = Executors.newCachedThreadPool();

		for (int i=1; i<=10 ;i++) {

			MyThreadPool2 obj1 = new MyThreadPool2(i);
			obj.execute(obj1);
		}
		obj.shutdown();
	}
}

