package Convert_an_Array_Into_a_2D_Array_With_Conditions_17_01_2025;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        for (var num : nums) {
            if (lists.getLast().contains(num)) {
                List<Integer> newList = new ArrayList<>();
                newList.add(num);
                lists.add(newList);
            } else {
                for (var list : lists) {
                    if (!list.contains(num)) {
                        list.add(num);
                        break;
                    }
                }
            }
        }

        return lists;
    }
}