# 2623. Memoize

Given a function fn, return a memoized version of that function.

A memoized function is a function that will never be called twice with the same inputs. Instead it will return a cached value.

You can assume there are 3 possible input functions: sum, fib, and factorial.

sum accepts two integers a and b and returns a + b. Assume that if a value has already been cached for the arguments (b, a) where a != b, it cannot be used for the arguments (a, b). For example, if the arguments are (3, 2) and (2, 3), two separate calls should be made.

fib accepts a single integer n and returns 1 if n <= 1 or fib(n - 1) + fib(n - 2) otherwise.

factorial accepts a single integer n and returns 1 if n <= 1 or factorial(n - 1) * n otherwise.

## Notes

The "memoization" concept is very interesting and it's one of the rare cases where I immediately understood not only how it works but also how to implement it, maybe thanks to my experience with python dictionaries. However, the whole concept of a function that returns another functions is still quite hard to wrap my head around. But I was quite happy with my solution to this problem.