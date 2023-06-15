package com.abhyasa.java.challenge.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MajorityElement {

    /**
     * Given an array nums of size n, return the majority element.
     *
     * The majority element is the element that appears more than ⌊n / 2⌋ times.
     * You may assume that the majority element always exists in the array.
     *
     * Input: nums = [3,2,3]
     * Output: 3
     * **/
    public int maxRepeatedElement(int[] nums) {
        Map<Integer, Integer> elementsMap = new HashMap<>();
        int val = 0;
        for (int num : nums) {
            val = Objects.isNull(elementsMap.get(num)) ? 1 : elementsMap.get(num) + 1;
            elementsMap.put(num, val);
        }
        int majorityElement = 0;
        int maxValue = 0;
        for(Integer key: elementsMap.keySet()) {
            if (maxValue<=elementsMap.get(key)) {
                maxValue = elementsMap.get(key);
                majorityElement = key;
            }
        }
        return majorityElement;
    }

    public int alternateApproach(int[] array) {
        int count = 1;
        int element = array[0];
        for (int j : array) {
            if (j == element) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                element = j;
                count = 1;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int result = majorityElement.maxRepeatedElement(new int[]{2,2,1,1,1,2,2});
        System.out.println(result);
        int alternateApproachResult = majorityElement.alternateApproach(new int[]{2,2,1,1,1,2,2});
        System.out.println(alternateApproachResult);
    }
}
