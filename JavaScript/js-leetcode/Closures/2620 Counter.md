# 2620. Counter

Given an integer n, return a counter function. This counter function initially returns n and then returns 1 more than the previous value every subsequent time it is called (n, n + 1, n + 2, etc).

## Notes

For "closure" reasons (whatever that means) the let calls = 0; isn't run everytime counter() is executed, just when counter is created, therefore it works.
It could be easilier resolved if just n++; to increment and then return n-1; so that the variable would be changed but the output wouldn't. Still, weird.
