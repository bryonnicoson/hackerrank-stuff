import java.util.*;
import java.lang.*;

public class Solution {
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		int games = in.nextInt();

		int[] numbers = new int[games];
		int g = 0;

		do {
			numbers[g] = in.nextInt();
			g++;
		} while (g < games);

		for (int n : numbers) {
			if (Long.bitCount(n) % 2 == 0) 
				System.out.println("Richard");
			else
				System.out.println("Louise");		
		}
	}
}