package cp213;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class defines polynomial objects. It contains a collection of Term
 * objects, each of which represents a polynomial monomial. The index in the
 * collection represents the exponent of the Term. Polynomials can be added,
 * subtracted, multiplied, differentiated, and copied. TODO: division.
 *
 * Polynomials can be evaluated for x using Horner's Rule.
 *
 * @author your name
 * @author David Brown
 * @version 2022-03-18
 */
public class Polynomial implements Iterable<Term> {

    // Attributes
    // Stores the coefficients in a List to easily provide an iterator.
    private final List<Term> terms = new ArrayList<>();

    /**
     * Empty constructor.
     */
    public Polynomial() {
    }

    /**
     * Coefficients constructor.
     *
     * @param coefficients List of coefficients.
     * @throws Exception on bad Term construction
     */
    public Polynomial(final Coefficients coefficients) throws Exception {

	// your code here

    }

    /**
     * Copy constructor. The contents of that are unchanged.
     *
     * @param that The Polynomial to copy.
     * @throws Exception Exception on bad Term construction (should never be thrown
     *                   from this constructor assuming that is valid.
     */
    public Polynomial(final Polynomial that) throws Exception {

	// your code here

    }

    /**
     * Private helper method. Removes all Terms with a 0 coefficient after the last
     * non-0 coefficient with index > 0. (All Polynomials must have a least a 0
     * exponent Term.) May be required after construction, addition, or subtraction.
     */
    private void normalize() {

	// your code here

	return;
    }

    /**
     * Adds that to this to produce a new Polynomial. The contents of this and that
     * are unchanged.
     *
     * @param that The Polynomial to add to this.
     * @return A new Polynomial that is the addition of that to this.
     * @throws Exception if an invalid Term is constructed.
     */
    public Polynomial add(final Polynomial that) throws Exception {

	// your code here

	return null;
    }

    /**
     * Adds a copy of term to the end of the polynomial. The Term's exponent n and
     * its index in this must match.
     *
     * @param term The term to add to the end of this.
     * @throws Exception If term's exponent n and its index in this do not match,
     *                   throws exception with message: "exponent and index do not
     *                   match"
     */
    public void addTerm(final Term term) throws Exception {

	// your code here

	return;
    }

    /**
     * @return The degree of this, i.e. the highest exponent amongst the
     *         Polynomial's Terms, which should be the last exponent.
     */
    public int degree() {

	// your code here

	return 0;
    }

    /**
     * @return A new Polynomial target is the differential of this. target contains
     *         only the Term(0,0) if the last Term of this has exponent 0, i.e. is a
     *         constant value. The contents of this are unchanged.
     * @throws Exception if an invalid Term is constructed.
     */
    public Polynomial differentiate() throws Exception {

	// your code here

	return null;
    }

    /**
     * Evaluates this using Horner's Rule.
     *
     * @param x A value for x.
     * @return The sum of the Terms of this for the given value of x.
     */
    public double evaluate(final double x) {

	// your code here

	return 0.0;
    }

    /**
     * @param i The index of the Term to return.
     * @return The Term at index i in this.
     */
    public Term getTerm(final int i) {

	// your code here

	return null;
    }

    @Override
    public Iterator<Term> iterator() {

	// Returns an iterator over the Polynomial Terms.

	return null;
    }

    /**
     * Multiplies that by this to produce a new Polynomial. The contents of this and
     * that are unchanged.
     *
     * @param that The Polynomial to multiply by this.
     * @return A new Polynomial that is the multiplication of that by this.
     * @throws Exception if an invalid Term is constructed.
     */
    public Polynomial multiply(final Polynomial that) throws Exception {

	// your code here

	return null;
    }

    /**
     * Replaces a Term in this with a copy of another Term.
     *
     * @param i    The index of the Term to replace.
     * @param term The new Term.
     * @throws Exception If term's exponent n and its index in this do not match,
     *                   throws exception with message: "exponent and index do not
     *                   match"
     */
    public void setTerm(final int i, final Term term) throws Exception {

	// your code here

	return;
    }

    /**
     * Subtracts that from this to produce a new Polynomial. The contents of this
     * and that are unchanged.
     *
     * @param that The Polynomial to subtract from this.
     * @return A new Polynomial that is the subtraction of that from this.
     * @throws Exception If the exponent and index do not match, or an invalid Term
     *                   is constructed.
     */
    public Polynomial subtract(final Polynomial that) throws Exception {

	// your code here

	return null;
    }

    @Override
    public String toString() {

	// your code here

	return "";
    }

}
