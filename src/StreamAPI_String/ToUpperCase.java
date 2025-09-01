package StreamAPI_String;

import java.util.Arrays;

public class ToUpperCase {
    public static void main(String[] args) {
        String[] words = {"mongo","orange","onion","opopo"};
        Arrays.stream(words)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
