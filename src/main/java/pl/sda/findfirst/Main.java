package pl.sda.findfirst;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List.of(4,5,6,2).stream()
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

    }
}
