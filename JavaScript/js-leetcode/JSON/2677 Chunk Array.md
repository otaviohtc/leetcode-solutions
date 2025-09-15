# 2677. Chunk Array

Given an array arr and a chunk size size, return a chunked array.

A chunked array contains the original elements in arr, but consists of subarrays each of length size. The length of the last subarray may be less than size if arr.length is not evenly divisible by size.

Please solve it without using lodash's _.chunk function.

## Notes

Thank god this whole JSON chapter is (apparently) easier than the "Promises and Time" one.
This problem was easy to understand; once I searched for how to use arr.slice(), everything just clicked and I knew how I should approach the problem.