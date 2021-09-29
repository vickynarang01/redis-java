package com.test.micro.stubs;

import java.util.HashMap;
import java.util.Map;

public class Tester2 {
    public static void main(String[] args) {
        String a= "abcabcaa";
        Map mp = new HashMap<Integer, String>();
        for (int i=0;i<a.length();i++){
            if(mp.containsKey(a.charAt(i)));
            System.out.println(a.charAt(i));
        }


    }
}
