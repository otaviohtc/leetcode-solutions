# 2619. Array Prototype Last

Write code that enhances all arrays such that you can call the array.last() method on any array and it will return the last element. If there are no elements in the array, it should return -1.

You may assume the array is the output of JSON.parse.
 
## Notes

Another easy one. Apparently, there were prettier ways to solve this, but this works, so it's fine.
Basically, using "this" to access the value of the parsed array.