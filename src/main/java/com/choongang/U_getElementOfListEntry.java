package com.choongang;

import java.util.*;

public class U_getElementOfListEntry {
    public String getElementOfListEntry(HashMap<String, List<String>> hashMap, String key, int index) {
        // TODO:
        if (hashMap.containsKey(key)){
            List<String> list = hashMap.get(key);
            if (index >= 0 && index < list.size()){
                return list.get(index);
            }
        }
        return null;
    }
}
