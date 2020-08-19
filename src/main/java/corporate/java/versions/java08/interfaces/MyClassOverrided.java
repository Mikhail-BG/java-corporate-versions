package corporate.java.versions.java08.interfaces;

public class MyClassOverrided implements MyInterface
{
    @Override
    public String modifyAndPrint(String value)
    {
        value += " @class";
        System.out.println(value);

        return value;
    }
}
