/* Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition. */

class Solution {

    public int[] sortArrayByParity(int[] nums) {
        int firstPointer = 0;

        for (int secondPointer = 0; secondPointer < nums.length; secondPointer++) {
            if (nums[secondPointer] % 2 == 0) {
                int temp = nums[firstPointer];
                nums[firstPointer] = nums[secondPointer];
                nums[secondPointer] = temp;
                firstPointer++;
            }
        }
        return nums;
    }
}

/* Your input
[3,1,2,4]

Your answer
[2,4,3,1]

Expected answer
[2,4,3,1] */
