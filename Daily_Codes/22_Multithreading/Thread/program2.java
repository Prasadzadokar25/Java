// concept = tempery Sleeping of thread




class MyThread2 extends Thread {

        public void run() {                       
                for(int i = 0;i<10;i++){
                                System.out.println("In run ***");
				try{                                   
					Thread.sleep(2000);
				}catch(InterruptedException obj ){
					
				}
		/* we can not use throws here becouse the run methodd in the Thread class can not
		 * throws any exception and we are overiding that run method so run method in
		 * our code should not throws any exception*/

                }

        }
}
class ThreadDemo2{
        public static void main(String args[]){
                MyThread2 obj1 = new MyThread2();
                obj1.start();
                for(int i = 0;i<10;i++){
                        System.out.println("In main ----");
			  try{
                                        Thread.sleep(2000);
                          }catch(InterruptedException obj ){

                          }
                }
        }
}		
