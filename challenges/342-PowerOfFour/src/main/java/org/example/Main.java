package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 0) return false;
        if(n == 1) return true;
        if(n % 2 != 0) return false;

        double v = Math.log(n) / Math.log(4);

        return v == Math.floor(v);
    }
}
