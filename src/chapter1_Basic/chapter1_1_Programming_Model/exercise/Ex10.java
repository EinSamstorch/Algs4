package chapter1_Basic.chapter1_1_Programming_Model.exercise;

import algs4.StdOut;

public class Ex10 {

    public static void main(String[] args) {
        
        int[] a = new int[10];
        for(int i = 0; i < 10; i++)
            a[i] = i*i;
        for(int i = 9; i >= 0; i--)
            StdOut.printf("%d ", a[i]);
    }

}
