package com.choongang;

import java.util.ArrayList;

public class E_addNth {
    public ArrayList<Integer> addNth(ArrayList<Integer> arrayList, int index, int element) {
        // TODO:
        if (index>arrayList.size()){
            return null;
        }
        arrayList.add(index,element);
        return arrayList;
    }
}
