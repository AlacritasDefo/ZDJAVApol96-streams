package pl.sda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main( String[] args ) {
        Stream<String> namesStream = List.of("Adam", "Jarek", "Maciek").stream();
        Stream<String> stream = Arrays.stream(new String[]{"Adam", "Jarek", "Maciek"});
        Stream<String> stream2 = Stream.of("Adam", "Jarek", "Maciek");
    }
}
