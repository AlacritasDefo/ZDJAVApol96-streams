package pl.sda.collect;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> filteredNumbers = List.of(1, 2, 3, 4, 5).stream()
                .filter(element -> element > 2)
                .collect(Collectors.toList());

        System.out.println(filteredNumbers);
    }
}
