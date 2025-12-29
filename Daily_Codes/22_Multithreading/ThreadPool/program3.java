/* Concept = creating ThreadPool using 'newsingleThreadExecutor' method
 */

import java.util.concurrent.*;
class MyThreadPool3 implements Runnable {

        int num = 0;

        MyThreadPool3(int num) {

                this.num = num;
        }
        public void run() {
                System.out.println(Thread.currentThread()+" start "+num);
                task();
                System.out.println(Thread.currentThread()+" end "+num);
        }
        void task (){

                try{

                        Thread.sleep(4000);
                }
                catch (InterruptedException e ){

                }
        }

}

class ThreadPoolDemo3 {

        public static void main(String args[] ) {

                ExecutorService obj = Executors.newSingleThreadExecutor();

                for (int i=1; i<=10 ;i++) {

                        MyThreadPool3 obj1 = new MyThreadPool3(i);
                        obj.execute(obj1);
                }
                obj.shutdown();
        }
}
