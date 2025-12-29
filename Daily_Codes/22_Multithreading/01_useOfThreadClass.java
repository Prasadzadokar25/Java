
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("My thread 1");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("My thread 2");
        }
    }
}

class MultiThreadingExample {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.start();

    }
}