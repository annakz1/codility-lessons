package main.Codility;

/**
  	// Correctness: 100 %
	// Performance: 100 %
	// Task Score: 100 %
	// https://app.codility.com/demo/results/training2P27W9-98R/
 
 */
public class FrogJmp {
	
	// Time: O(1)
	// Space: O(1)

	public static int solution(int X, int Y, int D) {
		
		return (int) (Math.ceil((double)(Y-X)/(double)D));
		
	}
}
