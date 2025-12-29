// Background working of methods

// filter even number

import java.util.List;
import java.util.stream.Stream;
import java.util.function.Predicate;;

class StreamApiExample {
    public static void main(String[] args) {

        List<Integer> num = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        Predicate<Integer> p = new Predicate<Integer>() {

            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };

        // useing lambda function we can write
        // Predicate<Integer> p2 = n -> n % 2 == 0;
        // this is passed in filter method

        num.stream()
                .filter(p)
                .forEach(n -> System.out.println(n));

    }
}