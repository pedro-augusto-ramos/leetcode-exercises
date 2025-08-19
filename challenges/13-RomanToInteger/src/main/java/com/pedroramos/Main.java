package com.pedroramos;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int result = 0;

        Map<Character, Integer> mapa = new HashMap<>();
        mapa.put('I', 1);
        mapa.put('V', 5);
        mapa.put('X', 10);
        mapa.put('L', 50);
        mapa.put('C', 100);
        mapa.put('D', 500);
        mapa.put('M', 1000);

        if(s.length() < 2){
            result = mapa.get(s.charAt(0));
            return result;
        }

        for(int i = 0; i < s.length() - 1; i++){
            int atual = mapa.get(s.charAt(i));
            int proximo = mapa.get(s.charAt(i + 1));

            if(atual < proximo){
                result -= atual;
            } else {
                result += atual;
            }


        }

        result += mapa.get(s.charAt(s.length() - 1));
        return result;



    }
}
