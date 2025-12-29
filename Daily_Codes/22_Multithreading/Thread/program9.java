/* Concept = Deadlock for by join method 
 */

class MyThread9 extends Thread {

	static Thread nmMain = null;

	public void run() {
		try{
			nmMain.join();
		}
		catch(InterruptedException e ){
		
		}
		System.out.println("In run");
	}
}
class ThreadDemo9 {
	
	public static void main(String [] args) {

		 MyThread9.nmMain = Thread.currentThread();

		MyThread9 obj = new MyThread9();
		obj.start();
		try{
                        obj.join();
                }
                catch(InterruptedException e ){

                }
		
		System.out.println("In Main");
	}
}
