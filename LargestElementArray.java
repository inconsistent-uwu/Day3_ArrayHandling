package com.ArrayHandling;

import java.util.*;

public class LargestElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        while (n > 0) {
            int x = sc.nextInt();
            arr.add(x);
            n--;
        }
        int max = arr.get(0);

        for (Integer e : arr) {
            if (max < e)
                max = e;
        }

        System.out.println("Largest number is " + max);
        sc.close();

    }
}
