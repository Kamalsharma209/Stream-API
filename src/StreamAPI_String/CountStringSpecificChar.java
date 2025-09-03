package StreamAPI_String;

import java.util.Arrays;

public class CountStringSpecificChar {
    public static void main(String[] args) {
        String[] words = {"mongo","orange","onion","opopo"};
        long count = Arrays.stream(words)
                .filter(word -> word.contains("o"))
                .count();
        System.out.println(count);
    }
}
