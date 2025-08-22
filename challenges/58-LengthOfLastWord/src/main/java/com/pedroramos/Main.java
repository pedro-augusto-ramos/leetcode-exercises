package com.pedroramos;

class Solution {
    public int lengthOfLastWord(String s) {

        String formatted = s.trim();
        String[] strs = formatted.split(" ");
        String lastWord = strs[strs.length - 1];

        return lastWord.length();

    }
}