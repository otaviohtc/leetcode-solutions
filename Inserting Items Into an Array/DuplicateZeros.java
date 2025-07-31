/* Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
*/

class Solution {
    public void duplicateZeros(int[] arr) {
        int validZeros = 0;
        int lastPos = arr.length - 1;
        
        for (int i = 0; i <= lastPos - validZeros; i++){
            if (arr[i] == 0) {
                if (i == lastPos - validZeros) {
                    arr[lastPos] = 0;
                    lastPos--;
                    break;
                }
                validZeros++;
            }
        }
        
        for (int i = lastPos - validZeros; i >= 0; i--){
            arr[i + validZeros] = arr[i];
            
            if (arr[i] == 0 && validZeros > 0){
                validZeros--;
                arr[i + validZeros] = 0;
            }
        }
    }
}   

/*
Your input
[1,0,2,3,0,4,5,0]

Your answer
[1,0,0,2,3,0,0,4]

Expected answer
[1,0,0,2,3,0,0,4]
*/