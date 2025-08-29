package StreamAPI_Integer;

import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        max();
        min();
        sum();
        product();
    }

    public static void min() {
        List<Integer> l = Arrays.asList(1, 258, 3, 4, 554, 6, 7, 85, 96, 10);
        int sum = l.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
        System.out.println(sum);

    }

    public static void max() {
        List<Integer> l = Arrays.asList(1, 258, 3, 4, 554, 6, 7, 85, 96, 10);
        int sum = l.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println(sum);


    }

    public static void sum() {
        List<Integer> l = Arrays.asList(1, 258, 3, 4, 554, 6, 7, 85, 96, 10);
        int sum = l.stream()
                .reduce(0,(a,b) -> a + b);
        System.out.println(sum);

    }

    public static void product() {
        List<Integer> l = Arrays.asList(1,2,2,1);
        int sum = l.stream()
                .reduce(0, (a,b) -> a > b ? a*a : b*b);
        System.out.println(sum);

    }

    public static class FindMaxAndMin {
        public static void main(String[] args) {
            List<Integer> l = Arrays.asList(90, 24, 24, 14, 5, 6, 34, 55, 1, 134, 90);
            int[] arr = {90, 24, 24, 14, 5, 6, 34, 55, 1, 134, 90};
            int min = Arrays.stream(arr).min().orElseThrow();
            int max =  Arrays.stream(arr).max().orElseThrow();
            System.out.println("min " +min);
            System.out.println("max: "+ max);
        }
    }
}

