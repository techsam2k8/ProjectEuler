import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class P31 {
    public static void main(String args[]) throws Exception {
	int[] array = {200, 100, 50, 20, 10, 5, 2, 1};
	System.out.println(magic(array, 0, 200));
    }
    public static int magic(int[] array, int pos, int total) {
	if ((total < 0) || (pos == array.length)) {
	    return 0;
	} else if (total == 0) {
	    return 1;
	} else {
	    return magic(array, pos, total - array[pos]) + magic(array, pos + 1, total);
	}
    }
	


	    
}
	    
