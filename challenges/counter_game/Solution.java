import java.util.*;
import java.lang.*;
import java.math.*;

public class Solution {
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		int gc = in.nextInt();
		int g = 0;

		while ( g < gc ) {
			BigInteger n = in.nextBigInteger();			
			System.out.println((n.bitCount()%2==0) ? "Richard" : "Louise");	
			g++;
		}
	}
}