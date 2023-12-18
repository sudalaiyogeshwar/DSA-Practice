package data.structure;

/**
 * Stack implementation in Java using Arrays
 * @param <T>
 */
public class Stack<T> {

    int top = -1;
    T[] stack = (T[]) new Object[10];

    /**
     * Pushes an item onto the stack.
     *
     * @param item The item to be pushed onto the stack.
     */
    public void push(T item) {
        stack[++top] = item;
    }

    /**
     * Removes and returns the element at the top of the stack.
     * If the stack is empty, returns null.
     *
     * @return the element at the top of the stack, or null if the stack is empty
     */
    public T pop() {
        if (top == -1) {
            return null;
        }
        return stack[top--];
    }

    /**
     * Returns the element at the top of the stack without removing it.
     * If the stack is empty, returns null.
     *
     * @return the element at the top of the stack, or null if the stack is empty
     */
    public T peek() {
        if (top == -1) {
            return null;
        }
        return stack[top];
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Returns the number of elements in the stack.
     *
     * @return The number of elements in the stack.
     */
    public int size() {
        return top + 1;
    }

}