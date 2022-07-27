package chapterSeventeen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FileStream {
    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile("\\s+");
        Map<String, Long> map = Files.lines(Paths.get("FileStream.txt"))
                .flatMap(pattern::splitAsStream)
                .collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting()));
    }
}
