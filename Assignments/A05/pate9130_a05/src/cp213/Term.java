package cp213;

/**
 * Represents an individual term of a polynomial, containing the coefficient
 * (double) and exponent (integer) of a term. Implements term addition,
 * subtraction, multiplication, negation, and differential. TODO: division
 *
 * The contents of a Term may not be not be changed once constructed, thus there
 * are no setters and methods that manipulate a Term must return a new Term.
 *
 * Some Term methods may throw an exception where two terms are used and their
 * exponents do not match as required.
 *
 * @author your name
 * @author David Brown
 * @version 2022-03-18
 */
public class Term {

    // Attributes.
    private double coefficient = 0;
    private int exponent = 0;

    /**
     * Constructs a new Term given a coefficient and exponent.
     *
     * @param coefficient The Term coefficient.
     * @param exponent    The Term exponent.
     * @throws Exception If exponent is negative, throws Exception with message:
     *                   "negative exponents not allowed"
     */
    public Term(final double coefficient, final int exponent) throws Exception {

	// your code here

    }

    /**
     * Copy constructor. The contents of that are unchanged.
     *
     * @param that The Term object to copy.
     */
    public Term(final Term that) {

	// your code here

    }

    /**
     * Adds two Term objects together and returns the resulting new Term. The two
     * Term objects must have the same exponent value. The contents of this and that
     * are unchanged.
     *
     * @param that The Term object to add to this Term object.
     * @return The Term that results from adding this and that.
     * @throws Exception If the exponents of this and that are not identical, throws
     *                   Exception with message: "exponents do not match"
     */
    public Term add(final Term that) throws Exception {

	// your code here

	return null;
    }

    /**
     * Returns a new Term object that is the differential of this Term. If this
     * exponent is 0, sets the both the coefficient and exponent of the new Term to
     * 0. The contents of this are unchanged.
     *
     * @return The differential of this, or Term(0, 0) if the differentiation
     *         reduces this exponent to less than zero.
     * @throws Exception from Term constructor
     */
    public Term differential() throws Exception {

	// your code here

	return null;
    }

    /**
     * Returns whether this Term object and another Term object are the same object,
     * or contain equivalent attributes.
     *
     * @param that The Term object to compare this Term object to.
     * @return true if this and that are the same object or contain equivalent
     *         attributes, false otherwise.
     */
    public boolean equals(final Term that) {

	// your code here

	return false;
    }

    /**
     * @return this coefficient.
     */
    public double getCoefficient() {

	// your code here

	return 0.0;
    }

    /**
     * @return this exponent.
     */
    public int getExponent() {

	// your code here

	return 0;
    }

    /**
     * Multiplies this Term with another Term and returns the result in a new Term.
     * The contents of this and that are unchanged.
     *
     * @param that The other Term to multiply this Term with.
     * @return The result of multiplying this Term with that Term.
     * @throws Exception from Term constructor
     */
    public Term multiply(final Term that) throws Exception {

	// your code here

	return null;
    }

    /**
     * Negates this Term, i.e. the coefficient is multiplied by -1. The contents of
     * this are unchanged.
     *
     * @return a negated version of the current Term.
     * @throws Exception from Term constructor
     */
    public Term negate() throws Exception {

	// your code here

	return null;
    }

    /**
     * Subtracts another Term from this Term. The two Term objects must have the
     * same exponent value. The contents of this and that are unchanged.
     *
     * @param that The Term to subtract from this Term.
     * @return The new Term resulting from subtracting that Term from this Term.
     * @throws Exception If the exponents of this and that are not identical, throws
     *                   Exception with message: "exponents do not match"
     */
    public Term subtract(final Term that) throws Exception {

	// your code here

	return null;
    }

    /**
     * Returns a string of format:
     *
     * ax^n
     *
     * where a is the coefficient, and n is the exponent.
     *
     * Returns "x^n" if a == 1, "ax" if n == 1, "a" if n == 0, "0" if a == 0.
     */
    @Override
    public String toString() {

	// your code here

	return "";
    }

}
