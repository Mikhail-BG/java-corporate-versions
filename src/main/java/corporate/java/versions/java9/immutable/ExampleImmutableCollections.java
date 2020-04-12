package corporate.java.versions.java9.immutable;

import java.util.List;
import java.util.Map;

public class ExampleImmutableCollections
{
    public static void main(String[] args)
    {
        listOperation();
        mapOperations();
    }

    @SuppressWarnings("all")
    private static void listOperation()
    {
        List<String> stringList = List.of(
                "One",
                "Two",
                "Three"
        );

        System.out.println(stringList);

        try
        {
            stringList.add("Four");
        }
        catch (UnsupportedOperationException exception)
        {
            System.out.println("Can't add to immutable collection");
        }
        finally
        {
            System.out.println(stringList);
        }
    }

    private static void mapOperations()
    {
        Map<String, Integer> integerMap = Map.of(
                "Boolean1", 100,
                "Boolean2", 200,
                "Boolean3", 300);

        Map<String, String> mapOfEntries = Map.ofEntries(
                Map.entry("Str1", "001"),
                Map.entry("Str2", "002"),
                Map.entry("Str3", "003")
        );

        System.out.println(integerMap);
        System.out.println(mapOfEntries);
    }
}
