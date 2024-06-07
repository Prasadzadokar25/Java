class Main {
    public static void main(String[] args) {
        int x = 100;
        int count = 0;
        if (x >= 2) {
            System.out.println(2); // Print the only even prime number
        }
        for (int i = 3; i <= x; i += 2) { // Start from 3, skip even numbers
            int flag = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
                count++;
            }
            if (flag == 0) {
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}

