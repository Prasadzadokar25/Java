/* Concept  = Creatting 3 thread
 */


class MyThread4A extends Thread {

	public void run() {

		System.out.println("MyThread4A = "+Thread.currentThread().getName());
	}
}
class MyThread4B extends Thread {

        public void run() {

                System.out.println("MyThread4B = "+Thread.currentThread().getName());
		MyThread4A obj1 = new MyThread4A();
 	        obj1.start();
        }


}
class ThreadDemo4 {
	
	public static void main(String [] args){

	MyThread4B obj2 = new MyThread4B();
        obj2.start();

	System.out.println("main = "+Thread.currentThread().getName());
	}
}
