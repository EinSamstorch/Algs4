package chapter1_2_Data_Abstraction;

import algs4.Counter;
import algs4.StdOut;
import algs4.StdRandom;

public class Rolls {

    public static void main(String[] args) {
        int T = Integer.parseInt("10000");
        int SIDES = 6;
        Counter[] rolls = new Counter[SIDES + 1];
        for(int i = 0; i <= SIDES; i++) {
            rolls[i] = new Counter(i + "'s");
        }
        for(int t = 0; t < T; t++) {
            int result = StdRandom.uniform(1, SIDES + 1);
            rolls[result].increment();
        }
        for(int i = 1; i <= SIDES; i++) {
            StdOut.println(rolls[i]);
        }

    }

}
