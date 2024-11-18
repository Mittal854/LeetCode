/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    let cache = new Map();
    let callCount = 0;

    return function(...args) {
        // For sum, we need to ensure that (a, b) and (b, a) are treated as different calls
        const key = JSON.stringify(args); // Serializing the arguments

        // If the result is already cached, return it
        if (cache.has(key)) {
            return cache.get(key);
        }

        // Otherwise, call the function and store the result in the cache
        callCount += 1;
        const result = fn(...args);
        cache.set(key, result);

        return result;
    };
}

/** 
 * let callCount = 0;
 * const memoizedSum = memoize(function (a, b) {
 *   return a + b;
 * });
 * console.log(memoizedSum(2, 3)); // 5
 * console.log(memoizedSum(2, 3)); // 5 (memoized, doesn't call again)
 * console.log(callCount); // 1 
 * 
 * const memoizedFib = memoize(function (n) {
 *   if (n <= 1) return n;
 *   return memoizedFib(n - 1) + memoizedFib(n - 2);
 * });
 * console.log(memoizedFib(5)); // 5 (computes and caches results)
 * console.log(memoizedFib(5)); // 5 (memoized, doesn't recompute)
 */



/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */