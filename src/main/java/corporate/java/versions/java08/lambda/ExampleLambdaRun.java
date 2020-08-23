package corporate.java.versions.java08.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class ExampleLambdaRun
{

    public static void main(String[] args)
    {
        System.out.println("Sorted strings by length: " +
                Arrays.toString(lambdaWithString("ccc", "ccc", "cccc", "cc", "c")));

        System.out.println("Single-line lambda example, modified int value: " + lambdaSingleLineExample());

        System.out.println("Multi-line lambda example, modified int value: " + lambdaMultiLineExample());
    }

    public static String[] lambdaWithString(String... strs)
    {

        // Here was created comparator based on String method .length and Comparator.compareInt that call
        // Integer.compare.
        // Bottom lambda expression for comparator equals to single-line expression
        // Lambda replaces anonymous class
        // Comparator<String> comparator = new Comparator<String>()
        // {
        //    @Override
        //    public int compare(String o1, String o2)
        //    {
        //        return Integer.compare(o1.length(), o2.length());
        //    }
        // };
        Comparator<String> comparator = Comparator.comparingInt(String::length);

        Arrays.sort(strs, comparator);

        return strs;
    }

    public static int lambdaSingleLineExample()
    {
        final int myConst = 5;

        SimpleLamdaExample myLambda = (String value) -> value.length() + myConst;

        return myLambda.modify("HELLO");
    }

    public static int lambdaMultiLineExample()
    {
        final String toAdd = "ABC";

        SimpleLamdaExample myLambda = (String value) ->
        {
            value += toAdd;

            return value.length();
        };

        return myLambda.modify("HELLO");
    }
}
