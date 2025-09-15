/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function (n) {

    let calls = 0;

    return function () {

        if (calls == 0) {
            calls++;
            return n;
        } else {
            n++;
            return n;
        }
    };
};



/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */