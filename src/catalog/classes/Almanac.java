package catalog.classes;
import java.util.List;

public class Almanac extends AbstractLibraryItem
{
    private List<String> books;

    public Almanac(String title, List<String> books)
    {
        super(title);
        this.books = books;
    }

    @Override
    public void printDetails()
    {
        System.out.println("Almanac: " + title);
        System.out.println("Books: " + String.join(", ", books));
    }
}
