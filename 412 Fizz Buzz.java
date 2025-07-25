
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<String> fizzBuzz(int n) {

        String[] answer = new String[n];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = String.valueOf(i + 1);
        }

        for (int j = 0; j < answer.length; j++) {
            if (Integer.parseInt(answer[j]) % 3 == 0 && Integer.parseInt(answer[j]) % 5 == 0) {
                answer[j] = "FizzBuzz";
            } else if (Integer.parseInt(answer[j]) % 3 == 0) {
                answer[j] = "Fizz";
            } else if (Integer.parseInt(answer[j]) % 5 == 0) {
                answer[j] = "Buzz";
            } else {
                answer[j] = String.valueOf(j + 1);
            }
        }

        return new ArrayList<>(Arrays.asList(answer));
    }
}
