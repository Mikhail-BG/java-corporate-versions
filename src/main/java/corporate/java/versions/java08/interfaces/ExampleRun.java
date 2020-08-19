package corporate.java.versions.java08.interfaces;

import corporate.java.versions.java08.lambda.SimpleLamdaExample;

public class ExampleRun
{
    public static void main(String[] args)
    {
//        interfacesExample();
        lamdaComplexExample();
        lambdaInterfaceExample();
    }

    public static void interfacesExample()
    {
        MyInterface.calcAndPrint(100);

        String value = "MARKER";

        MyClassOverrided myClassOverrided = new MyClassOverrided();
        myClassOverrided.modifyAndPrint(value);
        MyClassNotOverrided myClassNotOverrided = new MyClassNotOverrided();
        myClassNotOverrided.modifyAndPrint(value);
    }

    public static void lamdaComplexExample()
    {
        final String toAdd = "ABC";

        SimpleLamdaExample myLambda = (String value) ->
        {
            value += toAdd;

            return value.length();
        };

        System.out.println(myLambda.modify("HELLO"));
    }

    public static void lambdaInterfaceExample()
    {
        final int myConst = 5;

        SimpleLamdaExample myLambda = (String value) -> value.length() + myConst;

        System.out.println(myLambda.modify("HELLO"));
    }
}
