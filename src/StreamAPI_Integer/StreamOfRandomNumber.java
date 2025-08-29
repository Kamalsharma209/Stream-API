package StreamAPI_Integer;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamOfRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        IntStream.generate(() -> random.nextInt(1000))
                .limit(100)
                .forEach(System.out::println);
    }
}
