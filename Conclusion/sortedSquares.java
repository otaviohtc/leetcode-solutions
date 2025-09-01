// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

import java.util.Arrays;

class Solution {

    public int[] sortedSquares(int[] nums) {
        int[] squaresOfEachNumber = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int square = nums[i] * nums[i];
            squaresOfEachNumber[i] = square;

        }

        Arrays.sort(squaresOfEachNumber);
        return squaresOfEachNumber;
    }
}

/* Your input
[-4,-1,0,3,10]

Your answer
[0,1,9,16,100]

Expected answer
[0,1,9,16,100] */
