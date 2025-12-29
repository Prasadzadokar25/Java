
// Templete for stream api
// filter even number
import java.util.List;
import java.util.stream.Stream;

class StreamApiExample {
    public static void main(String[] args) {

        List<Integer> num = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Stream<Integer> st = num.stream();
        Stream<Integer> st2 = st.filter(n -> n % 2 == 0);

        st2.forEach(n -> System.out.println(n));

        System.out.println("*******or*******");

        num.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));

    }
}