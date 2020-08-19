package corporate.java.versions.java08.foreach;

import java.util.ArrayList;
import java.util.List;

public class ExampleForEach
{
    public static void main(String[] args)
    {
        List<String> strs = new ArrayList<>();
        strs.add("AA");
        strs.add("BB");
        strs.add("CC");
        strs.add("DD");

        strs.forEach(str -> {
            String toPrint = str.substring(1);
            System.out.println(toPrint);
        });
    }
}
