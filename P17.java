import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class P17 {
    public static void main(String args[]) throws Exception {
	long sum = 0;
	for (int x = 1; x < 1000; x++) {
	    int i = x;
	    long counter = 0;
	    if (i >= 900) {
		counter += 11;
		if (i > 900) {
		    counter += 3;
		}
	    } else  if (i >= 800) {
		counter += 12;
		if (i > 800) {
		    counter += 3;
		}
	    } else if (i >= 700) {
		counter += 12;
		if (i > 700) {
		    counter += 3;
		}
	    } else if (i >= 600) {
		counter += 10;
		if (i > 600) {
		    counter += 3;
		}
	    } else if (i >= 500) {
		counter += 11;
		if (i > 500) {
		    counter += 3;
		}
	    } else if (i >= 400) {
		counter += 11;
		if (i > 400) {
		    counter += 3;
		}
	    } else if (i >= 300) {
		counter += 12;
		if (i > 300) {
		    counter += 3;
		}
	    } else if (i >= 200) {
		counter += 10;
		if (i > 200) {
		    counter += 3;
		}
	    } else if (i >= 100) {
		counter += 10;
		if (i > 100) {
		    counter += 3;
		}
	    }
	    i = i % 100;
	    if (i >= 90) {
		counter += 6;
	    } else if (i >= 80) {
		counter += 6;
	    } else if (i >= 70) {
		counter += 7;
	    } else if (i >= 60) {
		counter += 6;
	    } else if (i >= 50) {
		counter += 5;
	    } else if (i >= 40) {
		counter += 5;
	    } else if (i >= 30) {
		counter += 5;
	    } else if (i >= 20) {
		counter += 6;
	    }
	    if (i == 19) {
		counter += 8;
	    } else if (i == 18) {
		counter += 8;
	    } else if (i == 17) {
		counter += 9;
	    } else if (i == 16) {
		counter += 7;
	    } else if (i == 15) {
		counter += 8;
	    } else if (i == 14) {
		counter += 8;
	    } else if (i == 13) {
		counter += 9;
	    } else if (i == 12) {
		counter += 6;
	    } else if (i == 11) {
		counter += 6;
	    } else if (i == 10) {
		counter += 3;
	    } else if (i == 9) {
		counter += 4;
	    } else if (i == 8) {
		counter += 5;
	    } else if (i == 7) {
		counter += 5;
	    } else if (i == 6) {
		counter += 3;
	    } else if (i == 5) {
		counter += 4;
	    } else if (i == 4) {
		counter += 4;
	    } else if (i == 3) {
		counter += 5;
	    } else if (i == 2) {
		counter += 3;
	    } else if (i == 1) {
		counter += 3;
	    }
	    sum += counter;
	    System.out.println(sum);
	}
	System.out.println(sum);
    }

	    
}
	    
