package com.choongang;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class R_addEvenValues {
    public int addEvenValues(HashMap<Character, Integer> hashMap) {
        // TODO:
        int sum = 0;
        Set<Map.Entry<Character, Integer>> entrySet = hashMap.entrySet();

        // entrySet을 순회하면서 value를 읽어옵니다.
        Iterator<Map.Entry<Character, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Character, Integer> entry = entryIterator.next();
            Integer value = entry.getValue();
            if (value % 2 == 0) {
                sum += value;
            }
        }
        return sum;
    }
}

