package pl.sda.foreach;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List.of(1, 2, 3, 4, 5).stream()
                .forEach(System.out::println);
    }
}
