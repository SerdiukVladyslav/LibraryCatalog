package catalog.classes;

public class Book extends AbstractLibraryItem
{
    private String author;
    private String genre;
    private int pages;

    public Book(String title, String author, String genre, int pages)
    {
        super(title);
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    public String getAuthor()
    {
        return author;
    }

    @Override
    public void printDetails()
    {
        System.out.println("Book: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Pages: " + pages);
    }
}
