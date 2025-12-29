/* concept = Creating our ThreadGroup
 */


class MyThreadGroup extends Thread {

	MyThreadGroup(ThreadGroup tg , String str) {

		super(tg,str);
	}

	public void run() {

		System.out.println(Thread.currentThread());


	}
}
class ThreadGroupDemo1 {

	public static void main(String [] args ){

		ThreadGroup obj = new ThreadGroup ("prasad"); //  by This line we can create a ThreadGroup with name prasad

		MyThreadGroup t1 = new MyThreadGroup(obj,"😊"); // This line create a Thread a under the ThreadGroup prasad
		t1.start();

		MyThreadGroup t2 = new MyThreadGroup(obj,"😂");
                t2.start();


	}
}
