package Intersection_of_two_arrays_15_01_2025;

import java.util.HashSet;
import java.util.Set;

class Solution1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersection = new HashSet<>();
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    intersection.add(i);
                }
            }
        }

        int[] result = new int[intersection.size()];
        int index = 0;
        for (int num : intersection) {
            result[index++] = num;
        }
        return result;
    }
}