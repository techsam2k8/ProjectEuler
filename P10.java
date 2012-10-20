import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class P10 {
    public static void main(String args[]) throws Exception {
	long[] primes = new long[1000000];
	primes[0] = 2;
	int counter = 1;
	int i = 3;
	BigInteger sum = new BigInteger("2");
	loop:
	while (i < 2000000) {
	    int temp = (int) Math.sqrt((double) i);
 
	    for (int j = 0; j < counter; j++) {
		if (primes[j] > temp) {
		    break;
		}
		if ((i % primes[j]) == 0) {
		    i+=2;

		    continue loop;
		}
	    }
	    sum = sum.add(new BigInteger(Integer.toString(i)));
	    //sum += i;
	    primes[counter] = i;
	    counter++;
	    //System.out.println(i);
	    i+=2;
	}
	System.out.println(sum.toString());
    }
}
	    
