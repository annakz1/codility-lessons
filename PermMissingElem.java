package main.Codility;

public class PermMissingElem {
	
	// Correctness: 100%
	// Performance: 100%
	// Task Score: 100%
	//
	// https://app.codility.com/demo/results/training9UXWGH-Z6J/
	// https://app.codility.com/demo/results/trainingE38GQP-H56/
	// https://app.codility.com/demo/results/training8UBQA4-FU5/
	//
	/* Note: all the variables should be declared as long, otherwise there is an integer overflow*/

	public int solution(int[] A) {
		// calculate Sn= n(a1+an)/2
		long N = A.length;
		long sN = ((N+1)*(N+2))/2;

		long arrSum=0;
		for(int i=0; i<N; i++){
			arrSum += A[i];
		}

		return (int)(sN - arrSum);
	}

}
