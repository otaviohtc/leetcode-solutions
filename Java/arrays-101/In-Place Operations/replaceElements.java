/* Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array. */

class Solution {

    public int[] replaceElements(int[] arr) {
        int maxSoFar = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxSoFar;
            maxSoFar = Math.max(maxSoFar, current);
        }

        return arr;
    }
}

/* Your input
[17,18,5,4,6,1]

Your answer
[18,6,6,6,1,-1]

Expected answer
[18,6,6,6,1,-1] */
