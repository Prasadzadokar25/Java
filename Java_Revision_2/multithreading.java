class MyThread extends Thread {

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("1");
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().setName("prasad");
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class Main {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i <= 1000000000; i++) {
            System.out.println("0");
        }
    }
}