package chapter1_Basic.chapter1_1_Programming_Model.exercise;

import java.util.Random;

/**
 * @author : Liqun_Wang
 * @date : 2019/12/09
 **/
public class True {
    public static void main(String[] args) {
        MyThread[] m = new MyThread[100];
        for (MyThread myThread : m) {
            myThread = new MyThread();
            myThread.start();
        }
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        while(true) {
            int i = new Random().nextInt();
            i += 1;
            System.out.println(i);
        }
    }
}
