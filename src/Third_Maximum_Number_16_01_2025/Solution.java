package Third_Maximum_Number_16_01_2025;

import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - 1 - i];
            nums[n - 1 - i] = temp;
        }

        if (nums.length < 3) {
            return nums[0];
        } else {
            int thirdDistinctMax = nums[0];
            int count = 1;
            for (int i = 1; i < nums.length; i++) {
                if (count < 3 && thirdDistinctMax != nums[i]) {
                    thirdDistinctMax = nums[i];
                    if (++count == 3) {
                        return thirdDistinctMax;
                    }
                }
            }
            return nums[0];
        }
    }
}