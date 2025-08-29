package StreamAPI_Integer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingAndPartiting {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Anna", "Alice");
        //Map<Character, List<String>> grouped = names.stream()
            //    .collect(Collectors.groupingBy(name -> name.charAt(0)));
       // System.out.println(grouped);
    }
}
