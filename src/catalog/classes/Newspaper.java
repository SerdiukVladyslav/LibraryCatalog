package catalog.classes;
import java.util.List;

public class Newspaper extends AbstractLibraryItem
{
    private String date;
    private List<String> headlines;

    public Newspaper(String title, String date, List<String> headlines)
    {
        super(title);
        this.date = date;
        this.headlines = headlines;
    }

    @Override
    public void printDetails()
    {
        System.out.println("Newspaper: " + title);
        System.out.println("Date: " + date);
        System.out.println("Headlines: " + String.join(", ", headlines));
    }
}
