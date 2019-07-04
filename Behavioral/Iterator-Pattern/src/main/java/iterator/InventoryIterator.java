package iterator;

public interface InventoryIterator {
    public boolean isDone();
    public void next();
    public Item current();
}
