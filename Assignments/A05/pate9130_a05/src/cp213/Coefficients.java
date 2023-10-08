package cp213;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * DO NOT CHANGE THE CONTENTS OF THIS CLASS.
 *
 * A utility class that defines a list of double coefficients for the terms of a
 * polynomial. The position determines the exponent, i.e. the coefficient at
 * index 0 is for a term with exponent 0, at index 1 for a term with exponent 1,
 * and so on. Parses a comma-delimited string of the form: "c0,c1,c2,c3,..."
 * where each 'c' is a double coefficient.
 *
 * Makes the coefficients available through an iterator, either:
 *
 * for(double coefficient: coefficients) {
 *
 * or
 *
 * while(coefficients.hasNext()) {
 * 	double coefficient = coefficients.next();
 * 	...
 *
 * @author David Brown
 * @version 2022-03-18
 */
public class Coefficients implements Iterable<Double> {

    // Stores the coefficients in a List to easily provide an iterator.
    private final List<Double> coefficients = new ArrayList<>();

    /**
     * Generates a List of coefficients from a comma-delimited string of double
     * values.
     *
     * @param string The comma-delimited string to parse.
     */
    public Coefficients(final String string) {
	final Scanner parser = new Scanner(string);
	parser.useDelimiter(",");

	while (parser.hasNext()) {
	    this.coefficients.add(parser.nextDouble());
	}
	parser.close();
    }

    /**
     * @return the degree of coefficients
     */
    public int degree() {
	return this.coefficients.size() - 1;
    }

    @Override
    public Iterator<Double> iterator() {
	return this.coefficients.iterator();
    }

    /**
     * Returns a string of the format:
     *
     * "[a0, a1, a2, ... , an-1]"
     *
     * where the number of coefficients is n.
     */
    @Override
    public String toString() {
	return Arrays.toString(this.coefficients.toArray());
    }
}
