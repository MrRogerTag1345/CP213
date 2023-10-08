package cp213;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Utilities for working with Food objects.
 *
 * @author Chetas Patel
 * @version 2021-09-24
 */
public class FoodUtilities {

    /**
     * Determines the average calories in a list of foods. No rounding necessary.
     * Foods list parameter may be empty.
     *
     * @param foods a list of Food
     * @return average calories in all Food objects
     */
    public static int averageCalories(final ArrayList<Food> foods) {

	// your code here
    	int totalcals =0, k=0;
    	for (Food i:foods) {
    		totalcals += i.getCalories();
    		k += 1;
    	}
    return totalcals/k;
    }

    /**
     * Determines the average calories in a list of foods for a particular origin.
     * No rounding necessary. Foods list parameter may be empty.
     *
     * @param foods  a list of Food
     * @param origin the origin of the Food
     * @return average calories for all Foods of the specified origin
     */
    public static int averageCaloriesByOrigin(final ArrayList<Food> foods, final int origin) {

	// your code here
    	int totalcals = 0, k = 0;
    	for (Food i:foods) {
    		if (origin == i.getOrigin()){
    			totalcals += i.getCalories();
        		k += 1;
    		}
    	}
    	if (k == 0) {
    		return 0;
    	}else {
    		return totalcals/k;
    	}
    }

    /**
     * Creates a list of foods by origin.
     *
     * @param foods  a list of Food
     * @param origin a food origin
     * @return a list of Food from origin
     */
    public static ArrayList<Food> getByOrigin(final ArrayList<Food> foods, final int origin) {

	// your code here
    	ArrayList<Food> lObjects = new ArrayList<>();
    	for (Food k:foods) {
    		if (origin == k.getOrigin()){
    			lObjects.add(k);
    		}
    	}
	return lObjects;
    }

    /**
     * Creates a Food object by requesting data from a user. Uses the format:
     *
     * <pre>
    Name: name
    Origins
     0 Canadian
     1 Chinese
    ...
    11 English
    Origin: origin number
    Vegetarian (Y/N): Y/N
    Calories: calories
     * </pre>
     *
     * @param keyboard a keyboard Scanner
     * @return a Food object
     */
    public static Food getFood(final Scanner keyboard) {

	// your code here
    	
    	
    	System.out.print("Name: ");
    	String name = keyboard.nextLine();
    	
    	System.out.println(Food.originsMenu());
    	System.out.print("Origin: ");	
    	int origin = keyboard.nextInt();
    	
    	System.out.print("Vegetarian(true/false): ");
    	boolean vegetarian = keyboard.nextBoolean();
    	
    	System.out.print("Calories: ");
    	int calories = keyboard.nextInt();
    	
    	Food food_obj = new Food(name,origin,vegetarian,calories);

	return food_obj;
    }

    /**
     * Creates a list of vegetarian foods.
     *
     * @param foods a list of Food
     * @return a list of vegetarian Food
     */
    public static ArrayList<Food> getVegetarian(final ArrayList<Food> foods) {

	// your code here
    	ArrayList<Food> lObjects = new ArrayList<>();
    	for (Food k:foods) {
    		if (k.isVegetarian() == true) {
    			lObjects.add(k);
    		}
    	}

	return lObjects;
    }

    /**
     * Creates and returns a Food object from a line of string data.
     *
     * @param line a vertical bar-delimited line of food data in the format
     *             name|origin|isVegetarian|calories
     * @return the data from line as a Food object
     */
    public static Food readFood(final String line) {

	// your code here
    	System.out.println(line);
    	String[] var_one = line.split("\\|");
    	String name = var_one[0];
        int origin = Integer.parseInt(var_one[1]);
        boolean vegetarian = Boolean.parseBoolean(var_one[2]);
        int calories = Integer.parseInt(var_one[3]);
    	final Food obj = new Food(name,origin,vegetarian, calories);
    	return obj;

    }

    /**
     * Reads a file of food strings into a list of Food objects.
     *
     * @param fileIn a Scanner of a Food data file in the format
     *               name|origin|isVegetarian|calories
     * @return a list of Food
     */
    public static ArrayList<Food> readFoods(final Scanner fileIn) {

	// your code here
    	String str = "";
    	ArrayList<Food> lObjects = new ArrayList<>();
    	while (fileIn.hasNextLine()){
    		str = fileIn.nextLine();
    		String[] var_one = str.split("\\|");
    		String name = var_one[0];
    		int origin = Integer.parseInt(var_one[1]);
    		boolean vegetarian = Boolean.parseBoolean(var_one[2]);
    		int calories = Integer.parseInt(var_one[3]);
    		final Food var_two = new Food(name,origin,vegetarian, calories);
    		lObjects.add(var_two);
    	}
    	return lObjects;

    }

    /**
     * Searches for foods that fit certain conditions.
     *
     * @param foods        a list of Food
     * @param origin       the origin of the food; if -1, accept any origin
     * @param maxCalories  the maximum calories for the food; if 0, accept any
     * @param isVegetarian whether the food is vegetarian or not; if false accept
     *                     any
     * @return a list of foods that fit the conditions specified
     */
    public static ArrayList<Food> foodSearch(final ArrayList<Food> foods, final int origin, final int maxCalories,
	    final boolean isVegetarian) {

	// your code here
    	ArrayList<Food> lObjects = new ArrayList<>();
    	for (Food f:foods) {

    		if (((f.getCalories() <= maxCalories) | (maxCalories == 0)) & ((f.getOrigin() == origin) | f.getOrigin() == 0) & (f.isVegetarian() == true)) {
    			lObjects.add(f);
    		}
    	}

	return lObjects;
    }

    /**
     * Writes the contents of a list of Food to a PrintStream.
     *
     * @param foods a list of Food
     * @param ps    the PrintStream to write to
     */
    public static void writeFoods(final ArrayList<Food> foods, PrintStream ps) {

	// your code here
    	String str;
    	for (Food f:foods) {
    		
    		f.write(ps);

    	}
    }
}
