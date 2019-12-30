package chapter2_Sorting.elementarysort;

import algs4.StdRandom;
import chapter2_Sorting.mergesort.Merge;
import chapter2_Sorting.priorityqueue.Quick;
import edu.princeton.cs.algs4.Heap;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * @author : Liqun_Wang
 * @date : 2019/12/13
 **/
public class SortCompare {

    public static double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();
        if ("Insertion".equals(alg)) {
            Insertion.sort(a);
        }
        if (("Selection".equals(alg))) {
            Selection.sort(a);
        }
        if (("Shell".equals(alg))) {
            Shell.sort(a);
        }
        if (("Merge".equals(alg))) {
            Merge.sort(a);
        }
        if (("Quick".equals(alg))) {
            Quick.sort(a);
        }
        if (("Heap".equals(alg))) {
            Heap.sort(a);
        }
        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];

        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static  void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];
        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);
        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);
        StdOut.printf("For %d random Doubles\n  %s is ", N, alg1);
        StdOut.printf("%.1f times faster than %s\n", t2/t1, alg2);

    }
}