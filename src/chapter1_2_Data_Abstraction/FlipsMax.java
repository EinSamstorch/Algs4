package chapter1_2_Data_Abstraction;

import algs4.Counter;
import algs4.StdOut;
import algs4.StdRandom;

public class FlipsMax {
    
    private static Counter max(Counter x, Counter y) {
        if(x.tally() > y.tally()) {
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        int T = Integer.parseInt("100000");
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for(int t = 0; t < T; t++) {
            if(StdRandom.bernoulli(.5))
                heads.increment();
            else
                tails.increment();
        }
        
        if(heads.tally() == tails.tally())
            StdOut.println("Tie");
        else
            StdOut.println(max(heads, tails) + " wins");
    }

}
