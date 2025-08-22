# THE EXERCISE
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.



Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 

## EXPLANATION

-> First, I used the trim() function to remove the blank spaces in the end and beginning of the String

-> Then, I transformed the string into a array of string with the pattern of a space

-> Finally, I grab it the last word in the array and returned the length of the word 