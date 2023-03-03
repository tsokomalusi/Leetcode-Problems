package two_pointer;

public class RemoveDuplicates {
	
	//Problem: Remove Duplicates from sorted Array
	//Goal: goal return new size of the subarray 
	//Display the subarray with no duplicates
	
	 public static void main(String[] args) {
		 
		 int[] arr = {0,0,1,1,1,2,2,3,3,4};
		 
		 System.out.print("Input: ");
		 
		 for(int it : arr)  {
			 
			 System.out.print(it + " ");
		 }
		 
		 int newLen = removeDuplicates(arr);
		 
		 System.out.print("\nOutput: ");
		 
		 for(int i = 0; i < newLen; i++) {
			 
			 System.out.print(arr[i] + " ");
		 }
		 
		 System.out.print("\nNew Size: " + newLen);
		
	}
	 
	 
	 public static int removeDuplicates(int[] nums) {
		 
		 //base case
		 int len = nums.length;
		 
		 if(len < 2)
			 return len;
		 //define the pointers
		 
		 int lP = 0, rP = 1;
		 
		 //remove duplicates
		 
		 while(rP < len)  {
			 
			 if(nums[lP] == nums[rP]) {
				 
				 rP++;   //explore 
			 }
			 
			 else {
				 
				 lP++;
				 nums[lP] = nums[rP];
			 }
		 }
		 
		 //return size of the subarray with no duplicates
		 return lP+1;
		 
	 }

}
