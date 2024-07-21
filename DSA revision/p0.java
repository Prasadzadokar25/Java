class Main {
    public static void main(String[] args) {
        int num = 1211;

        int temp = num;
        int rev = 0;

        while ((num != 0)) {
            rev = rev * 10 + num % 10;
            num = num / 10;

        }
        if (rev == temp) {
            System.out.println("Yss");
        }
    }
}