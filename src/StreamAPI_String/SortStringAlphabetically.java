package StreamAPI_String;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringAlphabetically {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().split(" ");
        Arrays.stream(words)
                .sorted()
                .forEach(System.out::println);
    }
}
