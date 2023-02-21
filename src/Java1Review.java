import java.util.Arrays;

/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
		
	}
	public static double divide(double a, double b) {
		return a / b;
	}
	public static double divide(int a, int b) {
		return a / b;
	}
	public static boolean isDivisibleBy7(int a) {
		if(a % 7 == 0)
			return true;
		else
			return false;
	}
	public static String main(String a) {
		return "Overloaded main method was passed \"" + a + "\".";
	}
	public static int findMin(int a, int b, int c) {
		int min = 0;
		if(a < b)
			min = a;
		else
			min = b;
		if(min > c)
			min = c;
		return min;
	}
	public static int findMin(int[] a) {
		int min = a[0];
		for(int x : a) 
			if(min > x)
				min = x;
		return min;
	}
	public static double average(int[] a) {
		double total = 0;
		for(int x : a)
			total += x;
		return total/a.length;
	}
	public static String[] toLowerCase(String[] a) {
		for(int x = 0 ; x < a.length ; x++)
			a[x] = a[x].toLowerCase();
		return a;
	}
	public static String[] toLowerCaseCopy(String[] a) {
		String[] temp = Arrays.copyOf(a, a.length);
		String[] lower = toLowerCase(temp);
		return lower;
	}
	public static int[] removeDuplicates(int[] a) {
		for(int x = 0 ;x < a.length ; x++) {
			boolean dupe = false;
			for(int m = x + 1; m < a.length; m++)
				if(a[x] == a[m]) {
					a[m] = 0;
					dupe = true;
				}
			if(dupe)
				a[x] = 0;
		}
		return a;
	}
}
