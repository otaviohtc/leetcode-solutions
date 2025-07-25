
class Solution {

    public int maximumWealth(int[][] accounts) {

        int maxSoFar = 0;

        for (int[] account : accounts) {
            int temp = 0;
            for (int j = 0; j < account.length; j++) {
                temp += account[j];
            }
            maxSoFar = Math.max(maxSoFar, temp);
        }
        return maxSoFar;
    }
}
