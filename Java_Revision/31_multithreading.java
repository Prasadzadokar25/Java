class MyThread implements Runnable{

	public void run(){
		for(int i = 100; i<=120; i++){
			System.out.println(i);
			System.out.print(Thread.currentThread().getName());
		}
	}
}
class Main{

	public static void main(String[] args)throws Exception{


		MyThread obj = new MyThread();
		Thread t = new Thread(obj,"prasad");
		t.start();

		for(int i = 1; i<=2000000; i++){
                        System.out.println(i);
			
                }
	}
}
