package _2024_02_06.task2;

public class Category {
    private String name;
    private Item[] items;

    public Category(String name, Item[] items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public Item[] getItems() {
        return items;
    }
}
