import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class P3 {
    public static void main(String args[]) throws Exception {
	BigInteger sum = BigInteger.ZERO;
	BigInteger ans = new BigInteger("600851475143");
	BigInteger i = BigInteger.ONE.add(BigInteger.ONE);
	//System.out.println(i);
	while (i.compareTo(ans) != 1) {
	    //System.out.println(i.toString());

	    if (ans.equals(BigInteger.ONE)) {
		break;
	    }

	    if ((ans.mod(i)).equals(BigInteger.ZERO)) {
		//System.out.println(i.toString());
		ans = ans.divide(i);
		sum = i;
		i = BigInteger.ONE;
	    }
	    i = i.add(BigInteger.ONE);
	}
	System.out.println(sum.toString());
    }
}