/**
 * @author moises.alonso
 *
 */
public class StackHandmade<T> implements IStack<T> {

    private Node<T> top;
    int count;/**
 * @author MAAG
 *
 */
public class Node<T> {
	private T value;
	private Node<T> next;

	public Node(T value) {
		this.setValue(value);
	}
	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}
	/**
	 * @return the next
	 */
	public Node<T> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}


}

    public StackHandmade() {
        top = null;
        count = 0;
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count() == 0;
    }

    @Override
    public void push(T value) {
        Node<T> newNode = new Node<T>(value);

        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }

        count++;
    }

    @Override
    public T pull() {

        if (isEmpty()) {
            return null;
        } else {
            Node<T> temp = top;
            top = top.getNext();
            count--;

            return temp.getValue();
        }

    }

    @Override
    public T peek() {

        if (isEmpty()) {
            return null;
        } else {
            return top.getValue();
        }

    }

}
