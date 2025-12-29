class MyThread implements Runnable {

    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println("My thread");
        }
    }
}

class MultiThreadingExample {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        Thread t = new Thread(myThread);
        t.start();

        for (int i = 0; i <= 1000; i++) {
            System.out.println("Main thread");
        }
    }
}