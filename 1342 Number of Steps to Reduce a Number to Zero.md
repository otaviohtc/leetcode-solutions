# 1342. Number of Steps to Reduce a Number to Zero

Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

## Notes

There is a more elegant way of doing the if-else stetament which is:
```
            num = num % 2 == 0 ? num / 2 : num - 1;
            count++;
```
Basically "if number is divisible by 2" do "number divided by 2" else do "number minus 1"
Is the same thing but shortened to just one line, personally I think it's not very readable... but it's probably more efficient 