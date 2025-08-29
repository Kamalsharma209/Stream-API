package StreamAPI_Integer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToList {
    public static void main(String[] args) {
        String[] arr = {"appy","mohit","rohit"};
        List<String> l = Arrays.stream(arr)
                .collect(Collectors.toList());
        System.out.println(l);
    }
}
