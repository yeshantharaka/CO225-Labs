package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by yeshan on 7/18/2016.
 */

public class Array {
    int [] array;
    int j,k;
    public Array(){
        this.array=new int[0];
    }

    public Array(int n){
        this.array=new int[n];
    }


    void add(int d){
        int i = array.length;
        int[] temp = new int[i+1];
        for (j=0; j<i; j++){
            temp[j]=array[j];
        }
        temp[i]=d;
        array=temp;
        System.out.println(i);
    }

    void add(int index, int d){
        int i = array.length;
        int[] temp = new int[i+1];
        for (j=0; j<(index-1); j++){
            temp[j] = array[j];
        }
        temp[index-1] = d;
        for (k=index; k<=i; k++){
            temp[k] = array[k-1];
        }
        array = temp;
    }

    void replace(int index, int d){
        int i = array.length;
        int[] temp = new int[i+1];
        for (j=0; j<(index-1); j++){
            temp[j] = array[j];
        }
        temp[index-1] = d;
        for (k=index; k<i; k++){
            temp[k] = array[k];
        }
        array = temp;

    }

    int get(int index){
        int num = 0;
        for (j=0; j<index; j++){
            num = array[j];
        }
        return num;
    }

    void remove(int index){
        int i = array.length;
        int[] temp = new int[i-1];
        for (j=0; j<(index-1); j++){
            temp[j]=array[j];
        }
        for (k=index; k<i; k++){
            temp[k-1] = array[k];
        }
        array=temp;
    }

    boolean isEmpty(){
        int i = array.length;
        if (i==0){
            return true;
        } else {
            return false;
        }
    }

    int size(){
        return array.length;
    }

    boolean contains(int d){
        int i = array.length;
        int num=0;
        for (j=0; j<i; j++){
            if (array[j]==d){
                num=d;
            }
        }
        if (num==d){
            return true;
        } else {
            return false;
        }

    }

    void trimToSize(int size){
        int[] temp = new int[size];
        for (j=0; j<size; j++){
            temp[j] = array[j];
        }
        array=temp;
    }

    void clear(){
        int[] temp = new int[0];
        array=temp;
    }

//    public String toString(){
//        String s = "[";
//        int i = array.length;
//        for (j=0; j<i; j++){
//            s = s+ array[j]+", ";
//        }
//        s = s.substring(0,(2*i-2));
//        s = s+"]";
//        return s;
//    }

    @Override
    public String toString() {
        return  Arrays.toString(array) ;
    }
}
