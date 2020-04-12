package corporate.java.versions.java12.rawstringliterals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class ExampleRawStringLiterals
{
    public static void main(String[] args)
    {
        writeToFile(LocalDateTime.now().toString());
    }

    private static void writeToFile(String msg)
    {
        Path path = Paths.get("./target/index.html");
        String htmlStr = generateHtml(msg);
        byte[] strToBytes = htmlStr.getBytes();

        try
        {
            Files.write(path, strToBytes);
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }

    }

    private static String generateHtml(String msg)
    {
        String html = """
                <HTML>
                  <BODY>
                    <H1>"Saved time: %s"</H1>
                  </BODY>
                </HTML>
                """;

        return String.format(html, msg);
    }
}
