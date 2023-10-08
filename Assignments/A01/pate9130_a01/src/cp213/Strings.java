package cp213;

/**
 * @author Chetas Patel 200679130
 * @version 2022-01-08
 */
public class Strings {
    // Constants
    public static final String VOWELS = "aeiouAEIOU";

    /**
     * Determines if string is a "palindrome": a word, verse, or sentence (such as "Able
     * was I ere I saw Elba") that reads the same backward or forward. Ignores case,
     * spaces, digits, and punctuation in the string parameter s.
     *
     * @param string a string
     * @return true if string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(final String string) {

	// your code here
    string.replace(",","");
    int n = string.length();
    	for (int i = 0; i < (n/2); ++i) {
    		if (string.charAt(i) != string.charAt(n - i - 1)) 
    			return false; 	 
    		
    	}
    	
    return true;
    }

    /**
     * Determines if name is a valid Java variable name. Variables names must start
     * with a letter or an underscore, but cannot be an underscore alone. The rest
     * of the variable name may consist of letters, numbers and underscores.
     *
     * @param name a string to test as a Java variable name
     * @return true if name is a valid Java variable name, false otherwise
     */
    public static boolean isValid(final String name) {

	// your code here
    if(name.isEmpty())
    	return false;
    if(!Character.isJavaIdentifierStart(name.charAt(0)))
    	return false;
    for(int i=0; i<name.length();i++)
    	if(!Character.isJavaIdentifierPart(name.charAt(i)))
    		return false;

	return true;
    }

    /**
     * Converts a word to Pig Latin. The conversion is:
     * <ul>
     * <li>if a word begins with a vowel, add "way" to the end of the word.</li>
     * <li>if the word begins with consonants, move the leading consonants to the
     * end of the word and add "ay" to the end of that. "y" is treated as a
     * consonant if it is the first character in the word, and as a vowel for
     * anywhere else in the word.</li>
     * </ul>
     * Preserve the case of the word - i.e. if the first character of word is
     * upper-case, then the new first character should also be upper case.
     *
     * @param word The string to convert to Pig Latin
     * @return the Pig Latin version of word
     */
    public static String pigLatin(String word) {

	// your code here
    char first = word.charAt(0);
    if(VOWELS.contains(String.valueOf(first))) {
    	word+="way";
    } else {
    	if(String.valueOf(first).matches("[A-Z]+")) {
    		word = word.substring(1);
    		word += String.valueOf(first).toLowerCase() + "ay";
    		first = word.charAt(0);
    		word = word.substring(1);
    		word = String.valueOf(first).toUpperCase() + word;
    	} else {
    		word = word.substring(1);
    		word += String.valueOf(first) + "ay";
    	}
    	
    }

	return word;
    }

}
