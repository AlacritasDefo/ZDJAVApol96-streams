package pl.sda.sorted;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> notOrderedNumbers = List.of(2,5,3,1);
        List<Integer> sortedNumbers = notOrderedNumbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNumbers);
    }
}
