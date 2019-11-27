package chapter1_1_Programming_Model;

import algs4.StdOut;

public class Ex19 {
    
    private static final int M = 100;
    private static long[] arr = new long[M];
    
    private static long F(int N) {
        if(N == 0)
            arr[N] = 0;
        else if(N == 1)
            arr[N] = 1;
        else
            arr[N] = arr[N - 1] + arr[N - 2];
        return arr[N];
    }

    private static long F2(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F2(N - 1) + F2(N - 2);
    }
    
    public static void main(String[] args) {
        for(int N = 0; N < M; N++)
            StdOut.println(N + " " + F(N));
    }

}
