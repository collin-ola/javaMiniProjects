package com.AppsByCollin.MiniProjects;

import java.util.Scanner;

public class Staircase {
    public static void draw() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = in.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int k = 0; k < (n-i); k++)
                System.out.print(" ");
            for(int j = 1; j <= i; j++)
                System.out.print("#");
            System.out.println();
        }
    }
}
