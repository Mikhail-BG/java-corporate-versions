package corporate.java.versions.java08.interfaces;

public interface MyInterface
{
    default String modifyAndPrint(String value)
    {
        value += " @interface";
        System.out.println(value);

        return value;
    }

    static int calcAndPrint(int value)
    {
        value += 100;
        System.out.println("@interface: " + value);

        return value;
    }
}
