package main.Codility;

import java.util.Stack;

public class StoneWall {

	// Correctness: 100%
	// Performance: 100%
	// Task Score: 100%
	// https://app.codility.com/demo/results/trainingNPTK2R-2CM/

	public static int stoneWall(int[] H) {

		if(H.length==0){
			return 0;
		}

		Stack<Integer> blocks = new Stack<Integer>();
		blocks.push(H[0]);
		int currBlocksHeight= H[0];
		int numOfBlocks= 0;
		int newBlock;

		for(int i=1; i< H.length; i++){
			while( H[i] < currBlocksHeight){
				// close last block
				currBlocksHeight -= blocks.pop();
				numOfBlocks ++;

				if(H[i] > currBlocksHeight){
					// add new block- if needed
					newBlock = H[i] - currBlocksHeight;
					blocks.push(newBlock);
					currBlocksHeight += newBlock;
					break;
				}
			}
			if( H[i] > currBlocksHeight){
				// add a block for the remainder
				newBlock = H[i] - currBlocksHeight;
				blocks.push(newBlock);
				currBlocksHeight += newBlock;
			}
		}

		return numOfBlocks + blocks.size();
	}



}
