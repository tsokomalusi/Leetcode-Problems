package two_pointer;

public class TwoSumII {


	/* Problem 167: Two Sum II: Input array is sorted
	 * 
	 * Given an array of integers numbers that is 
	 * already sorted in an ascending order, find two
	 * numbers such that they add up to a specific target number
	 * 
	 * Return the indices of the two numbers (1-indexed) as an integer array
	 * answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length
	 * 
	 * You may assume that each input would have exactly one solution and
	 * you may not use the same element twice
	 * 
	 */

	public static void main(String[] args) {
		
		int[] arr = {2, 7, 11, 15};
		int targetVal = 9;
		
		System.out.print("Input: ");
		
		for(int it: arr) {
			
			System.out.print(it + " ");
		}
		
		System.out.println("\nTarget: " + targetVal);
		
		int[] sum = twoSum(arr, targetVal);
		
		System.out.println("Output ");
		
	    for(int it: sum) {
	    	
	    	System.out.print(it + " ");
	    }
		
	}

	public static int[] twoSum(int[] numbers, int targetSum) {

		//Definining the pointers
		int leftP = 0, n = numbers.length, rightP = n - 1;

		//use the pointers to find the sum equivalent to the target sum
		while(leftP < rightP)  {

			int currSum =  numbers[leftP] + numbers[rightP];

			if(currSum > targetSum) {

				rightP--;
			}

			else if(currSum > targetSum) {

				leftP++;
			}

			else {

				//returning the two indices of the current sum (1-indexed)
				return new int[] {leftP+1, rightP+1};
			}

		}

		//if the pair does not exist
		return new int[] {-1, -1};
	}

}
