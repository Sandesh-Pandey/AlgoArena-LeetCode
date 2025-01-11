class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            if(nums[i]%2==0){
                i++;
            }else if(nums[j]%2==1){
                j--;

            }else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                
            }
            
        }
        return nums;
        
    }
}


<h1>V/S</h1>
  
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) { // Changed condition from i <= j to i < j
            if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                // Swap if nums[i] is odd and nums[j] is even
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            } else if (nums[i] % 2 == 0) {
                // Increment i if nums[i] is already even
                i++;
            } else if (nums[j] % 2 != 0) {
                // Decrement j if nums[j] is already odd
                j--;
            }
        }
        return nums;
    }
}
