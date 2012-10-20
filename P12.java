import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class P12 {
    public static void main(String args[]) throws Exception {
	int i = 0;
	int x;
	while (true) {
	    i++;
	    int n = (i * (i + 1)) / 2;
	    
	    x = 2;
	    if ((n % 2) == 0) {
		
		for (int j = 2; j < i/2; j++) {
		    if ((n % j) == 0) {
			x += 2;
		    }
		}
	    } else {
		for (int j = 2; j < i/3; j++) {
		    if ((n % j) == 0) {
			x += 2;
		    }
		}
	    }
	    if (x > 500) {
		System.out.println(n);
		break; 
	    }
	}
    }


	    
}
	    
