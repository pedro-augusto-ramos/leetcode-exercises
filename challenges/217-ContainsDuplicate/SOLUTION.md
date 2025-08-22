# THE EXERCISE
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true
## The Explanation 

-> First, I used the set collection, which doesn't allow duplicates, and the famous HashSet implementation

-> I iterated over the array, and checked if the number not contains in the set, if true the element is added in the set, if false return true, because the element is a duplicate.

-> If the loop ended, the function may return false, because all the numbers in the array are different
