/* concept =  creating multipal ThreadGroup
 */

class MyThreadGroup2 extends Thread {

	MyThreadGroup2 (ThreadGroup tg , String str) {

		super (tg,str);
	}

	public void run() {

		System.out.println(Thread.currentThread());



	}
}
class ThreadGroupDemo2 {

	public static void main(String args []){

		ThreadGroup  obj1 = new ThreadGroup("om");  // ThreadGroup 1
		ThreadGroup  obj2 = new ThreadGroup("prasad"); // ThreadGroup 2

		MyThreadGroup2 t1 = new MyThreadGroup2(obj1,"A");
		MyThreadGroup2 t2 = new MyThreadGroup2(obj1,"B");
		MyThreadGroup2 t3 = new MyThreadGroup2(obj1,"c");

		t1.start();
		t2.start();
		t3.start();

		MyThreadGroup2 t4 = new MyThreadGroup2(obj2,"x");
                MyThreadGroup2 t5 = new MyThreadGroup2(obj2,"y");
                MyThreadGroup2 t6 = new MyThreadGroup2(obj2,"z");

	   	t4.start();
                t5.start();
                t6.start();
	}
}
