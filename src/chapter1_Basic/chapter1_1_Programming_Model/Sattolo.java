package chapter1_Basic.chapter1_1_Programming_Model;

import algs4.StdIn;
import algs4.StdOut;

/**
 * @author Ein
 */
public class Sattolo {
    
    private Sattolo() {}
    
    private static void cycle(Object[] a) {
        int n = a.length;
        for (int i = n; i > 1; i--) {
            int r = (int)(Math.random() * (i - 1));
            Object swap = a[r];
            a[r] = a[i - 1];
            a[i -1] = swap;
            


        }
    }
    
    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        
        Sattolo.cycle(a);
        for (String s : a) {
            StdOut.println(s);
        }
    }
}
