package com.pedroramos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Solution {
    public int singleNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            } else{
                set.remove(nums[i]);
            }
        }

        List<Integer> list = new ArrayList<>(set);
        return list.getFirst();

    }
}