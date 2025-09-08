package StreamAPI_String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        Arrays.sort(s.toCharArray());
        Arrays.sort(t.toCharArray());
        Arrays.equals(s.toCharArray(), t.toCharArray());
    }
}
