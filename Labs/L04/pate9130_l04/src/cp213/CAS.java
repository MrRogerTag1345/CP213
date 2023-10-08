package cp213;

/**
 * Inherited class in simple example of inheritance / polymorphism.
 *
 * @author
 * @version 2022-02-25
 */
public class CAS extends Professor {
	
	private String term = null;

	/**
     * @param LastName
     *            Staff last name (surname): defined in Person
     * @param FirstName
     *            Staff first name (given name): defined in Person
     * @param Department
     *            Staff department
     * @param Term
     * 			  Term that staff is in, last 2 digits represent different terms.
     * 			  "01" for Winter, "05" for Spring, "09" for Fall
     */
	public CAS(String LastName, String FirstName, String Department, String Term) {
		super(LastName, FirstName, Department);
		this.term = Term;
		
	}
	
	/**
     * Getter for term.
     *
     * @return this.term
     */
	public String getTerm() {
        return this.term;
    }
	
	/**
     * Creates formatted string version of CSA.
     */
	//override the exist method in the previous class
	@Override
	public String toString() {
	return (super.toString() +"\n" + "Term: "+ this.term);
	}

}
