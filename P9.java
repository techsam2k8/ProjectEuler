import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class P9 {
    public static void main(String args[]) throws Exception {
	int a = 0;
	int b = 0;
	int c = 0;
	loop:
	for (a = 0; a < 1000; a++) {
	    if (a + b + c > 1000) {
		//continue;
	    }
	    for (b = a + 1; b < 1000; b++) {
		if (a + b + c > 1000) {
		    //continue loop;
		}
		for (c = b + 1; c < 1000; c++) {
		    //System.out.println(a);
		    //System.out.println(b);
		    //System.out.println(c);
		    //System.out.println();
		    if (a + b + c > 1000) {
			//continue loop2;
		    }
		    if (a + b + c == 1000) {
			if ((a*a) + (b*b) == (c*c)) {
			    System.out.println(a*b*c);
			    break loop;
			}
		    }
		}
	    }
	}
    }
}


	    
