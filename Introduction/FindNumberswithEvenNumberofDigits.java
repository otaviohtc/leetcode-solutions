// Given an array nums of integers, return how many of them contain an even number of digits.

class Solution {

    public int findNumbers(int[] nums) {
        int containEvenNumberOfDigits = 0;

        for (int number : nums) {
            int amountOfDigits = 0;

            while (number >= 1) {
                number /= 10;
                amountOfDigits++;
            }

            if (amountOfDigits % 2 == 0) containEvenNumberOfDigits++;

        }
        return containEvenNumberOfDigits;
    }
}

/*
Your input
[12,345,2,6,7896]

Your answer
2

Expected answer
2
*/
