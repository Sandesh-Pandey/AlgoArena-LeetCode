class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);                          // Step 1: Sort the input array in ascending order.
        for (int i=0; i<nums.length-1; i++){       // Step 2: Traverse the sorted array to check for duplicates.
            if ( nums[i] == nums[i+1] ){          // Step 3: Compare the current element with the next element.
                return true;                     // If two consecutive elements are equal, a duplicate is found.
            }                                   // Return true immediately since we found a duplicate.
        }
        return false;                         // Step 4: If no duplicates are found after checking all elements, return false.
                
    }
}
