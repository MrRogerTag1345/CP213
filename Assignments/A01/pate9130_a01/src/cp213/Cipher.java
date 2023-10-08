package cp213;

/**
 * @author Chetas Patel 200679130
 * @version 2022-01-08
 */
public class Cipher {
    // Constants
    public static final String ALPHA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final int ALPHA_LENGTH = ALPHA.length();

    /**
     * Encipher a string using a shift cipher. Each letter is replaced by a letter
     * 'n' letters to the right of the original. Thus for example, all shift values
     * evenly divisible by 26 (the length of the English alphabet) replace a letter
     * with itself. Non-letters are left unchanged.
     *
     * @param s string to encipher
     * @param n the number of letters to shift
     * @return the enciphered string
     */
    public static String shift(final String s, final int n) {

    	int len=s.length();
        char charc;
        int pos;
        String string = "";


        for(int k = 0; k < len; k++) {
        	charc = (Character.toUpperCase(s.charAt(k)));
            pos=ALPHA.indexOf(charc);
            int n_pos = pos + n;
            if ((n_pos>ALPHA_LENGTH) && (pos!=-1)) {
            	n_pos=n_pos-26;
            	string+=ALPHA.charAt(n_pos);
            }
            else if(pos!=-1) {
            	string+= ALPHA.charAt(n_pos);
            }
            else {
            	string+=charc;
         }
        }

 return string;
    }

    /**
     * Encipher a string using the letter positions in ciphertext. Each letter is
     * replaced by the letter in the same ordinal position in the ciphertext.
     * Non-letters are left unchanged. Ex:
     *
     * <pre>
    Alphabet:   ABCDEFGHIJKLMNOPQRSTUVWXYZ
    Ciphertext: AVIBROWNZCEFGHJKLMPQSTUXYD
     * </pre>
     *
     * A is replaced by A, B by V, C by I, D by B, E by R, and so on. Non-letters
     * are ignored.
     *
     * @param s          string to encipher
     * @param ciphertext ciphertext alphabet
     * @return the enciphered string
     */
    public static String substitute(final String s, final String ciphertext) {

    	int m;
        String temp = "";
        String upword = s.toUpperCase();
        
        for(int k=0; k<upword.length(); k++) {
                if(!Character.isLetter(upword.charAt(k))==false) {
                        char charc = upword.charAt(k);
                        for(m=0; m<ALPHA.length(); m++) {

                                char Alpha = ALPHA.charAt(m);

                                if(charc == Alpha) {
                                        int x = m;
                                        temp += ciphertext.charAt(x);
                                }
                        }
                }
                else {
                        temp += s.charAt(k);
                }
         }
        
        return temp;
    }

}
