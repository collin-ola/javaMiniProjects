package com.AppsByCollin.MiniProjects;

import java.util.Random;

public class MiniMaxi {
    public static void getResults(){

        Random rand = new Random();
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = rand.nextInt(500);
        }
        int min = 0, max = 0;

        for (int i = 0; i < arr.length - 1 ; i++) {
            min += arr[i];
        }
        for (int i = 1; i < arr.length ; i++) {
            max += arr[i];
        }

        System.out.println(min + " " + max);
    }

    private static int[] sort(int[] intArr) {
        int temp;
        Boolean swap = false;

        for(int i =0; i < intArr.length - 1; i++) {
            if(intArr[i] > intArr[i+1]) {
                temp = intArr[i];
                intArr[i] =  intArr[i+1];
                intArr[i+1] = temp;
                swap = true;
            }
        }

        if (swap)
            return sort(intArr);

        return intArr;
    }
}
