package pl.sda.limit;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        List<Integer> limited = numbers.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(limited);
    }
}
