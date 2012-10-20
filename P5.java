import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class P5 {
    public static void main(String args[]) throws Exception {
	int sum = 1;
	for (int i = 1; i < 21; i++) {
	    sum = sum * (i/gcd(sum, i));
	}
	System.out.println(sum);
		    
    }
    public static int gcd(int a, int b) {
	if (b == 0) {
	    return a;
	}
	return gcd(b, a % b);
    }
}