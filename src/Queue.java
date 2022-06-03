public class Queue {
    private final static int INITIAL_CAPACITY = 5;


    private CustomCollection collection = new CustomCollection(INITIAL_CAPACITY);

    public void enqueue(Integer value) {
        collection.add(value);
    }

    public Integer dequeue() {
        return collection.delete(0);
    }

    public int getQuantity() {
        return collection.getNumValues();
    }
}
