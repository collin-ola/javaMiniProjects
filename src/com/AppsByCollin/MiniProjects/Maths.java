package com.AppsByCollin.MiniProjects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maths {
    static void lonelyInteger() {
        Map<Integer, Integer> hm = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        for(int i : a)
            if (hm.containsKey(i))
                hm.put(i, hm.get(i) + 1);
            else
                hm.put(i, 1);

        for(Map.Entry<Integer, Integer> entry : hm.entrySet())
            if(entry.getValue() == 1)
                System.out.println(entry.getKey());
    }

    public static void bitwiseAND() {
        Scanner in = new Scanner(System.in);
        long cases = in.nextLong(), first, result, second;

        while(in.hasNextLong()) {
            first = in.nextLong();
            second = in.nextLong();
            result = first;

            for(int i = (int)first + 1; i < (int)second - 1; i++)
                result &= i;

            System.out.println("Result: " + result);
        }
    }
}
