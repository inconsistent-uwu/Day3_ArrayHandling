package com.ArrayHandling;

import java.util.*;

public class EvenIndexArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int x;
        while (n > 0) {
            n--;
            x = sc.nextInt();
            arr.add(x);

        }

        while (n < arr.size()) {
            if (n % 2 == 1) {
                arr2.add(arr.get(n));
            }
            n++;
        }
        System.out.println(arr2);

        sc.close();

    }

}
