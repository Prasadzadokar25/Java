/* Concept = Concurancy methods in Thread class
 *
 * 1.sleep
 * 2.join
 * 3.yield
 *
 */

// 1.sleep

class MyThread7 extends Thread {

	public void run() {

		System.out.println(Thread.currentThread());
	}
}
class ThreadDemo7 {

	public static void main(String [] args) throws InterruptedException {

		System.out.println(Thread.currentThread());

		MyThread7 obj = new MyThread7 ();
		obj.start();

		Thread.sleep(2000);       // Main thread sleep for 2 second
		Thread.currentThread().setName("prasas");  //setName method use to set the name of thread
		System.out.println(Thread.currentThread());
	}
}
