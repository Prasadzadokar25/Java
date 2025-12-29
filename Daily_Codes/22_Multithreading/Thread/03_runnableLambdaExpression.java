class MultiThreadingExample {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 0; i <= 1000; i++) {
                System.out.println("My thread 1111111111");
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i <= 1000; i++) {
                System.out.println("My thread 222222222");
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}