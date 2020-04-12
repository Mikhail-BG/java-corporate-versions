package corporate.java.versions.java10.listcopyto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleListCopyTo
{
    @SuppressWarnings("all")
    public static void main(String[] args)
    {
        List<Storage> source = new ArrayList<>();
        source.add(new Storage(100));
        source.add(new Storage(200));
        source.add(new Storage(300));

        System.out.println("source: " + source);

        List<Storage> copy8 = new ArrayList<>(source);
        copy8.add(new Storage(400));

        System.out.println("Java 8 copy8: " + copy8);

        List<Storage> copy10 = List.copyOf(source);
        try
        {
            copy10.add(new Storage(500));
        }
        catch (UnsupportedOperationException exception)
        {
            System.out.println("Can't add to unmodifiable collection.");
        }

        System.out.println("Java 10 copy10: " + copy10);

        List<Storage> copy10Collectors = Arrays.asList(
                new Storage(100),
                new Storage(200),
                new Storage(300))
                .stream()
                .collect(Collectors.toUnmodifiableList());

        try
        {
            copy10Collectors.add(new Storage(500));
        }
        catch (UnsupportedOperationException exception)
        {
            System.out.println("Can't add to unmodifiable collection.");
        }

        System.out.println("Java 10 copy10Collectors: " + copy10Collectors);
    }

    static class Storage
    {
        int value;

        Storage(int value)
        {
            this.value = value;
        }

        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + " : " + this.value;
        }
    }
}
