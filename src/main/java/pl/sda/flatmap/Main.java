package pl.sda.flatmap;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> lowIntegers = List.of(1, 2, 3);
        List<Integer> highIntegers = List.of(1000, 1001, 1002);

        List<Integer> allIntegers = List.of(lowIntegers, highIntegers).stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(allIntegers);
    }
}
