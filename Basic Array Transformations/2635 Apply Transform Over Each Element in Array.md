# 2635. Apply Transform Over Each Element in Array

Given an integer array arr and a mapping function fn, return a new array with a transformation applied to each element.

The returned array should be created such that returnedArray[i] = fn(arr[i], i).

Please solve it without the built-in Array.map method.

## Notes

fn(arr[i], i) will always return based on the function input by the user, for example, function plusone(n) { return n + 1; }, it's as if the user could "choose" their own model for a function, and through a for-loop, the function is applied to the entire array. The way this works is a bit weird and not very intuitive (at least imo), since users don't usually create functions, but it's still interesting.