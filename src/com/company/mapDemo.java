package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mandeep");
        map.putIfAbsent(1,"Sukhdeep");
        map.put(2, "Ekam");
        Set<Integer> integers = map.keySet();
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        String x = map.get(55);
        if(x.equals("hyujfhy")){}
        System.out.println(x);
        String s2 = map.getOrDefault(22, "not found");
        if(s2.equals("hjkkh")){}
        System.out.println(map);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey());


        }


    }
}
