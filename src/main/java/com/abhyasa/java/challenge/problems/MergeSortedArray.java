package com.abhyasa.java.challenge.problems;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int x=0;

        while(i<m || j<n) {
            if (j==n) {
                break;
            }
            if (i==m) {
                for (int z=j; z<n; z++) {
                    nums1[x] = nums2[z];
                    x++;
                }
                break;
            }
            if (nums1[x] > nums2[j]) {
                for (int z=x+m; z>x; z--) {
                    nums1[z] = nums1[z-1];
                }
                nums1[x] = nums2[j];
                j++;
                x++;
            } else {
                x++;
                m--;
            }
        }
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] num1 = new int[] {1,2,3,0,0,0};
        int[] num2 = new int[] {2,5,6};
        mergeSortedArray.merge(num1, 3, num2, 3);
    }
}
