package com.ArrayHandling;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();
        List<Integer> rev = new ArrayList<>();

        System.out.println("Enter the size of array");

        int n = sc.nextInt();

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            arr.add(input);
        }
        for (int i = n - 1; i >= 0; i--) {
            int input = arr.get(i);
            rev.add(input);
        }
        System.out.println("Reverse of the array: \n" + rev);
        sc.close();

    }
}