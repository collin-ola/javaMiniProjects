package com.AppsByCollin.MiniProjects;

import java.util.Scanner;

public class MatrixDiff {
    public static void getDiffs() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum1 = 0, sum2 = 0, abs;
        int a[][] = new int[n][n];
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                a[i][j] = j;
//                a[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n ; i++) {
            sum1 += a[i][i];
            sum2 += a[i][n - i - 1];
        }
        System.out.println(Math.abs(sum1 - sum2));
    }
}
