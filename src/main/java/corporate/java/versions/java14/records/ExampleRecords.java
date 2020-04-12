package corporate.java.versions.java14.records;

import java.time.LocalDateTime;

public class ExampleRecords
{
    public static void main(String[] args)
    {
        Greeting greeting1 = new Greeting("Hello", LocalDateTime.now());
        System.out.println(greeting1.formatMessage());

        Greeting greeting2 = new Greeting("Bye", LocalDateTime.now());
        System.out.println(greeting2.formatMessage());
    }
}
