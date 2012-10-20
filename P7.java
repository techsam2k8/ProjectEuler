import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class P7 {
    public static void main(String args[]) throws Exception {
	long[] primes = new long[10001];
	primes[0] = 2;
	int counter = 1;
	int i = 3;
	loop:
	while (counter < 10001) {
	    for (int j = 0; j < counter; j++) {
		if ((i % primes[j]) == 0) {
		    i++;

		    continue loop;
		}
	    }
	    primes[counter] = i;
	    counter++;
	    //System.out.println(i);
	    i++;
	}
	System.out.println(primes[10000]);
    }
}
	    
