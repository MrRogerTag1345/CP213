package cp213;

import java.io.PrintStream;

/**
 * Food class definition.
 *
 * @author Chetas Patel
 * @version 2021-09-24
 */
public class Food implements Comparable<Food> {

    // Constants
    public static final String ORIGINS[] = { "Canadian", "Chinese", "Indian", "Ethiopian", "Mexican", "Greek",
	    "Japanese", "Italian", "Moroccan", "Scottish", "Columbian", "English" };

    /**
     * Creates a string of food origins in the format:
     *
     * <pre>
Origins
 0 Canadian
 1 Chinese
...
11 English
     * </pre>
     *
     * @return A formatted numbered string of valid food origins.
     */
    public static String originsMenu() {

	// your code here
    String var_one = "Origins\n";
    for(int i= 0; i < ORIGINS.length; i++) {
    	 var_one += String.format("%2d " + ORIGINS[i] + "\n", i);
    }

	return var_one;
    }

    // Attributes
    private String name = null;
    private int origin = 0;
    private boolean isVegetarian = false;
    private int calories = 0;

    /**
     * Food constructor.
     *
     * @param name         food name
     * @param origin       food origin code
     * @param isVegetarian whether food is vegetarian
     * @param calories     caloric content of food
     */
    public Food(final String name, final int origin, final boolean isVegetarian, final int calories) {

	// your code here
    	this.name = name;
    	this.origin = origin;
    	this.isVegetarian = isVegetarian;
    	this.calories = calories;

	return;
    }

    /*
     * (non-Javadoc) Compares this food against another food.
     *
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    /**
     * Foods are compared by name, then by origin if the names match.
     * Must ignore case.
     */
    @Override
    public int compareTo(final Food target) {

    /*
    int compare = this.name.compareTo(target.name);
    
	if(this.name == target.name) {
		if(this.origin == target.origin) {
			return 0;
		} else if (this.origin > target.origin) {
			return 1;
		} else {
			return -1;
		}
	} else if (compare > 0) {
		return 1;
	} else {
		return -1;
	}
    }
    */
    int compare = this.name.compareToIgnoreCase(target.name);
    if (compare == 0) {
    	compare= Integer.compare(this.origin, target.origin);
    }

    return compare;
    }

    /**
     * Getter for calories attribute.
     *
     * @return calories
     */
    public int getCalories() {

	// your code here

	return this.calories;
    }

    /**
     * Getter for name attribute.
     *
     * @return name
     */
    public String getName() {

	// your code here

	return this.name;
    }

    /**
     * Getter for origin attribute.
     *
     * @return origin
     */
    public int getOrigin() {

	// your code here

	return this.origin;
    }

    /**
     * Getter for string version of origin attribute.
     *
     * @return string version of origin
     */
    public String getOriginString() {

	// your code here

	return ORIGINS[getOrigin()];
    }

    /**
     * Getter for isVegetarian attribute.
     *
     * @return isVegetarian
     */
    public boolean isVegetarian() {

	// your code here

	return this.isVegetarian;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object//toString() Creates a formatted string of food data.
     */
    /**
     * Returns a string version of a Food object in the form:
<pre>
Name:       name
Origin:     origin string
Vegetarian: true/false
Calories:   calories
</pre>
     */
    @Override
    public String toString() {

	// your code here
	return "Name:       " + getName() + "\n" + "Origin:     " + getOrigin() + "\n" + "Vegetarian: " + isVegetarian() + "\n" + "Calories:  " + getCalories();
    }

    /**
     * Writes a single line of food data to an open PrintStream. The contents of
     * food are written as a string in the format name|origin|isVegetarian|calories to ps.
     *
     * @param ps The PrintStream to write to.
     */
    public void write(final PrintStream ps) {

	// your code here
    //ps = getName() + "|" + getOrigin() + "|" + isVegetarian() + "|" + getCalories();
	//return null;
    }

}
