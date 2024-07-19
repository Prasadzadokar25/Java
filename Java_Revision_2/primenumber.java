public class primenumber {
    public static void main(String[] args) {
        int num = 15;

        int i = 2;
        int flag = 0;

        while (i * i <= num) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
            i++;
        }
        if (flag == 0) {
            System.out.println("prime");
        } else {
            System.out.println("No");
        }

        int a = 65;
        char ch = (char) a;
        System.out.println(ch);

    }
}
