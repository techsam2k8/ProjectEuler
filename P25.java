import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class P25 {
    public static void main(String args[]) throws Exception {
	BigInteger a = BigInteger.ONE;
	BigInteger b = BigInteger.ONE;
	long count = 2;
	while (b.toString().length() != 1000) {
	    BigInteger c = a.add(b);
	    a = b;
	    b = c;
	    count++;
	}
	System.out.println(count);
    }

	    
}
	    
