package com.snaping.stream;

import java.util.HashMap;

public class Test02 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("aaa", 111);
        hm.put("bbb", 222);
        hm.put("ccc", 333);
        hm.put("ddd", 444);
        hm.put("eee", 555);

        hm.keySet().stream().forEach(s -> System.out.println(hm.get(s)));
    }
}
