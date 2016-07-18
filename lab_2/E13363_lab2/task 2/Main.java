package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the color  : ");
        Scanner colour= new Scanner(System.in);
        int num1=colour.nextInt();
        int num2=colour.nextInt();
        int num3=colour.nextInt();
        System.out.println("The complement  : " + color(num1) + " " + color(num2) + " " + color(num3));

    }

    private static int color(int a){
        int b=255-a;
        if (Math.abs(b-a)<=32) {
            if (a>=128) {
                return a - 128;
            } else {
                return a + 128;
            }
        } else {
            return b;
        }



    }

    }


