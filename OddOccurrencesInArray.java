package main.Codility;

import java.util.Arrays;

// Correctness: 100 %
// Performance: 100 %
// Task Score: 100%
// https://app.codility.com/demo/results/trainingUBFX43-YAE/
// https://app.codility.com/demo/results/trainingHQCRRT-MKG/
 
public class OddOccurrencesInArray {
	
	// Time: O(N*log(N))
	// Space: O(1)

	public static int oddOccurrencesInArray(int[] A) {
		if(A.length ==1){
			return A[0];
		}
		
		Arrays.sort(A);
		
		int i=0;
		while( i<A.length-1){
			if(A[i+1]!= A[i]){
				return A[i];
			}else{
				if(i+2 < A.length-1){
					i +=2;
				}else{
				    //this is the last element
				    return A[A.length-1];
				}
			}
		}
		return 0;
	}
	

}
