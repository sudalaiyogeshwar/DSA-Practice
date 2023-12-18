package data.structure;

/**
 * Stack implementation in Java using LinkedLists
 * @param <T>
 */
public class StackLinkedList<T> {

    StackedList top;
    int size;

    private class StackedList {
        public T data;
        public StackedList next;

        public StackedList(T item) {
            this.data = item;
            this.next = null;
        }
    }

    public StackLinkedList() {
        this.top = null;
        this.size = 0;
    }

    /**
     * Adds an item to the top of the stack.
     * @param item The item to be added.
     */
    public void push(T item) {
        StackedList stackedList = new StackedList(item);
        size++;
        stackedList.next = top;
        top = stackedList;
    }

    /**
     * Removes and returns the item at the top of the stack.
     * If the stack is empty, returns null.
     * @return The item at the top of the stack, or null if the stack is empty.
     */
    public T pop() {
        if (top == null) {
            return null;
        }
        size--;
        T data = top.data;
        top = top.next;
        return data;
    }

    /**
     * Retrieves the item at the top of the stack without removing it.
     * If the stack is empty, returns null.
     * @return The item at the top of the stack, or null if the stack is empty.
     */
    public T peek() {
        if (top == null) {
            return null;
        }
        return top.data;
    }

    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Returns the size of the object.
     *
     * @return The size of the object.
     */
    public int size() {
        return size;
    }

}
