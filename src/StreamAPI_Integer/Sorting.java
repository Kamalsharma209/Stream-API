package StreamAPI_Integer;

import java.util.Arrays;
import java.util.List;

public class Sorting{
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(4,3,5,62,1,5,6,74,2,14,5,2);
        l.stream()
                .sorted() // to sort the orde..
                .distinct() // to remove duplicate..
                .forEach(System.out::println);
    }
}
