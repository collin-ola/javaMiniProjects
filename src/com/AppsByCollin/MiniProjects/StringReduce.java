package com.AppsByCollin.MiniProjects;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StringReduce {
    static void super_reduced_string(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string to reduce: ");
        String str = in.next();

        Map<Integer, Character> hm = new HashMap<>();
        char[] chars = str.toCharArray();
        int i = 0;

        for(char c : chars)
            hm.put(i++, c);

        String result = reduce(hm);

        System.out.println(result.length() == 0 ? "Empty String" : result);
    }

    private static String reduce(Map<Integer, Character> hm) {
        boolean modified = false;

        for(int i = 0; i < hm.size() - 1; i++) {
            if (hm.get(i) == hm.get(i + 1)) {
                hm.remove(i);
                hm.remove(i + 1);
                modified = true;
            }
        }

        if(modified) {
            Collection<Character> characters = hm.values();
            //hm.clear();
            Map<Integer, Character> hm2 = new HashMap<>();
            int i = 0;
            for(char c : characters)
                hm2.put(i++, c);
            return reduce(hm2);
        }

        return hm.values()
                .stream()
                .map(Object::toString)
                .reduce("",String::concat);
//        return hm.values()
//                .stream().map(Object::toString)
//                .collect(Collectors.joining(""));
    }
}
