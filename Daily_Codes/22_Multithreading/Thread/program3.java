/* concept = we need to call start method of Thread class to start the created thread
 * hence don't overide the start method 
 */

class MyThread3 extends Thread {
	
	public void run() {

		System.out.println("In rum");
		System.out.println(Thread.currentThread().getName()); // O/P : main thread
	}

	public void start() {

		System.out.println("In my thread");
		run();
	}
}
class ThreadDemo3 {

	public static void main(String args[]){

		MyThread3 obj = new MyThread3();
		obj.start();

		System.out.println(Thread.currentThread().getName());  // O/P : main thread
	}
}


