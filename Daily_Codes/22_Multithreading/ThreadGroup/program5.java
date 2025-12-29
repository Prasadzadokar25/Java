/* Concerpt =  creating child ThreadGroup and adding thread in it using Runnable Interface
 */



class MyThreadGroup5 implements Runnable {

	public void run() {

		System.out.println(Thread.currentThread());

	}
}

class ThreadGroupDemo5 {

	public static void main(String args[]) {

		ThreadGroup PTG = new ThreadGroup ("India");

		MyThreadGroup5 obj1 = new MyThreadGroup5();
		MyThreadGroup5 obj2 = new MyThreadGroup5();


		Thread tg1 = new Thread(PTG,obj1,"maha");
		Thread tg2 = new Thread(PTG,obj2,"Goa");

		tg1.start();
		tg2.start();

		ThreadGroup CTG = new ThreadGroup(PTG,"pack");

		MyThreadGroup5 obj3 = new MyThreadGroup5();
                MyThreadGroup5 obj4 = new MyThreadGroup5();

		Thread tg3 = new Thread(CTG,obj3,"lahor");
                Thread tg4 = new Thread(CTG,obj4,"Karaci");
		
		tg3.start();
                tg4.start();

		System.out.println(PTG.activeCount());
		System.out.println(PTG.activeGroupCount());

	}
}
