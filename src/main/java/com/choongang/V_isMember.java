package com.choongang;

import java.util.HashMap;
import java.util.Objects;

public class V_isMember {
    public boolean isMember(HashMap<String, String> member, String username, String password) {
        // TODO:
        if (member.containsKey(username)){
            String value = member.get(username);
            if (Objects.equals(value, password)){
                return true;
            }
        }
        return false;
    }
}
