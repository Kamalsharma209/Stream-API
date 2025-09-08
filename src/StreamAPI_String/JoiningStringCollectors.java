package StreamAPI_String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoiningStringCollectors {
    public static void main(String[] args) {
        String[] words = {"mongo","orange","onion","opopo"};
        String sentence = Arrays.stream(words)
                .collect(Collectors.joining(" "));
        System.out.println(sentence);

    }
}
