package ch3.bag;

public interface MyBag<Item> extends Iterable<Item> {
    void add(Item item);

    int size();
}