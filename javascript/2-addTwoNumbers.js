// You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order and each of their nodes contain a single digit.
// Add the two numbers and return it as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */

// input 1
var list1 = [2,4,3];
var list2 = [5,6,4];


var addTwoNumbers = function(l1, l2) {
    l1 = l1.reverse();
    l2 = l2.reverse();



    console.log(l1.map((item, i) => {
        let num;

        if (item + l2[i] >= 10) {
            num = (item + l2[i]) % 10
        }

        return num;


    }))

};

addTwoNumbers(list1, list2);