/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function (functions) {

    // If the function is empty just return x
    if (functions.length === 0) {
        return function (x) {
            return x;
        }
    }

    // Applies function composition from right to left using reduceRight
    return functions.reduceRight(function (prevFn, nextFn) {
        return function (x) {
            return nextFn(prevFn(x));
        }
    })

};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */