package corporate.java.versions.java13.patternmatching;

import java.util.ArrayList;

public class ExamplePatternMatching
{
    public static void main(String[] args)
    {
        processInstance(new Object());
        processInstance(new ArrayList<String>());
        processInstance("OK");
    }

    private static void processInstance(Object str)
    {
        String result;
        if (str instanceof String)
        {
            result = "String: '" + str + "', length: " + ((String) str).length();
        }
        else
        {
            result = "Not string, "  + str.getClass().getSimpleName();
        }

        System.out.println(result);
    }
}
