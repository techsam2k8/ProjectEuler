import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class P14 {
    public static void main(String args[]) throws Exception {
	int max = 1;
	int[] array = new int[1000000];
	array[0] = 1;
	for (int i = 2; i < 1000000; i++) {
	    int x = i;
	    int counter = 1;

	    while (x != 1) {
		
		if ((x - 1 < 1000000) && (array[x - 1] != 0)) {
		   counter = counter + array[x - 1] - 1;
		   break;
		   }
		
		counter++;
		if ((x % 2) == 0) {
		    x = x / 2;
		} else {
		    x = 3*x + 1;
		}
	    }
	    max = max(counter, max);
	    array[i - 1] = counter;
	    	System.out.println(max);

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
	    
