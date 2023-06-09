package com.abhyasa.java.challenge.problems;

public class RemoveDuplicateElements {

    /**
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     * **/
    public int removeDuplicates(int[] nums) {
        int lastIndex = 1;
        int lastValue = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(lastValue!=nums[i]) {
                lastValue = nums[i];
                nums[lastIndex] = nums[i];
                lastIndex++;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        RemoveDuplicateElements removeDuplicateElements = new RemoveDuplicateElements();
        int unique_elements = removeDuplicateElements.removeDuplicates(new int[]{1,1,2,3,3,3,3,4,5,6,6,6,6,7});
    }
}
