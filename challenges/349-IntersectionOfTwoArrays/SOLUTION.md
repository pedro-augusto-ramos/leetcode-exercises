# THE EXERCISE 

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

# My explanation

First, I realized that this exercise is perfect for Set collection.

-> So, I transformed the two arrays given by arguments to a Set, then I fill my sets with the numbers in the array.

-> After, I created a third set with the elements on the first one, and used the operation of intersection between sets, retainAll(), that transformed my set.

-> Finally, I transformed back to an array, returning the expected answer.
