/* A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i]. */

import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int mismatchCount = 0;
        int[] expected = heights.clone();
        Arrays.sort(expected);
        
        for (int i = 0; i < heights.length; i++){
            if (expected[i] != heights[i]){
                mismatchCount++;
            }
        }
        
        return mismatchCount;
    }
}

/* Your input
[1,1,4,2,1,3]

Your answer
3

Expected answer
3 */