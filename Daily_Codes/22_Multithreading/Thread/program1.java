// Concept = Creating multiplal thread in code 
 

class MyThread1 extends Thread {

	public void run() {
		for(int i = 0;i<10;i++){                    // When new thread is created it start the excecution of program from the 'run' method
				System.out.println("In run ***");
		} 

	}
}
class ThreadDemo1{
	public static void main(String args[]){
		MyThread1 obj = new MyThread1();        // This line is responsiable to create new thread
		obj.start();                            // This line start the new thread
		for(int i = 0;i<10;i++){
                	System.out.println("In main ----");
        	}
	}
}
