# 2629. Function Composition

Given an array of functions [f1, f2, f3, ..., fn], return a new function fn that is the function composition of the array of functions.

The function composition of [f(x), g(x), h(x)] is fn(x) = f(g(h(x))).

The function composition of an empty list of functions is the identity function f(x) = x.

You may assume each function in the array accepts one integer as input and returns one integer as output.

## Notes

I don't really understand the reduceRight function yet, and this composition concept is really hard to get my head around 
This solution is the only one that I understand just a little bit, but I don't think I could reach it myself yet