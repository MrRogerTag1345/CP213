package cp213;

/**
 * DO NOT CHANGE THE CONTENTS OF THIS CLASS.
 *
 * The individual node of a linked structure that stores <code>T</code> objects.
 * This is a singly linked node. The node link can be updated, but not the node
 * element, in order to avoid copying or moving values between nodes. Data
 * structures must be updated by moving nodes, not by copying or moving element.
 *
 * @author David Brown
 * @version 2022-02-06
 */
public final class SingleNode<T> {

    /**
     * The generic element.
     */
    private T element = null;
    /**
     * Link to the next Node.
     */
    private SingleNode<T> next = null;

    /**
     * Creates a new node with element and link to next node. Not copy safe as it
     * accepts a reference to the element rather than a copy of the element.
     *
     * @param element the element to store in the node.
     * @param next  the next node to link to.
     */
    public SingleNode(final T element, final SingleNode<T> next) {
	this.element = element;
	this.next = next;
    }

    /**
     * Returns the node element. Not copy safe as it returns a reference to the element,
     * not a copy of the element.
     *
     * @return The element portion of the node.
     */
    public T getElement() {
	return this.element;
    }

    /**
     * Returns the next node in the linked structure.
     *
     * @return The node that follows this node.
     */
    public SingleNode<T> getNext() {
	return this.next;
    }

    /**
     * Links this node to the next node.
     *
     * @param next The new node to link to.
     */
    public void setNext(final SingleNode<T> next) {
	this.next = next;
    }
}
