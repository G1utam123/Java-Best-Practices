package demo;



/**
 * Provides a specialized print method. Acts as the <i>Adaptee</i> in the 
 * pattern context.
  */
 
public class SystemOutPrinter {

    /**
     * Prints the argument string to <code>System.out</code>. In the pattern
     * context, this is the <i>specificRequest()</i> method on 
     * the <i>Adaptee</i>.
     *
     * @param s the string to be printed
     * @see Writer#write(String) the adapted method
     */
      

	public void printToSystemOut(String s) {
		System.out.println(s);
	}
}