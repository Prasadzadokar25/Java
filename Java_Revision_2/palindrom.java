public class palindrom {
    public static void main(String[] args) {
        int num = 1321;

        System.out.println(reverse(num));
        if (num == reverse(num))
            System.out.println("yes");
        else
            System.out.println("no");

    }

    static int reverse(int num) {

        if (num == 0) {
            return num;
        }
        int reverse = num % 10;

        return reverse * 10 + reverse(num / 10);
    }
}
