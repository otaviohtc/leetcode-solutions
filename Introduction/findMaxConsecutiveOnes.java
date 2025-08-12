// Given a binary array nums, return the maximum number of consecutive 1's in the array.

class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int consecutiveOnes = 0;

        for (int number : nums) {

            if (number == 1) consecutiveOnes++;
            else consecutiveOnes = 0;

            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, consecutiveOnes);
        }
        return maxConsecutiveOnes;
    }
}

/*
Your input
[1,1,0,1,1,1]

Your answer
3

Expected answer
3
*/