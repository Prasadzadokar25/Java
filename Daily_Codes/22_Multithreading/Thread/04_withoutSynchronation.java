class Counter {
    int count;

    void incriment() {
        count++;
    }
}

class MultiThreadingExample {
    public static void main(String[] args) {
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for (int i = 1; i <= 10000; i++) {
                c.incriment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 10000; i++) {
                c.incriment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(c.count); // Exepted 20000 but got < 20000
    }
}