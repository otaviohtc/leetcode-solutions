// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        boolean[] present = new boolean[nums.length + 1];

        for (int num : nums) {
            present[num] = true;
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!present[i]) {
                result.add(i);
            }
        }

        return result;
    }
}

/* Your input
[4,3,2,7,8,2,3,1]

Your answer
[5,6]

Expected answer
[5,6] */
