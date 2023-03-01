package two_pointer;

public class MoveZeros {

	public static void main(String[] args) {

		int[] arr = {0,  1,  0,  3,   12};

		System.out.print("Input: ");

		for(int it: arr) {

			System.out.print(it + " ");
		}

		moveZeros(arr);

		System.out.print("\nOutput: "); 

		for(int it: arr) {

			System.out.print(it + " ");
		}


	}


	public static void moveZeros(int[] nums) {

		//base case
		int len = nums.length;

		if(len < 2)
			return;

		//definining pointers

		int lP = 0, rP = 1;

		while(rP < len)  {

			if(nums[lP] != 0) {

				rP++;
				lP++;
			}

			else if(nums[rP] == 0) {

				rP++;
			}
			else {

				int temp = nums[rP];
				nums[rP] = nums[lP];
				nums[lP] = temp;
			}

		}

	}

}
