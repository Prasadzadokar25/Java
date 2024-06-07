import java.util.concurrent.*;
class MyThread implements Runnable{

	public void run(){
		System.out.println(Thread.currentThread().getName());
		try{
			Thread.sleep(1000);
		}catch(Exception e){
		}
	}
}
class Client{

	public static void main(String args[]){

		ExecutorService ser =  Executors.newFixedThreadPool(5);

		for(int i=0; i<10; i++){
			MyThread obj = new MyThread();
			ser.execute(obj);
		}
		ser.shutdown();
	}
}
			
