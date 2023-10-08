package cp213;

import java.util.ArrayList;

/**
 * A single linked list structure of <code>Node T</code> objects. These data
 * objects must be Comparable - i.e. they must provide the compareTo method.
 * Only the <code>T</code> value contained in the priority queue is visible
 * through the standard priority queue methods. Extends the
 * <code>SingleLink</code> class.
 *
 * @author David Brown
 * @version 2022-02-06
 * @param <T> this SingleList data type.
 */
public class SingleList<T extends Comparable<T>> extends SingleLink<T> {

    /**
     * Searches for the first occurrence of key in this SingleList. Private helper
     * methods - used only by other ADT methods.
     *
     * @param key The value to look for.
     * @return A pointer to the node previous to the node containing key.
     */
    private SingleNode<T> linearSearch(final T key) {

    	 SingleNode<T> last = null;
    	 SingleNode<T> curr = this.front;

    	 while (curr != null && curr.getElement().compareTo(key) != 0) {
    		 last = curr;
    		 curr = curr.getNext();
    	 }
    	 return last;
    	 }


    /**
     * Appends data to the end of this SingleList.
     *
     * @param data The value to append.
     */
    public void append(final T data) {

    	 SingleNode<T> one = new SingleNode<T>(data, null);
    	 if(this.front == null) {
    		 this.front = one;
    		 this.rear = one;
    	 }else {
    		 this.rear.setNext(one);
    		 this.rear = one;
    	 }
    	return;
    	 }


    /**
     * Removes duplicates from this SingleList. The list contains one and only one
     * of each value formerly present in this SingleList. The first occurrence of
     * each value is preserved.
     */
    public void clean() {

    	 SingleNode<T> curr = this.front;
    	 SingleNode<T> last = null;
    	 ArrayList<T> now = new ArrayList<>();

    	 while (curr != null) {
    		 for(T value: this) {
    			 if(!now.contains(value)) {
    				 now.add(value);
    				 last = curr;
    			 }else {
    				 last.setNext(curr.getNext());
    				 --this.length;
    			 }
    		 }curr = curr.getNext();
    	 	}
    	 	return;
    	 }


    /**
     * Combines contents of two lists into a third. Values are alternated from the
     * origin lists into this SingleList. The origin lists are empty when finished.
     * NOTE: data must not be moved, only nodes.
     *
     * @param left  The first list to combine with this SingleList.
     * @param right The second list to combine with this SingleList.
     */
    public void combine(final SingleList<T> left, final SingleList<T> right) {

	// your code here

	return;
    }

    /**
     * Determines if this SingleList contains key.
     *
     * @param key The key value to look for.
     * @return true if key is in this SingleList, false otherwise.
     */
    public boolean contains(final T key) {

    	 boolean contains = false;
    	 SingleNode<T> curr = this.front;

    	 while (curr != null) {
    		 if(curr.getElement().compareTo(key) == 0) {
    			 contains = true;

    		 }
    		 curr = curr.getNext();
    	 }return contains;
    }


    /**
     * Finds the number of times key appears in list.
     *
     * @param key The value to look for.
     * @return The number of times key appears in this SingleList.
     */
    public int count(final T key) {

    	 int count = 0;
    	 SingleNode<T> curr = this.front;

    	 while(curr != null) {
    		 if(curr.getElement().compareTo(key) == 0) {
    			 ++count;
    		 }
    		 curr = curr.getNext();
    	}
    return count;
    }


    /**
     * Finds and returns the value in list that matches key.
     *
     * @param key The value to search for.
     * @return The value that matches key, null otherwise.
     */
    public T find(final T key) {

    	 T value = null;
    	 if(this.length >0) {
    		 SingleNode<T> prev = this.linearSearch(key);
    	 if(prev == null) {
    		 value = this.front.getElement();
    	 }
    	 else if(prev.getNext() != null) {
    		 value = prev.getNext().getElement();
    	 }
    }
    return value;
    }


    /**
     * Get the nth item in this SingleList.
     *
     * @param n The index of the item to return.
     * @return The nth item in this SingleList.
     * @throws ArrayIndexOutOfBoundsException if n is not a valid index.
     */
    public T get(final int n) throws ArrayIndexOutOfBoundsException {

    	 T value = null;
	   	 SingleNode<T> curr = this.front;
	   	 int count = 0;
	   	 if(n <= this.length) {
	   		 while (curr != null) {
	   			 if(count == n) {
	   			 value = curr.getElement();
	   			 }
	   			 ++count;
	   			 curr = curr.getNext(); }
	   			 }
	
	
	   			return value;
	   			 }

    /**
     * Determines whether two lists are identical.
     *
     * @param source The list to compare against this SingleList.
     * @return true if this SingleList contains the same values in the same order as
     *         source, false otherwise.
     */
    public boolean identical(final SingleList<T> source) {

    	SingleNode<T> sourceC = source.front;
    	 SingleNode<T> curr = this.front;
    	 SingleNode<T> count = this.front;

    	 int len = 0;
    	 boolean var_one = true;
    	 while(count != null) {
    	 len++;
    	 count = count.getNext();
    	 }
    	 for(int i = 0; i < len; i++) {
    	 if((int)sourceC.getElement() != (int)curr.getElement()) {
    		 var_one = false;
    	 break;
    	 }
    	 }
    	return var_one;
    	 }


    /**
     * Finds the first location of a value by key in this SingleList.
     *
     * @param key The value to search for.
     * @return The index of key in this SingleList, -1 otherwise.
     */
    public int index(final T key) {

    	int index = 0;
    	 SingleNode<T> curr = this.front;

    	 while (curr!= null) {
    	 if(curr.getElement().compareTo(key) != 0) {
    	 curr = curr.getNext(); 
    	 ++index;
    	 }else {
    	 break;
    	 }
    	 }
    	 if(curr == null) {
    	 index = -1;
    	 }
    	return index;
    	 }

    /**
     * Inserts value into this SingleList at index i. If i greater than the length
     * of this SingleList, append data to the end of this SingleList.
     *
     * @param i     The index to insert the new data at.
     * @param data The new value to insert into this SingleList.
     */
    public void insert(int i, final T data) {

    	if(i<0) {
    		 i = this.length + i;
    		 }
    		 if (i >this.length) {
    		 this.append(data);
    		 }else if(i ==0) {
    		 this.prepend(data);
    		 }
    		 else {
    		 int count = 0;
    		 SingleNode<T> curr = this.front;
    		 SingleNode<T> prev = null;
    		 while(i > count && curr != null) {
    		 prev = curr;
    		 curr = curr.getNext();
    		 ++count;
    		 }SingleNode<T> node = new SingleNode<T>(data,curr);
    		 prev.setNext(node);
    		 this.length++;
    		 }



    		 return;
    		 }


    /**
     * Creates an intersection of two other SingleLists into this SingleList. Copies
     * data to this SingleList. left and right SingleLists are unchanged. Values
     * from left are copied in order first, then values from right are copied in
     * order.
     *
     * @param left  The first SingleList to create an intersection from.
     * @param right The second SingleList to create an intersection from.
     */
    public void intersection(final SingleList<T> left, final SingleList<T> right) {

    	SingleNode<T> curr = left.front;
    	 while(curr!= null){
    	 T x = curr.getElement();
    	 if (right.contains(x)) {
    	 this.append(x);
    	 }
    	 curr = curr.getNext();
    	 }
    	 return;
    	 }

    /**
     * Finds the maximum value in this SingleList.
     *
     * @return The maximum value.
     */
    public T max() {
    	SingleNode<T> curr = this.front;
        T var_value = curr.getElement();
            
        while (curr != null) {
            if (curr.getElement().compareTo(var_value) > 0) {
            	var_value = curr.getElement();
            	}
            curr = curr.getNext();
            }
        return var_value;

        }



    /**
     * Finds the minimum value in this SingleList.
     *
     * @return The minimum value.
     */
    public T min() {

    	SingleNode<T> curr = this.front;
        T var_minimum_value = curr.getElement();
            
        while (curr != null) {
          	if (curr.getElement().compareTo(var_minimum_value) < 0) {
          		var_minimum_value = curr.getElement();
                }
            curr = curr.getNext();
        }
        return var_minimum_value;
            }    

    /**
     * Inserts value into the front of this SingleList.
     *
     * @param data The value to insert into the front of this SingleList.
     */
    public void prepend(final T data) {

    	SingleNode<T> curr = this.front;
    	 SingleNode<T> newNode = new SingleNode<T>(data,curr);
    	 this.front = newNode;
    	 this.front.setNext(curr);
    	 this.length++;

    }

    /**
     * Finds, removes, and returns the value in this SingleList that matches key.
     *
     * @param key The value to search for.
     * @return The value matching key, null otherwise.
     */
    public T remove(final T key) {

    	T value;
        SingleNode<T> prev = this.linearSearch(key);
        SingleNode<T> curr = prev.getNext();
            
        if (curr == null){
            value = null;
        }
        else{
            value = curr.getElement();
            if(prev.getElement() == null) {
            	this.front = curr.getNext();
            	if (curr.getNext() == null) {
            		this.rear = curr.getNext();
            	}
            }
            else {
            	prev.setNext(curr.getNext());
            	if (curr.getNext() == null) {
            		this.rear = prev;
            		}

            	}
            	
            }
            return value;
            
        }


    /**
     * Removes the value at the front of this SingleList.
     *
     * @return The value at the front of this SingleList.
     */
    public T removeFront() {

    	T value = null;
    	 if(this.front != null) {
    	 value = this.front.getElement();
    	 this.front = this.front.getNext();

    	 }
    	 this.length--;
    	 return value;
    	 }


    /**
     * Finds and removes all values in this SingleList that match key.
     *
     * @param key The value to search for.
     */
    public void removeMany(final T key) {

    	SingleNode<T> temp = this.front, prev = null;
    	 while(temp != null && temp.getElement() == key) {
    	 this.front=temp.getNext();
    	 temp = this.front;
    	 }
    	 while(temp != null) {
    	 while(temp!= null && temp.getElement() != key) {
    	 prev = temp;
    	 temp = temp.getNext();

    	 }
    	 temp = prev.getNext();
    	 }return;
    	 }


    /**
     * Reverses the order of the values in this SingleList.
     */
    public void reverse() {

    	SingleNode<T> frontval = null;
        SingleNode<T> num = null;

        while (this.front != null) {
        	num = this.front.getNext();
        	this.front.setNext(frontval);
        	frontval = this.front;
        	this.front = num;
        }
        this.front = frontval;	

    	return;
        }



    /**
     * Splits the contents of this SingleList into the left and right SingleLists.
     * Moves nodes only - does not move value or call the high-level methods insert
     * or remove. this SingleList is empty when done. The first half of this
     * SingleList is moved to left, and the last half of this SingleList is moved to
     * right. If the resulting lengths are not the same, left should have one more
     * item than right. Order is preserved.
     *
     * @param left  The first SingleList to move nodes to.
     * @param right The second SingleList to move nodes to.
     */
    public void split(final SingleList<T> left, final SingleList<T> right) {

    	int count = 0;
        int val = this.length;
       	double num = Math.floorDiv(val, 2);
       	System.out.println(val);
       	System.out.println(num);
        	
        if (val % 2 == 0) {
            while (count != num) {
                left.moveFrontToRear(this);
               	count++;
            }
            while(count != val) {
                right.moveFrontToRear(this);
                count++;
            }
        }
        else {
            while (count != (num+1)) {
                left.moveFrontToRear(this);
               	count++;
            }
            count++;
            while (count != (val)) {
                right.moveFrontToRear(this);
               	count++;
            }
        }
                	
        	return;
            }	


    /**
     * Splits the contents of this SingleList into the left and right SingleLists.
     * Moves nodes only - does not move value or call the high-level methods insert
     * or remove. this SingleList is empty when done. Nodes are moved alternately
     * from this SingleList to left and right. Order is preserved.
     *
     * @param left  The first SingleList to move nodes to.
     * @param right The second SingleList to move nodes to.
     */
    public void splitAlternate(final SingleList<T> left, final SingleList<T> right) {

    	boolean check = true;
    	
        while (this.front != null) {
        	if (check == true) {
        		left.moveFrontToRear(this);
        		check = false;
        	}
        	else {
        		right.moveFrontToRear(this);
        		check = true;
        	}
        }

        	return;
            }



    /**
     * Creates a union of two other SingleLists into this SingleList. Copies value
     * to this list. left and right SingleLists are unchanged. Values from left are
     * copied in order first, then values from right are copied in order.
     *
     * @param left  The first SingleList to create a union from.
     * @param right The second SingleList to create a union from.
     */
    public void union(final SingleList<T> left, final SingleList<T> right) {

    	SingleNode<T> lNode = left.front;
    	 SingleNode<T> rNode = right.front;

    	 while (lNode != null) {
    	 T x = lNode.getElement();
    	 this.append(x);
    	 lNode = lNode.getNext();
    	 }
    	 while (rNode != null) {
    	 T x = rNode.getElement();
    	 if (!this.contains(x)) {
    	 this.append(x);
    	 }
    	 rNode = rNode.getNext();
    	 }
    	 return;
    	 }

}
