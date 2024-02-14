package com.ArrayHandling;

import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> dup = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) == arr.get(j)) {
                    dup.add(arr.get(i));
                    break;
                }
            }

        }
        System.out.println("Duplicate elements are: " + dup);

        sc.close();
    }

}
