public class digitsinnumber {
    static int sum = 0;

    public static void main(String[] args) {
        int num = 7854;
        printDigits(num);
        System.out.println(sum);
    }

    static void printDigits(int num) {
        if (num == 0) {
            return;
        }

        printDigits(num / 10);
        sum = sum + num % 10;
        System.out.println(num % 10);

    }
}
