package md.convertit.classes.utils;

/**
 * 
 * @author user This class contains util mehods
 *
 */
public class StringUtil {
	/**
	 * 
	 * @param word
	 *            the string to be tested if starts with a prefix
	 * @param prefix
	 *            the prefix
	 * @return true is the words starts with the prefix
	 */
	public boolean beginsWith(String word, String prefix) {
		boolean result = word.startsWith(prefix);
		return result;
	}
	/**
	 * this static method just display a text
	 */
public static void sayHello(){
	System.out.println("Helloooo");
}
}
