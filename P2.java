import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class P2 {
    public static void main(String args[]) throws Exception {
	long sum = 2;
	long a = 1;
	long b = 2;
	long temp = 0;
	while (a + b < 4000000) {
	    temp = a + b;
	    a = b;
	    b = temp;
	    if (b % 2 == 0) {
		sum += b;
	    }
	}
	System.out.println(sum);
    }
}