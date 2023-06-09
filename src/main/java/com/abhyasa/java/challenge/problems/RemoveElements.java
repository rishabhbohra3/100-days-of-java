package com.abhyasa.java.challenge.problems;

public class RemoveElements {

    /**
     * Input: nums = [0,1,2,2,3,0,4,2], val = 2
     * Output: 5, nums = [0,1,4,0,3,_,_,_]
     * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
     * Note that the five elements can be returned in any order.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     * **/
    public int removeElement(int[] nums, int val) {
        int k, j;
        for(k=0, j=nums.length-1; k<=j; k++) {
            if (nums[k]==val) {
                while(nums[j]==val && j>0 && k!=j) {
                    j--;
                }
                if (j>0 && k!=j) {
                    nums[k]=nums[j];
                    j--;
                } else {
                    return k;
                }
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveElements removeElements = new RemoveElements();
        int[] numbers = new int[] {1,2,3,4,3,5,6,3};
        int k = removeElements.removeElement(numbers, 3);
    }
}
