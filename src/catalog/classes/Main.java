package catalog.classes;
import catalog.interfaces.LibraryItem;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        LibraryCatalog catalog = new LibraryCatalog();

        catalog.initializeTestData();

        System.out.println("Full catalog:");
        catalog.printCatalog();

        System.out.println("Searching for 'Book1':");
        LibraryItem item = catalog.findByTitle("Book1");
        if (item != null)
        {
            item.printDetails();
        }
        else
        {
            System.out.println("No book found");
        }

        System.out.println("Searching for books by 'Author1':");
        List<Book> books = catalog.findByAuthor("Author1");
        for (Book book : books) {
            book.printDetails();
        }

        System.out.println("Adding random item...");
        catalog.addRandomItem();

        System.out.println("Full Catalog After Adding Random Item:");
        catalog.printCatalog();

        System.out.println("Removing 'Book1':");
        catalog.removeItemByTitle("Book1");

        System.out.println("Full Catalog After Removing 'Book1':");
        catalog.printCatalog();
    }
}
