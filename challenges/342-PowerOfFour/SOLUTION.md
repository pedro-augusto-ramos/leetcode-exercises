# The exercise 
Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.



Example 1:

Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false
Example 3:

Input: n = 1
Output: true
 
# The explaning

-> First, I remember that the opposite of power is log

-> From that, I thought that doesn't exist results from of the power of four who are odd or 0, and all powers raised to 0 are 1.

-> After I check, I calculate the log of integer n divided per log of 4.

-> Then, I returned a boolean answer, comparing if value of the result in the past account is equal to the value rounded with Math.floor()  