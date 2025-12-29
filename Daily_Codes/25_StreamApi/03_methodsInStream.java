import java.util.List;
import java.util.stream.Stream;

class StreamApiExample {
    public static void main(String[] args) {

        List<String> num = List.of("prasad", "om", "ram", "soham");

        // filter
        num.stream()
                .filter(n -> n.length() > 3)
                .forEach(n -> System.out.println(n));

        // map
        System.out.println("*******map example*******");
        num.stream()
                .map(n -> n.toUpperCase())
                .forEach(n -> System.out.println(n));

        // sorted
        System.out.println("*******sorted example*******");
        num.stream()
                .sorted()
                .forEach(n -> System.out.println(n));

        // count
        System.out.println("*******count example*******");
        long c = num.stream()
                .filter(n -> n.length() > 3)
                .count();
        System.out.println(c);

        // limit
        System.out.println("*******limit example*******");
        num.stream()
                .limit(2)
                .forEach(n -> System.out.println(n));

        // reduece
        System.out.println("*******reduce example*******");
        List<Integer> num2 = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        int sum = num2.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}