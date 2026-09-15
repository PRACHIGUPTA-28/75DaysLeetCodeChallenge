/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    var value = init ;
    for(var i=0; i<nums.length; i++){
        value = fn(value, nums[i]) ;
    }
    return value ;
};