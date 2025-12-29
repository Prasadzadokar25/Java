/* Concept = Concurancy methods in Thread class
 *
 * 1.sleep
 * 2.join
 * 3.yield
 *
 */

// 2.join

class MyThread8 extends Thread {

	public void run() {

		for(int i=1;i<=10;i++){
			System.out.println("In run ");
		}
	}
}
class ThreadDemo8 {

	public static void main(String [] args) throws InterruptedException {

		MyThread8 obj = new MyThread8();
		obj.start();

		obj.join(); // join method first complete the work of thread created by obj then come to main thread

		 for(int i=1;i<=10;i++){
                        System.out.println("In main ");
                }
	}
}
