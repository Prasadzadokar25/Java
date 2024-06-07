class MyThread extends Thread{

	MyThread(String name){
		super(name);
	}
	public void run(){
		for(int i = 100; i<=120; i++){
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getPriority());
		}
	}
}
class Main{

	public static void main(String[] args)throws Exception{

		MyThread obj = new MyThread("prasad");
		obj.start();

		
		for(int i = 1; i<=200; i++){
                        System.out.println(i);
			System.out.println(Thread.currentThread().getName());
			Thread.currentThread().setPriority(9);
			System.out.println(Thread.currentThread().getPriority());
                }
	}
}
