# 2666. Allow One Function Call

Given a function fn, return a new function that is identical to the original function except that it ensures fn is called at most once.

The first time the returned function is called, it should return the same result as fn.
Every subsequent time it is called, it should return undefined.

## Notes

Is very simple, just create a flag variable that will change once the function is called.
Honestly had more trouble trying to figure out "fn(...args)" because I dread its existence. 