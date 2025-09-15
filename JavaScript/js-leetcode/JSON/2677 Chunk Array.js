/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function (arr, size) {
    const chunckedArray = []
    for (let i = 0; i < arr.length; i += size) {
        chunckedArray.push(arr.slice(i, i + size))
    }
    return chunckedArray;
};
