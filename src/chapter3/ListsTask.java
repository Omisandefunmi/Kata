package chapter3;

import java.util.List;
import java.util.stream.Collectors;

public class ListsTask {
    public static void main(String[] args) {

        List<String> list = List.of("John", "James", "Mark","Joanna","Henry");
        List<String> result = list.stream()
                .filter(item -> item.startsWith("J"))
                .toList();
        System.out.println(result);

    }

}
