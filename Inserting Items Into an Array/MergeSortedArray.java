/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Last = m - 1;
        int nums2Last = n - 1;
        int mergedLast = m + n - 1;
        
        while (nums1Last >= 0 && nums2Last >= 0) {
            if (nums1[nums1Last] > nums2[nums2Last]) {
                nums1[mergedLast--] = nums1[nums1Last--];
            } else {
                nums1[mergedLast--] = nums2[nums2Last--];
            }
        }
        
        while (nums2Last >= 0) {
            nums1[mergedLast--] = nums2[nums2Last--];
        }
    }
}

/*
Your input
[1,2,3,0,0,0]
3
[2,5,6]
3

Your answer
[1,2,2,3,5,6]

Expected answer
[1,2,2,3,5,6]
*/