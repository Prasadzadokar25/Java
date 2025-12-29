
class MyThreadGroup4 extends Thread {

	MyThreadGroup4(ThreadGroup obj ,String str){

		super(obj,str);
	}

	public void run() {

		System.out.println(Thread.currentThread());
		/*try{
			Thread.sleep(1000);
		}catch(InterruptedException e ){
		}*/
	}
}
class ThreadGroupDemo4 {

	public static void main(String []args )throws InterruptedException{

		ThreadGroup tg = new ThreadGroup("c2w");

		MyThreadGroup4 obj1 = new MyThreadGroup4(tg,"c");
		obj1.start();

		//System.out.println(obj1.activeCount());
			

		System.out.println(tg.activeCount());       // 1
		System.out.println(tg.activeGroupCount());  // 0

		ThreadGroup tg2 = new ThreadGroup(tg,"Biencaps");
		MyThreadGroup4 obj2 = new MyThreadGroup4(tg2,"java");

                obj2.start();

		ThreadGroup tg3 = new ThreadGroup(tg,"google");
                MyThreadGroup4 obj3 = new MyThreadGroup4(tg3,"flutter");

                obj3.start();

		System.out.println(tg.activeCount());      // 
                System.out.println(tg.activeGroupCount());  // 2


	}
}
