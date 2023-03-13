package two_pointer;

public class SquaresOfSortedArray {
	
	  public static void main(String[] args) {
		  
		  int[] arr = {-7, -3, 2, 3, 11};
		  
		  System.out.print("input: ");
		  
		   for(int it: arr) {
			   
			   System.out.print(it + " ");
		   }
		   
		   int[] out = sortedSquares(arr);
		   
		   System.out.println();
		   
		   System.out.print("output: ");
		   
		   for(int it: out)  {
			   
			   System.out.print(it + " ");
		   }
		  	
	}


	public static int[] sortedSquares(int[] nums)  {

		int mid = 0, n = nums.length;

		for(int i = 0; i < n; i++) {

			mid = i;

			if(nums[i] >= 0) {

				break;
			}
		}

		int lP = mid - 1, rP = mid;
		int[] arr = new int[n];

		int index = 0;

		while(0 <= lP && rP <= n - 1) {

			int left = nums[lP] * nums[lP];
			int right = nums[rP] * nums[rP];

			if(left < right)  {

				arr[index] = left;
				lP--;
			}

			else {

				arr[index] = right;
				rP++;
			}

			index++;
		}
		while(0 <= lP) {

			arr[index++] = nums[lP] * nums[lP];
			lP--;

		}

		while(rP <= n - 1) {

			arr[index++] = nums[rP] * nums[rP];
			rP++;
		}
		
		return arr;

	}

}
