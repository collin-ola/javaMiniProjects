package com.AppsByCollin.MiniProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fib {
    public static void runFibs(){
        Scanner in = new Scanner(System.in);

        //No recursion
        System.out.print("Enter sequence length: ");
        List<Long> numList = getFibonacciSequenceIteratively(in.nextLong());
        for(long i: numList)
            System.out.print(i + " ");


        //Recursion
        System.out.print("\nEnter sequence length: ");
        getFibonacciSequenceRecursively(in.nextLong(), 0, 1);

    }

    private static List<Long> getFibonacciSequenceIteratively(long length) {
        List<Long> nums = new ArrayList<>();
        final long firstNum = 0;
        final long secondNum = 1;

        nums.add(firstNum);
        nums.add(secondNum);

        for (int i = 0; i < length; i++)
            nums.add(nums.get(i + 1) + nums.get(i));

        return nums;
    }

    private static void getFibonacciSequenceRecursively(long len, long first, long second){
        long next;
        next = first + second;
        if(first == 0) {
            System.out.print(first);
            System.out.print(" " + second + " ");
        }
        System.out.print(next + " ");
        len--;

        if(len > 0)
            getFibonacciSequenceRecursively(len, second, next);
    }
}
