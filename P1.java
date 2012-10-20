import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class P1 {
    public static void main(String args[]) throws Exception {
	int sum = 0;
	for (int i = 0; i < 1000; i++) {
	    if (i % 15 == 0) {
		sum += i;
		continue;
	    }
	    if (i % 5 == 0) {
		sum += i;
	    }
	    if (i % 3 == 0) {
		sum += i;
	    }
	}
	System.out.println(sum);
    }
}