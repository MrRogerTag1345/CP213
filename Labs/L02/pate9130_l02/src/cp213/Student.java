package cp213;

import java.time.LocalDate;

/**
 * Student class definition.
 *
 * @author Chetas Patel
 * @version 2022-01-17
 */
public class Student implements Comparable<Student> {

    // Attributes
    private LocalDate birthDate = null;
    private String forename = "";
    private int id = 0;
    private String surname = "";

    /**
     * Instantiates a Student object.
     *
     * @param id        student ID number
     * @param surname   student surname
     * @param forename  name of forename
     * @param birthDate birthDate in 'YYYY-MM-DD' format
     */
    public Student(int id, String surname, String forename, LocalDate birthDate) {

	// assign attributes here
    	setBirthDate(birthDate);
    	this.surname = surname;
    	this.forename = forename;
    	this.id = id;
    
	return;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString() Creates a formatted string of student data.
     */
    @Override
    public String toString() {
	String string = String.format("%-11s%s, %s%n" + "%-11s%d%n" + "Birthdate: " + birthDate, "Name: ", surname, forename, "ID: ", id);
	return string;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(final Student target) {
	int result = 0;

	// your code here
	if (target.surname == this.surname) {
		if (target.forename == this.forename) {
			if (target.id == this.id) 
				result = 0;
				
			else if (target.id > this.id)
				result = -1;
			else 
				result = 1;
		} else {
			char targetFirst = target.forename.charAt(0);
			char sourceFirst = this.forename.charAt(0);
			if (targetFirst > sourceFirst) {
				result = -1;
			} else {
				result = 1;
			}
		}
	} else {
		char targetFirst = target.surname.charAt(0);
		char sourceFirst = this.surname.charAt(0);
		if (targetFirst > sourceFirst) {
			result = -1;
		} else {
			result = 1;
		}
		
	}
	return result;
    }


    // getters and setters defined here
    // getters
    /**
     * @return birth date to the user.
     */
    public LocalDate getBirthDate () {
    	return this.birthDate;
    }
    
    /**
     * @return surname back to user.
     */
    public String getSurname () {
    	return this.surname;
    }
    /**
     * @return forename back to user.
     */
    public String getForename () {
    	return this.forename;
    }
    /**
     * @return id bock to user.
     */
    public int getId () {
    	return this.id;
    }
    
    // setters
    /**
     * @param birthDate set to class
     */
    public void setBirthDate (LocalDate birthDate) {
    	this.birthDate = birthDate;
    }
    
    /**
     * @param surname set to class
     */
    public void setSurname (String surname) {
    	this.surname = surname;
    }
    
    /**
     * @param forename set to class
     */
    public void setForename (String forename) {
    	this.forename = forename;
    }
 
    /**
     * @param id set to class
     */
    public void setId (int id) {
        this.id = id;
    }
    	
    }