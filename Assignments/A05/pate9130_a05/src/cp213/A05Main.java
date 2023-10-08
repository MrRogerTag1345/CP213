package cp213;

import javax.swing.JFrame;

public class A05Main {
    private static final String LINE = "-".repeat(40);
    private static final String TEST_LINE = "=".repeat(80);

    // -------------------------------------------------------------------------------
    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    testCoefficients();
	    testTerm();
	    testPolynomial();
	    testGraph();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    /**
     * Test Coefficients
     */
    private static void testCoefficients() {
	// Tests.
	System.out.println(TEST_LINE);
	System.out.println("Testing Coefficients");
	System.out.println(LINE);
	final String string = "1,2.5,0,5,-3.2";
	System.out.println("string: \"" + string + "\"");
	final Coefficients c = new Coefficients(string);
	System.out.println("Coefficients: " + c.toString());
	return;
    }

    /**
     * Test Term
     *
     * @throws Exception
     */
    private static void testTerm() throws Exception {
	// Tests.
	System.out.println(TEST_LINE);
	System.out.println("Testing Term");
	System.out.println(LINE);
	double co = 2.5;
	int ex = 3;
	Term term = new Term(co, ex);
	System.out.print("coefficient: " + co + ", exponent: " + ex + " - ");
	System.out.println("Term: " + term.toString());
	co = 1;
	ex = 3;
	term = new Term(co, ex);
	System.out.print("coefficient: " + co + ", exponent: " + ex + " - ");
	System.out.println("Term: " + term.toString());
	co = 2.5;
	ex = 0;
	term = new Term(co, ex);
	System.out.print("coefficient: " + co + ", exponent: " + ex + " - ");
	System.out.println("Term: " + term.toString());
	System.out.println(LINE);
	System.out.println("Add Terms");
	co = 3;
	ex = 1;
	Term first = new Term(co, ex);
	co = 5;
	ex = 1;
	Term second = new Term(co, ex);
	Term third = first.add(second);
	System.out.println("Add: (" + first.toString() + ", " + second.toString() + ") = " + third.toString());
	third = first.subtract(second);
	System.out.println("Subtract: (" + first.toString() + ", " + second.toString() + ") = " + third.toString());
	third = first.multiply(second);
	System.out.println("Multiply: (" + first.toString() + ", " + second.toString() + ") = " + third.toString());
	Term fourth = third.differential();
	System.out.println("Differential: (" + third.toString() + ") = " + fourth.toString());
	fourth = third.negate();
	System.out.println("Negate: (" + third.toString() + ") = " + fourth.toString());
	return;
    }

    /**
     * Test Polynomial
     */
    private static void testPolynomial() throws Exception {
	// Tests.
	System.out.println(TEST_LINE);
	System.out.println("Testing Polynomial");
	System.out.println(LINE);
	System.out.println("Construct:\n");
	String string = "1,2.5,0,5,-3.2";
	System.out.println("string: \"" + string + "\"");
	Coefficients c = new Coefficients(string);
	System.out.println("Coefficients: " + c.toString());
	Polynomial first = new Polynomial(c);
	System.out.println("Polynomial: " + first.toString());
	System.out.println("degree: " + first.degree());
	System.out.println();

	c = new Coefficients("30");
	first = new Polynomial(c);
	System.out.println("Coefficients: " + c.toString());
	System.out.println("Polynomial: " + first.toString());
	System.out.println("degree: " + first.degree());

	System.out.println(LINE);
	System.out.println("Normalize:\n");
	string = "1,2.5,0,5,-3.2,0,0,0";
	c = new Coefficients(string);
	System.out.println("Coefficients: " + c.toString());
	first = new Polynomial(c);
	System.out.println("Polynomial: " + first.toString());
	System.out.println("degree: " + first.degree());
	System.out.println(LINE);
	System.out.println("Add:\n");
	string = "6,7,8";
	c = new Coefficients(string);
	Polynomial second = new Polynomial(c);
	Polynomial third = first.add(second);
	System.out.println(first.toString());
	System.out.println("    +");
	System.out.println(second.toString());
	System.out.println("    =");
	System.out.println(third.toString());
	System.out.println(LINE);
	System.out.println("Subtract\n");
	string = "-9,2,5";
	c = new Coefficients(string);
	first = new Polynomial(c);
	string = "-8,2,2";
	c = new Coefficients(string);
	second = new Polynomial(c);
	third = first.subtract(second);
	System.out.println(first.toString());
	System.out.println("    -");
	System.out.println(second.toString());
	System.out.println("    =");
	System.out.println(third.toString());
	System.out.println(LINE);
	System.out.println("Differentiate:\n");
	System.out.println(third.toString());
	System.out.println("    =");
	Polynomial fourth = third.differentiate();
	System.out.println(fourth.toString());
	fourth = fourth.differentiate();
	System.out.println("    =");
	System.out.println(fourth.toString());
	fourth = fourth.differentiate();
	System.out.println("    =");
	System.out.println(fourth.toString());
	System.out.println(LINE);
	System.out.println("Copy:\n");
	third = new Polynomial(first);
	System.out.println(first.toString());
	System.out.println("    =");
	System.out.println(third.toString());
	System.out.println(LINE);
	System.out.println("Multiply:\n");
	string = "9,4";
	c = new Coefficients(string);
	first = new Polynomial(c);
	string = "3,2,2";
	c = new Coefficients(string);
	second = new Polynomial(c);
	third = first.multiply(second);
	System.out.println(first.toString());
	System.out.println("    x");
	System.out.println(second.toString());
	System.out.println("    =");
	System.out.println(third.toString());
	System.out.println(LINE);
	System.out.println("Evaluate:\n");
	string = "0";
	c = new Coefficients(string);
	first = new Polynomial(c);
	double x = 0;
	double v = first.evaluate(x);
	System.out.println(first.toString() + " for x = " + x + ": " + v);
	string = "1";
	c = new Coefficients(string);
	first = new Polynomial(c);
	x = 5;
	v = first.evaluate(x);
	System.out.println(first.toString() + " for x = " + x + ": " + v);
	string = "1,1,1";
	c = new Coefficients(string);
	first = new Polynomial(c);
	x = 5;
	v = first.evaluate(x);
	System.out.println(first.toString() + " for x = " + x + ": " + v);
    }

    /**
     * Test Graph
     */
    private static void testGraph() throws Exception {
	// Tests.
	System.out.println(TEST_LINE);
	System.out.println("Testing Graph");
	System.out.println(LINE);
	// Model must be defined somehow.
	String string = "0,0,1";
	Coefficients data = new Coefficients(string);
	Polynomial poly = new Polynomial(data);

	// Create panels here

	JFrame frame = new JFrame();
	// frame.setContentPane( -- add panel to frame -- );
	frame.setSize(1000, 1000);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    }
}
