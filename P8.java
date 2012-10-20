import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class P8 {
    public static void main(String args[]) throws Exception {
	Scanner in = new Scanner(System.in);
	String temp = "";
	for (int i = 0; i < 20; i++) {
	    temp = temp + in.next();
	}
	int one = Character.getNumericValue(temp.charAt(0));
	int two = Character.getNumericValue(temp.charAt(1));
	int three = Character.getNumericValue(temp.charAt(2));
	int four = Character.getNumericValue(temp.charAt(3));
	int five = Character.getNumericValue(temp.charAt(4));
	int max = one*two*three*four*five;

	for (int i = 5; i < 1000; i++) {
	    one = two;
	    two = three;
	    three = four;
	    four = five;
	    five = Character.getNumericValue(temp.charAt(i));
	    max = max(max, one*two*three*four*five);
	    
	    //System.out.println(temp.charAt(i));
	}
	    System.out.println(max);

    }
    public static int max(int x, int y) {
	if (x > y) {
	    return x;
	} 
	return y;
    }
}

	    
