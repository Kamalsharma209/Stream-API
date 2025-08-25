package StreamAPI_Integer;

import java.util.Arrays;
import java.util.List;

public class FilterElements {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 258, 3, 4, 554, 6, 7, 85, 96, 10);
        l.stream()
                .filter(x -> x > 30)
                .forEach(System.out::println);
    }
}
