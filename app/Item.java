package app;

interface ItemInterface {
    public String getName();
}

public class Item implements ItemInterface{
    private String name;
    public Item(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

}

