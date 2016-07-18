package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number  :- ");
        Scanner s=new Scanner(System.in);
        int num = s.nextInt();
        int sp=num%15;
        if (sp==0 && scary(num)==0){
            System.out.println( num + " is special not scary");
        } else if (sp==0 && big(num)==1 && weird(num)==0){
            System.out.println( num + " is special,big and scary but not weird");
        } else if (sp==0 && weird(num)==1 && big(num)==0){
            System.out.println(num + " is special,weird and scary but not big");
        } else if (sp==0 && weird(num)==0 && big(num)==0){
            System.out.println(num + " is special but not big or weird");
        }  else if (sp!=0 && big(num)==1 && weird(num)==0){
            System.out.println( num + " is big and scary but not weird or special");
        } else if (sp!=0 && weird(num)==1 && big(num)==0){
            System.out.println(num + " is weird and scary but not big or special");
        } else if (sp!=0 && weird(num)==0 && big(num)==0){
            System.out.println(num + " is not big or weird or special or scary");
        } else if (sp!=0 && weird(num)==1 && big(num)==1){
            System.out.println(num + " is big,weird and scary but not special");
        }

    }


    private static int weird(int a){
        if ((a%5==0) && (a%6==0) && (a%18!=0)){
            return 1;
        } else {
            return 0;
        }
    }

    private static int big(int a){
        if (a>999){
            return 1;
        } else {
            return 0;
        }
    }

    private static int scary(int a){
        if (weird(a)==1 || big(a)==1){
            return 1;
        } else {
            return 0;
        }
    }

}
