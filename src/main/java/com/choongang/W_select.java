package com.choongang;

import java.util.HashMap;

public class W_select {
    public HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
        // TODO:
        HashMap<String, Integer> result = new HashMap<>();

        for (String str : arr){
            if(hashMap.containsKey(str)){
                Integer value = hashMap.get(str);
                result.put(str, value);
            }
        }
        return result;
    }
}
