package StreamAPI_Integer;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        int[] arr = IntStream.rangeClosed(1, 1000000).toArray();
        long sum = Arrays.stream(arr)
                .parallel()
                .sum();
        System.out.println("Sum: " + sum);
    }
}
