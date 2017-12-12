import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		int games = in.nextInt();

		int[] numbers = new int[games];
		int g = 0;

		// build array of game numbers
		do {
			numbers[g] = in.nextInt();
			g++;
		} while (g < games);
		
		// play game(s)
		for (int n : numbers) {
			
			int t = 0;

			while (n != 1) {

				if ((n&(n-1))==0) {
					n /= 2;
				} else {
					int p = 2;
					while (2*p < n) {
						p *= 2;
					} 
					n -= p;
				}
				t += 1;
			} 
			
			if (t % 2 == 0) {
				System.out.println("Richard");
			} else {
				System.out.println("Louise");
			}
		}
	}
}