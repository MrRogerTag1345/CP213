package cp213;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Arrays Lab task methods.
 *
 * @author
 * @version 2022-01-25
 */
public class ArraysTest {

    /**
     * Tests arrays.
     *
     * @param args unused default parameter
     */
    public static void main(final String[] args) {
	System.out.println("Task 1");
	System.out.println(ArraysTest.task1());
	System.out.println("Task 2");
	System.out.println(ArraysTest.task2());
	System.out.println("Task 3");
	System.out.println(ArraysTest.task3());
	System.out.println("Task 4");
	System.out.println(ArraysTest.task4());
	System.out.println("Task 5");
	System.out.println(Arrays.toString(ArraysTest.task5()));
    }

    /**
     * Print the contents of the arrays first and second using a standard for loop.
     *
     * @return true if second contains the same values as first, false otherwise
     */
    public static boolean task1() {
	final int[] first = { 1, 3, 5, 7, 9 };
	final int[] second = first;

	// your code here

	// return true; - or - return false;
	
	System.out.println("Values in first:");

	  for (int k = 0; k < first.length; k++) {
	      System.out.println(first[k]);
	  }
	  System.out.println("Values in second:");

	  for (int l = 0; l < second.length; l++) {
	      System.out.println(second[l]);
	  }
	return first.equals(second);
    }

    /**
     * Double the contents of the array first with a standard for loop.
     *
     * @return true if second contains the same values as first, false otherwise
     */
    public static boolean task2() {
	final int[] first = { 1, 3, 5, 7, 9 };
	final int[] second = first;

	// your code here

	// return true; - or - return false;
	int var_one = 0;
	for (int temp:first) {
		temp = temp * 2;
		first[var_one] = temp;
		var_one += 1;
		}
	System.out.println("Values in first:");

	  for (int k = 0; k < first.length; k++) {
	      System.out.println(first[k]);
	  }
	  System.out.println("Values in second:");

	  for (int l = 0; l < second.length; l++) {
	      System.out.println(second[l]);
	  }

	return first.equals(second);
    }

    /**
     * Double the contents of the array first with an enhanced for loop.
     *
     * @return true if the values in first are permanently changed, false otherwise
     */
    public static boolean task3() {
	final int[] first = { 1, 3, 5, 7, 9 };

	// your code here

	// return true; - or - return false;
	
	final ArrayList<Integer> sec = new ArrayList<>();

	for (int temp:first) {
		temp = temp * 2;
		sec.add(temp);
		}
	for (int k = 0; k < sec.size(); k++) {
	      System.out.println(sec.get(k));
	  }

	return sec.equals(first);
    }

    /**
     * Attempt to assign the array first to a row of the 2D array third.
     *
     * @return true if this is allowed, false otherwise
     */
    public static boolean task4() {
	final int[] first = { 1, 3, 5, 7, 9 };
	final int[][] third = new int [1][];

		// your code here

		// return true; - or - return false;
	third[0] = first;
	return third[0].equals(first);
    }

    /**
     * Assign the values 1 through 10 to an Integer ArrayList.
     *
     * @return the contents of the ArrayList as an Integer[] array.
     */
    public static Integer[] task5() {
	final ArrayList<Integer> values = new ArrayList<>();

	// your code here
	for (int k = 0; k < 10; k++) {
	      values.add(k);
	  }
	final Integer[] r = new Integer[values.size()];
	for (int l = 0; l < values.size(); l++) {
	      r[l] = values.get(l);
	  }
	return r;
	

    }
}
