package corporate.java.versions.java09.var;

import java.util.ArrayList;

public class ExampleUseVar
{
    public static void main(String[] args)
    {
        var val1 = 5;
        var val2 = 'c';
        var val3 = "Word";

        var val4 = new ArrayList<>();
        val4.add("001");

        val4.add(new MyClass(5));
        val4.add(true);

        //Bad approach to use new with var
        var val5 = new MyClass(5);

        val4.add(val5);

        printValue("val1", val1);
        printValue("val2", val2);
        printValue("val3", val3);
        printValue("val4", val4);
        printValue("val5", val5);
    }

    private static void printValue(String valueName, Object value)
    {
        String stringBuffer = valueName +
                ": " +
                "instance of: " +
                value.getClass().getSimpleName() +
                ", " +
                value +
                "\n";
        System.out.print(stringBuffer);
    }

    static class MyClass
    {
        int value;

        MyClass(int value)
        {
            this.value = value;
        }

        @Override
        public String toString()
        {
            return this.getClass().getSimpleName() + ", value = " + this.value;
        }
    }
}
