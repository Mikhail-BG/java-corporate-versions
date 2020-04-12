package corporate.java.versions.java10.orelsethrow;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ExampleOrElseThrow
{
    public static void main(String[] args)
    {
        Map<String, Integer> source = Map.of(
                "A", 1,
                "B", 2,
                "C", 3
        );

        String keyForSearch = "D";

        //Java 8 approach
        try
        {
            String result8 = source.keySet()
                    .stream()
                    .filter(key -> key.equals(keyForSearch))
                    .findFirst().orElse(null);
            if (Objects.isNull(result8))
            {
                throw new NoSuchElementException();
            }
        }
        catch (NoSuchElementException exception)
        {
            System.out.println("Exception java 8: " + exception.getMessage());
        }


        //Java 10 approach
        try
        {
            String result10 = source.keySet()
                    .stream()
                    .filter(key -> key.equals(keyForSearch))
                    .findFirst()
                    .orElseThrow(() -> new MyException("No key: '" + keyForSearch + "' was found."));
        }
        catch (MyException exception)
        {
            System.out.println("Exception java 10: " + exception.getMessage());
        }
    }

    static class MyException extends Exception
    {
        MyException(String msg)
        {
            super(msg);
        }
    }
}
