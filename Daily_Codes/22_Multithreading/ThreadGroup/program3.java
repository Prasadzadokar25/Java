/* concept = creating child ThreadGroup
 */

class MyThreadGroup3 extends Thread {

        MyThreadGroup3 (ThreadGroup tg , String str) {

                super (tg,str);
        }

        public void run() {

                System.out.println(Thread.currentThread());



        }
}
class ThreadGroupDemo3 {

        public static void main(String args []){

                ThreadGroup  obj1 = new ThreadGroup("om");  // ThreadGroup 1
                ThreadGroup  obj2 = new ThreadGroup(obj1,"prasad"); // ThreadGroup 2 child of ThreadGroup 1

                MyThreadGroup2 t1 = new MyThreadGroup2(obj1,"A");
                MyThreadGroup2 t2 = new MyThreadGroup2(obj1,"B");
                MyThreadGroup2 t3 = new MyThreadGroup2(obj1,"c");

                t1.start();
                t2.start();
                t3.start();

                MyThreadGroup2 t4 = new MyThreadGroup2(obj2,"x");
                MyThreadGroup2 t5 = new MyThreadGroup2(obj2,"y");
                MyThreadGroup2 t6 = new MyThreadGroup2(obj2,"z");

                t4.start();
                t5.start();
                t6.start();

		System.out.println("active group count in threadgroup om = "+obj1.activeGroupCount());

		System.out.println(obj1.getParent());

		System.out.println(obj2.getParent());

		System.out.println(obj1.getMaxPriority());

		System.out.println(obj1.isDaemon());

		obj1.interrupt();
        }

}
