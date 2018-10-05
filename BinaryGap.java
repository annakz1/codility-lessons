package first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryGap {

	// Correctness: 100 %
	// Performance: Not assessed
	// Task Score: 100%
	// https://app.codility.com/demo/results/training38MSUM-TK9/
	
	public static int binaryGaps(int N) {

		String binaryString = Integer.toBinaryString(N);
		// The 0 number
		if(binaryString.length()==1 ){
			return 0;
		}

		List<Integer> gaps = new ArrayList<Integer>();

		int currCount=0;

		for(int i=1; i< binaryString.length(); i++){
			if(binaryString.charAt(i) == '0' && binaryString.charAt(i-1) == '1'){
				//open a new gap
				currCount++;
			}else if(binaryString.charAt(i) == '0' && binaryString.charAt(i-1) == '0'){
				currCount++;
			}else if(binaryString.charAt(i) == '1' && binaryString.charAt(i-1) == '0'){
				// close current gap
				gaps.add(currCount);
				currCount=0;
			}


		}
		if(!gaps.isEmpty()){
			return Collections.max(gaps);
		}else{
			return 0;
		}

	}
}
