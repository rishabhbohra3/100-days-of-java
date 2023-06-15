package com.abhyasa.java.challenge.problems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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

    /**
     * Input: nums = [0,0,1,1,1,1,2,3,3]
     * Output: 7, nums = [0,0,1,1,2,3,3,_,_]
     * Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     * **/
    public int removeDuplicatesMoreThan2(int[] nums) {
        int lastIndex = 0;
        int lastValue = nums[0];
        int atMost = 0;
        for (int i=0; i<nums.length; i++) {
            if (lastValue!=nums[i]) {
                lastValue = nums[i];
                nums[lastIndex] = nums[i];
                lastIndex++;
                atMost = 1;
            } else if(lastValue == nums[i] && atMost < 2) {
                lastValue = nums[i];
                nums[lastIndex] = nums[i];
                lastIndex++;
                atMost++;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        RemoveDuplicateElements removeDuplicateElements = new RemoveDuplicateElements();
        int[] numbers = new int[]{1,1,2,3,3,3,3,4,5,6,6,6,6,7};
        int unique_elements = removeDuplicateElements.removeDuplicates(numbers);
        System.out.println(unique_elements);
        int[] numbers2 = new int[]{1,1,2,3,3,3,3,4,5,6,6,6,6,7};
        int unique_elements_2 = removeDuplicateElements.removeDuplicatesMoreThan2(numbers2);
        System.out.println(unique_elements_2);
        List<Integer> numberList = new ArrayList<Integer>(Arrays.asList(2, 1, 2));
        int majorityElement = numberList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey).orElse(0);
        System.out.println(majorityElement);
        Map<Integer, Integer> elementsMap = new HashMap<>();
        elementsMap.keySet();
    }
}
