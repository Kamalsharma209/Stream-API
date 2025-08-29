import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FindMaxAndMin {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(90, 24, 24, 14, 5, 6, 34, 55, 1, 134, 90);
        int[] arr = {90, 24, 24, 14, 5, 6, 34, 55, 1, 134, 90};
        int min = Arrays.stream(arr).min().orElseThrow();
        int max =  Arrays.stream(arr).max().orElseThrow();
        System.out.println("min " +min);
        System.out.println("max: "+ max);
    }
}
