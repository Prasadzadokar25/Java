class Demo {
    Demo() {
        System.out.println("con");
    }
}

/**
 * constructer
 */
class Main {
    static {
        Demo obj = new Demo();
        System.exit(0);
    }

    public static void main(String[] args) {

        System.out.println("in main");
    }

}
