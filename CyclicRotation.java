package main.Codility;

public class CyclicRotation {
	
	// Correctness: 100 %
	// Performance: Not assessed
	// Task Score: 100%
	// https://app.codility.com/demo/results/trainingH8RNCE-2J6/

	public static int[] cyclicRotation(int[] A, int K) {
		int N = A.length;   
		int[] ans = new int[N];
		
		for(int i=0; i< N; i++){
			ans[ (i+K) % N] = A[i];
		}
		
		return ans;
	}
	
	

}
