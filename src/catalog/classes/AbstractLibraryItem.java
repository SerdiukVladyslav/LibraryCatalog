package catalog.classes;
import catalog.interfaces.LibraryItem;

public abstract class AbstractLibraryItem implements LibraryItem
{
    protected String title;

    public AbstractLibraryItem(String title)
    {
        this.title = title;
    }

    @Override
    public String getTitle()
    {
        return title;
    }

    @Override
    public abstract void printDetails();
}
