# THE EXERCISE
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4

Example 3:

Input: nums = [1]

Output: 1

## THE EXPLANATION

-> First, I instantiated the HashSet class, which doesn't allow duplicates

-> I iterated the array of integers, and checked if the element doesn't contain in the set, if true it will add on the set, if false it will remove the element that's already exists in the set

-> Finally, I transformed my set into an ArrayList, because the set doesn't have index.

-> I returned the first element of the list, fulfilling the exercise