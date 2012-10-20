import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class P28 {
    public static void main(String args[]) throws Exception {
	long sum = 1;
	for (int i = 2; i < 1001; i += 2) {
	    int x = (i+1)*(i+1);
	    sum += x;
	    x -= i;
	    sum += x;
	    x -= i;
	    sum += x;
	    x -= i;
	    sum += x;
	}
	System.out.println(sum);
    }


	    
}
	    
