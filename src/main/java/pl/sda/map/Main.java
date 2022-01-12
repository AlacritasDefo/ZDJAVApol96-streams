package pl.sda.map;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("1", "2", "3");
        List<Integer> numbers = strings.stream()
                .map(Integer::parseInt)// mapujemy stringi na inty
                .collect(Collectors.toList());
    }
}
