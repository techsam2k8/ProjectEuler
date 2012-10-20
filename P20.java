import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class P20 {
    public static void main(String args[]) throws Exception {
	BigInteger x = BigInteger.ONE;
	BigInteger tmp = new BigInteger("1");
	for (int i = 0; i < 100; i++) {
	    x = x.multiply(tmp);
	    tmp = tmp.add(new BigInteger("1"));
	}
	String temp = x.toString();
	long sum = 0;
	for (int i = 0; i < temp.length(); i++) {
	    sum = sum + Character.getNumericValue(temp.charAt(i));
	}
	System.out.println(sum);
    }
}
