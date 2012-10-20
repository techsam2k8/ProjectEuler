import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class P4 {
    public static void main(String args[]) throws Exception {
	int sum = 0;
	test: for (int x = 999; x > 99; x--) {
	    cont: for (int y = 999; y > 99; y--) {
		int temp = x * y;
		String s = Integer.toString(temp);
		int l = s.length();
		for (int i = 0; i < l/2; i++) {
		    if (s.charAt(i) != s.charAt(l - i - 1)) {
			continue cont;
		    }
		}
		if (temp > sum) {
		    sum = temp;
		}
	    }
	}
	System.out.println(sum);
		    
    }
}