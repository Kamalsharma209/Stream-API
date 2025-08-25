package StreamAPI_Integer;

import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Object[] squared = l.stream()
                .map(x -> x * x)
                .toArray();
        System.out.println(Arrays.toString(squared));
    }
}
