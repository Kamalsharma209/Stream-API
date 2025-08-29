package StreamAPI_Integer;

import java.util.Arrays;

public class CountElements {
    public static void main(String[] args) {
        int[] arr = {90,45,34,24,24,56,};
        long count = Arrays.stream(arr)
                .filter(x -> x %2 == 0)
                .count();
        System.out.println(count);
    }
}
