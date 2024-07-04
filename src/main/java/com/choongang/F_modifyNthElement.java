package com.choongang;

import java.util.ArrayList;

public class F_modifyNthElement {
    public ArrayList<String> modifyNthElement(ArrayList<String> arrayList, int index, String str) {
        // TODO:
        if (index > arrayList.size()){
            return null;
        }
        arrayList.set(index,str);

        return arrayList;


    }
}
