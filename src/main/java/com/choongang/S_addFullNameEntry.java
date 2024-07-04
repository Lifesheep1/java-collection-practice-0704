package com.choongang;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class S_addFullNameEntry {
    public HashMap<String, String> addFullNameEntry(HashMap<String, String> hashMap) {
        // TODO:
        hashMap.put("fullName", hashMap.get("firstName") + hashMap.get("lastName"));
        return hashMap;
    }
}
