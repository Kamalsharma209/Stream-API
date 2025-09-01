package StreamAPI_String;

import java.util.Arrays;

public class Filter_String_Based_Length {
    public static void main(String[] args) {
        String[] words = {"mongo","orange","onion","opopo"};
        Arrays.stream(words)
                .filter(word -> word.length() >5)
                .filter(word -> word.length() % 2 == 0)
                .forEach(System.out::println);
    }
}
