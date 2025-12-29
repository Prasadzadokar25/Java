/* Concept = Concurancy methods in Thread class
 *
 * 1.sleep
 * 2.join
 * 3.yield
 *
 */

// 3 yield


class MyThread10 extends Thread {

	public void run () {

		System.out.println(Thread.currentThread());

	}
}
class ThreadDemo10 {

	public static void main(String [] args) {

		MyThread10 obj = new MyThread10();
		obj.start();
		
		obj.yield();  // Thread.yield  

		System.out.println(Thread.currentThread());
	}
}
