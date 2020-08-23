package corporate.java.versions.java08.interfaces;

public class ExampleRun
{
    public static void main(String[] args)
    {
        interfacesExample();
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
}
