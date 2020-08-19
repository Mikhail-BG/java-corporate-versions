package corporate.java.versions.java08.stream;

import java.util.List;

public class ExampleStream
{
    public static void main(String[] args)
    {
        List<String> strs = List.of(
                "A",
                "B",
                "C",
                "D"
        );

        String filtered = strs.stream()

                // intermediate (lazy) operators
                .map(str -> str += "@")
                .filter(str -> str.contains("A"))

                // terminal (eager) operator (only one)
                .findFirst()
                .orElse(null);

        System.out.println(filtered);
    }
}
