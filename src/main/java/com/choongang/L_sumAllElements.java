package com.choongang;

import java.util.ArrayList;
import java.util.Iterator;

public class L_sumAllElements {
    public int sumAllElements(ArrayList<Integer> arrayList) {
        // TODO:
        Iterator<Integer> iterator = arrayList.iterator();
        int i = 0;
        if (arrayList.isEmpty()){
            return 0;
        }
        while (iterator.hasNext()){
            i += iterator.next();
        }
        return i;

    }
}
