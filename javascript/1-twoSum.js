/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

var nums = [2, 7, 11, 15];
var target = 9;

var nums = [3, 3];
var target = 6;

var twoSum = function(nums, target) {
    let result = [0, 0];

    nums.find((num, i, arr) => {
        var num1 = arr.indexOf(num);
        var num2 = arr.indexOf(target - num, i + 1);
        if (num2 > - 1) {
            return result = [num1, num2];
        }
    });
    return result;
};

twoSum(nums, target);

// Runtime: 216 ms, faster than 7.76% of JavaScript online submissions for Two Sum.
// Memory Usage: 34.2 MB, less than 93.80% of JavaScript online submissions for Two Sum.