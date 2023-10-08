package cp213;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Chetas Patel 200679130
 * @version 2022-01-08
 */
public class SerialNumber {

    /**
     * Determines if a string contains all digits.
     *
     * @param str The string to test.
     * @return true if str is all digits, false otherwise.
     */
    public static boolean allDigits(final String str) {

	// your code here
    boolean temp = str.matches("[0-9]+");
    boolean returnvar = false;
    if (temp) {
    	returnvar = true;	
    }
	return returnvar;
    }

    /**
     * Determines if a string is a good serial number. Good serial numbers are of
     * the form 'SN/nnnn-nnn', where 'n' is a digit.
     *
     * @param sn The serial number to test.
     * @return true if the serial number is valid in form, false otherwise.
     */
    public static boolean validSn(final String sn) {

	// your code here
    boolean temp = sn.matches("SN/[0-9]{4}-[0-9]{3}");
    if (temp) {
    	return true;
    }

	return false;
    }

    /**
     * Evaluates serial numbers from a file. Writes valid serial numbers to
     * good_sns, and invalid serial numbers to bad_sns.
     *
     * @param fileIn  a file already open for reading
     * @param goodSns a file already open for writing
     * @param badSns  a file already open for writing
     */
    public static void validSnFile(final Scanner fileIn, final PrintStream goodSns, final PrintStream badSns) {

	// your code here
    String goodSN = "";
    String badSN = "";
    	
    while(fileIn.hasNextLine()) {
    	String temp = fileIn.nextLine();
    	boolean var_one = temp.matches("SN/[0-9]{4}-[0-9]{3}");
    	if(var_one) {
    		goodSN = goodSN.concat(temp + "\n");
    	} else {
    		badSN = badSN.concat(temp + "\n");
    	}
    	
    goodSns.println(goodSN);
    badSns.println(badSN);
    
    }

	return;
    }

}
