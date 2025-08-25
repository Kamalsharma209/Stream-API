package StreamAPI_Integer;

import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 258, 3, 4, 554, 6, 7, 85, 96, 10);
        int sum = l.stream()
                .reduce(0,(a,b) -> a+b);
        System.out.println(sum);
    }
}
