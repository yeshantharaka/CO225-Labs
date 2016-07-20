package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Array arr = new Array(5);
        arr.add(5);
        System.out.println(arr.toString());
        System.out.println(arr.size());
        System.out.println(arr.isEmpty());
        arr.remove(3);
        System.out.println(arr.toString());
        System.out.println(arr.get(5));
        System.out.println(arr.contains(5));
        arr.trimToSize(3);
        System.out.println(arr.toString());
        arr.add(4);
        arr.clear();
        System.out.println(arr.toString());
    }
}
