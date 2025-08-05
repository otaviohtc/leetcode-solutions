
class Solution {

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

/* Your input
[3,2,2,3]
3

Your answer
[2,2]

Expected answer
[2,2] */
