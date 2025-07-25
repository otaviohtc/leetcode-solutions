# 412. Fizz Buzz

Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.

## Notes

There is a bunch of wrong things and bad implementations (transforming into string, back to int, back to string, for example), but it works, the things to refine are:
Instead of a fixed list "String[]", using an ArrayList from the get-go is better, also because it allows me to use .add instead of iterating manually for each index and changing the value manually.
Also, 2 loops, REALLY?
This is the optimized solution instead:

```
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }
}
```