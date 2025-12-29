/*Concept = Giving name to the thread at time of creation
 */

class MyThread12 extends Thread {

	MyThread12(String str ) {   // we are passing the pararameter at the time of object creation hence we need constructor with same parameter

		super(str);   //this parameter need to pass to the constructor of Thread class hence pass to super line
	}

	public void run(){


		System.out.println("Thread Name = "+getName());

		System.out.println("group name = "+Thread.currentThread().getThreadGroup());

		System.out.println(Thread.currentThread());


	}
}
class ThreadDemo12 {

	public static void main(String []args) {

		MyThread12 obj = new MyThread12("prasad");
		obj.start();

	}
}
