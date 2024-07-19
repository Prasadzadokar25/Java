import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;

public class all {

    public static void main(String[] args) throws IOException {

        // Scanner sc = new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // int age = Integer.parseInt(br.readLine());
        // System.out.println(age);
        // double age2 = sc.nextDouble();
        // System.out.println(age2);
        // String age3 = sc.nextLine();
        // System.out.println(age3);
        // String age4 = sc.next();
        // System.out.println(age4);
        // boolean age5 = sc.nextBoolean();

        // System.out.println(age5);

        /* array */

        int[] arr = { 128, 2, 2, 2 };

        int[] arr2 = arr.clone();

        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));

        for (int x : arr) {
            System.out.println(x);
        }
        int x = 10;
        String ste = new String("prasad");
        String st2 = new String("prasad");

        System.out.println(System.identityHashCode(arr[0]));
        System.out.println(System.identityHashCode(arr[0]));
        System.out.println(System.identityHashCode(arr[0]));
        System.out.println(st2.hashCode());

    }
}
