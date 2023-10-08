package cp213;

/**
 * Inherited class in simple example of inheritance / polymorphism.
 *
 * @author David Brown
 * @version 2022-02-25
 */
public class IA extends Student {

	private String course = null;
	
	 /**
   * IA constructor
   *
   * @param LastName  IA last name (surname): defined in Person
   * @param FirstName IA first name (given name): defined in Person
   * @param id        IA id number
   * @param Course	course that IA been hired to help 
   */
	public IA(String LastName, String FirstName, String id, String Course) {
		super(LastName, FirstName,id);
		this.course = Course;
		
	}
	
	/**
   * Getter for course.
   *
   * @return this.course
   */
	public String getCourse() {
      return this.course;
  }
	
	/**
   * Creates formatted string version of IA.
   */
	//override the exist method in the previous class
	@Override
  public String toString() {
	return (super.toString() +"\n" + "Course: "+ this.course);
  }

}
