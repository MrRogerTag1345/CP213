package cp213;

/**
 * A single linked priority queue structure of <code>Node T</code> objects.
 * These data objects must be Comparable - i.e. they must provide the compareTo
 * method. Only the <code>T</code> data contained in the priority queue is
 * visible through the standard priority queue methods. Extends the
 * <code>SingleLink</code> class.
 *
 * @author David Brown
 * @version 2022-02-06
 * @param <T> data type for base data structure.
 */
public class SinglePriorityQueue<T extends Comparable<T>> extends SingleLink<T> {

    /**
     * Combines the contents of the left and right SinglePriorityQueues into the
     * current SinglePriorityQueue. Moves nodes only - does not move value or call
     * the high-level methods insert or remove. left and right SinglePriorityQueues
     * are empty when done. Nodes are moved alternately from left and right to this
     * SinglePriorityQueue. When finished all nodes must be in priority order from
     * front to rear.
     *
     * Do not use the SinglePriorityQueue insert and remove methods.
     *
     * Do not assume that both right and left priority queues are of the same
     * length.
     *
     * @param left  The first SinglePriorityQueue to extract nodes from.
     * @param right The second SinglePriorityQueue to extract nodes from.
     */
    public void combine(final SinglePriorityQueue<T> left, final SinglePriorityQueue<T> right) {
	assert this.front == null : "May combine into an empty Priority Queue only";

	// your code here
	while (left.length > 0) {
		this.moveFrontToRear(left);
		}
		while(right.length > 0) {
		this.moveFrontToRear(right);
		}
		return;
		}

    /**
     * Adds value to the SinglePriorityQueue. Data is stored in priority order, with
     * highest priority value at the front of the SinglePriorityQueue, and lowest at
     * the rear. Priority is determined by simple comparison - lower values have
     * higher priority. For example, 1 has a higher priority than 2 because 1 is a
     * lower value than 2. (Think of the phrase, "We're number one!" as an
     * indication of priority.)
     *
     * When inserting value to the priority queue, the queue must remain sorted.
     * Hence you need to find the proper location of inserting value. use the head
     * pointer to go through the queue. e.g., use SingleNode&lt;T&gt; current =
     * this.head;
     *
     * use current = current.getNext(); to traverse the queue.
     *
     * To get access to the value inside a node of queue use current.getValue().
     *
     * @param data value to insert in sorted order in priority queue.
     */
    public void insert(final T data) {

    	SingleNode<T> last = null;
    	SingleNode<T> curr = this.front;
    	SingleNode<T> n_node = new SingleNode<T>(data, null);
    	if(this.front == null) {
    	this.rear = n_node;
    	this.front = n_node;
    	}else if((int) data > (int) this.rear.getElement()) {
    	this.rear.setNext(n_node);
    	this.rear = n_node;
    	}else if((int) data < (int) this.front.getElement()) {
    	SingleNode<T> newFront = new SingleNode<T> (data, this.front);
    	this.front = newFront;
    	}else {
    	while(curr != null && ((int) data >= (int) curr.getElement())) {
    		last = curr;
    	curr = curr.getNext();
    	}
    	n_node.setNext(curr);
    	last.setNext(n_node);
    	}
    	this.length++;
    	return;
    	}

    /**
     * Returns the highest priority value in the SinglePriorityQueue. Decrements the
     * count.
     *
     * @return the highest priority value currently in the SinglePriorityQueue.
     */
    public T remove() {

    	T value = null;
    	if(this.front != null) {
    	value = this.front.getElement();
    	this.front = this.front.getNext();
    	}
    	this.length--;
    	return value;
    	}

    /**
     * Splits the contents of this SinglePriorityQueue into the higher and lower
     * SinglePriorityQueue. Moves nodes only - does not move value or call the
     * high-level methods insert or remove. this SinglePriorityQueue is empty when
     * done. Nodes with priority value higher than key are moved to the
     * SinglePriorityQueue higher. Nodes with a priority value lower than or equal
     * to key are moved to the SinglePriorityQueue lower.
     *
     * Do not use the SinglePriorityQueue insert and remove methods.
     *
     * @param key    value to compare against node values in SinglePriorityQueue
     * @param higher an initially empty SinglePriorityQueue queue that ends up with
     *               all values with priority higher than key.
     * @param lower  an initially empty SinglePriorityQueue queue that ends up with
     *               all values with priority lower than or equal to key.
     */
    public void splitByKey(final T key, final SinglePriorityQueue<T> higher, final SinglePriorityQueue<T> lower) {

    	while(!this.isEmpty()) {
    		SingleNode<T> curr = this.front;
    		if((int) curr.getElement() < (int)key) {
    		higher.moveFrontToRear(this);
    		}else if((int)curr.getElement() >= (int)key) {
    		lower.moveFrontToRear(this);
    		}
    		}return;
    }
}
