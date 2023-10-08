package cp213;

/**
 * Stores a element and an occurrence count for that element.
 *
 * @author David Brown
 * @version 2022-03-08
 */
public class CountedElement<T extends Comparable<T>> {

    // Attributes.
    private int count = 0; // element count
    private T element = null; // element

    /**
     * Copy constructor.
     *
     * @param source Another CountedCharacter object.
     */
    public CountedElement(final CountedElement<T> source) {
	this.element = source.element;
	this.count = source.count;
    }

    /**
     * Constructor for key version of object. (element count defaults to 0)
     *
     * @param element The element to be counted.
     */
    public CountedElement(final T element) {
	this.element = element;
    }

    /**
     * Constructor.
     *
     * @param element  The element to be counted.
     * @param count The element count.
     */
    public CountedElement(final T element, final int count) {
	this.element = element;
	this.count = count;
    }

    /**
     * Comparison method.
     *
     * @param target Object to compare against.
     * @return less than 0 if this element comes before target element, greater than 0 if
     *         this element comes after target element, 0 if the values are the same.
     */
    public int compareTo(final CountedElement<T> target) {
	return this.element.compareTo(target.element);
    }

    /**
     * Decrements the element count.
     */
    public void decrementCount() {
	this.count--;
    }

    /**
     * Returns this element count.
     *
     * @return this element count.
     */
    public int getCount() {
	return this.count;
    }

    /**
     * Returns this element.
     *
     * @return this element.
     */
    public T getItem() {
	return this.element;
    }

    /**
     * Increments the element count.
     */
    public void incrementCount() {
	this.count++;
    }

    /**
     * Sets the element count.
     *
     * @param count the new element count.
     */
    public void setCount(final int count) {
	this.count = count;
	return;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "{" + this.element + ": " + this.count + "}";
    }

}
