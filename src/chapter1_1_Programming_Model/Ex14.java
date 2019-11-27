package chapter1_1_Programming_Model;

import algs4.StdOut;

public class Ex14 {

    public static void main(String[] args) {
        
        StdOut.print(lg(8));

    }
    
    private static int lg(int N) {
        
        int i = 0;
        while(n2(i) <= N)
            i++;
        return i-1;
    }
    
    private static int n2(int n) {
        int result = 1;
        for(int i = 0; i < n; i++)
            result *= 2;
        return result;
    }

}
