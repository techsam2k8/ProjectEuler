public class IsPrime {

    static boolean prime(int n, int i) {
	if (i == n) {
	    return true;
	} else if (n % i == 0 && i != 1) {
	    return false;
	} else {
	    return prime(n, ++i);
	}
    }

    public static void main (String args[]) {
	boolean t = prime(7, 2);
	System.out.println(t);
    }
}