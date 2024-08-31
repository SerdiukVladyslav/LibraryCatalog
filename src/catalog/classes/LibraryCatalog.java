package catalog.classes;
import catalog.interfaces.LibraryItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LibraryCatalog
{
    private List<LibraryItem> items;

    public LibraryCatalog()
    {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item)
    {
        items.add(item);
    }

    public void removeItemByTitle(String title)
    {
        items.removeIf(item -> item.getTitle().equalsIgnoreCase(title));
    }

    public void printCatalog()
    {
        for (LibraryItem item : items)
        {
            item.printDetails();
            System.out.println("-------------------");
        }
    }

    public LibraryItem findByTitle(String title)
    {
        for (LibraryItem item : items)
        {
            if (item.getTitle().equalsIgnoreCase(title))
            {
                return item;
            }
        }

        return null;
    }

    public List<Book> findByAuthor(String author)
    {
        List<Book> booksByAuthor = new ArrayList<>();

        for (LibraryItem item : items)
        {
            if (item instanceof Book)
            {
                Book book = (Book) item;
                if (book.getAuthor().equalsIgnoreCase(author))
                {
                    booksByAuthor.add(book);
                }
            }
        }

        return booksByAuthor;
    }

    public void addRandomItem()
    {
        Random rand = new Random();
        int itemType = rand.nextInt(3);

        switch (itemType)
        {
            case 0:
                addItem(new Book("Random Book", "Random author", "Fiction", 123));
                break;
            case 1:
                List<String> headlines = List.of("Headline 1", "Headline 2");
                addItem(new Newspaper("Random Newspaper", "2024-08-31", headlines));
                break;
            case 2:
                List<String> books = List.of("Book 1", "Book 2");
                addItem(new Almanac("Random Almanac", books));
                break;
        }
    }

    public void initializeTestData()
    {
        addItem(new Book("Book1", "Author1", "Fiction", 200));
        addItem(new Newspaper("Newspaper1", "2024-01-01", List.of("Headline1", "Headline2")));
        addItem(new Almanac("Almanac1", List.of("Book1", "Book2")));
    }
}
