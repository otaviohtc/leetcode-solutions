/* Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number. */

class Solution {

    public int thirdMax(int[] nums) {
        Integer first = null;
        Integer second = null;
        Integer third = null;

        for (Integer num : nums) {

            if (num.equals(first) || num.equals(second) || num.equals(third)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third) {
                third = num;
            }

        }

        return third == null ? first : third;
    }
}

/* Your input
[3,2,1]

Your answer
1

Expected answer
1 */
