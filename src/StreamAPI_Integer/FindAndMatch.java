package StreamAPI_Integer;

import java.util.Arrays;

public class FindAndMatch {
    public static void main(String[] args) {
        int[] arr = {3,7,10,12};
        boolean result = Arrays.stream(arr)
                .anyMatch(x->x > 8);
        System.out.println(result);
        allmatch();
    }
    public static void  allmatch(){
        int[] arr = {3,7,10,12};
        boolean result = Arrays.stream(arr)
                .allMatch(x -> x > 8);
        System.out.println(result);
    }
}
