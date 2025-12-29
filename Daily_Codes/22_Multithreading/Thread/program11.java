/* Concept = Methods in Thread class
 */

class MyThread11 extends Thread {

	public void run() {
		
		
		//System.out.println(Thread.currentThread().activeCount());
		/*try{
			Thread.sleep(200);
		}
		catch(InterruptedException e){
		}*/

		

                System.out.println("getName 1 = " +getName());   //System.out.println("getName 1 = " +Thread.currentThread().getName());
								 
								/* we can write this type also but we can not use obj.getName() here 
								 * if we use obj then we get error symbol not found*/
		 

        /*        System.out.println("getPriority 1 = "+getPriority());  

                System.out.println("activeCount 1 = "+activeCount());  

                System.out.println("countStackFrames 1 ="+countStackFrames());

                System.out.println("isAlive 1 = "+isAlive());  

		setName("prasad");

          */ 

	}

}
class ThreadDemo11 {

	public static void main(String args[]){

		MyThread11 obj = new MyThread11();

		obj.start();  // start the thread
			     
		obj.setName("prasad");   // it chenge the thread name with given name
		
		System.out.println("getName 0 = " +obj.getName());      // return the name of current thread
								      
		System.out.println("getPriority 0 = "+obj.getPriority());  // return the priority of thread

		System.out.println("activeCount 0 = "+obj.activeCount());  //reture total number of avtive threads at that time

		System.out.println("getThreadGroup 0 = "+obj.getThreadGroup());  // return the name of threadgroup of the thread

		System.out.println("countStackFrames 0 ="+Thread.currentThread().countStackFrames()); // return the number of stackFrames

		System.out.println("isAlive 0 = "+obj.isAlive());  // it return true if the thread is active else return false
								    
		//obj.stop(); // stops the thread




	}
}
