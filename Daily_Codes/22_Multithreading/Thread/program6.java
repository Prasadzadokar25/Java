/* Concept = priority of Thread
 *
 * Default priority = 5
 * Maximum priority = 10
 * Minimun priority = 0
 */

class MyThread6 extends Thread {

	public void run() {

		Thread t = Thread.currentThread();
		System.out.println("Thread-0 = "+t.getPriority());

	}
}
class ThreadDemo6 {

	public static void main(String [] args ){

		Thread t = Thread.currentThread();
		System.out.println("main default  priority = "+t.getPriority());

		MyThread6 obj1 =  new MyThread6();
		obj1.start();

		t.setPriority(7);

		Thread obj2 = Thread.currentThread();
		System.out.println("main priority after setPriority= "+obj2.getPriority());
	}
}		
