package corporate.java.versions.java14.records;

import java.time.LocalDateTime;

public record Greeting(String greeting, LocalDateTime time)
{
    public String formatMessage()
    {
        return "Said: '" + this.greeting + "' at: " + this.time;
    }
}
