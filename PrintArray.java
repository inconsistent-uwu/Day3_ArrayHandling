package com.ArrayHandling;

import java.util.*;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] arr = new Integer[5];
        System.out.println("Enter array values for size:5");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Values in array: ");
        for (Integer e : arr) {
            System.out.println(e);

        }
        sc.close();

    }

}
