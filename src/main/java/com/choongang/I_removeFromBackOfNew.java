package com.choongang;

import java.util.ArrayList;

public class I_removeFromBackOfNew {
    public ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        // TODO:
        if (arrayList.isEmpty()){
            return null;
        }
        ArrayList<Integer> arrayList1 = new ArrayList<>(arrayList);
        arrayList1.remove(arrayList1.size()-1);

        return arrayList1;
    }
}
