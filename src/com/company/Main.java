package com.company;

import java.util.Arrays;

public class Main<isSorted> {

    public static void main(String[] args) {
        double[] massive = {6, 4, -5, 7, -3, -9, 4, 2, -1 , 24, -12, 45, -67, -76, 8};
        boolean negative = false;
        double summa = 0;
        int call = 0;
        for (double element:massive) {
            if (element < 0) {
                negative = true;
            }
            if (negative == true && element > 0) {
                summa += element;
                call++;
            }
        }
        System.out.println(summa/call);
    }
    int [] mas = {-4, -2, 2, 3, 6, 8};

    boolean isSorted = false;
    int buf;
    while(!isSorted) {
        isSorted = true;
        for (int i = 0; i < mas.length-1; i++) {
            if (mas [i] > mas [i+1]){
                isSorted = false;

                buf = mas[i];
                mas[i] = mas[i+1];
                mas[i+1] = buf;
            }
        }
        System.out.println(Arrays.toString(mas));
        }
    }