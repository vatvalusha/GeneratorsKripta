package com.company;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by user on 12.09.2016.
 */
public class L20 {
//    int[] a = {0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1};
//    int trials = 1000;    // number of steps
//    int n = a.length;                          // length of register
//    int TAP = 8;                               // tap position
//
//
//    // Simulate operation of shift register.
//    public void getRandom() {
//        for (int t = 0; t < trials; t++) {
//
//            // Simulate one shift-register step.
//            int next = (a[n - 1] ^ a[TAP]);  // Compute next bit.
//            for (int i = n - 1; i > 0; i--)
//                a[i] = a[i - 1];                  // Shift one position.
//            a[0] = next;                       // Put next bit on right end.
//
//            if (next == 1) System.out.print("1");
//            else System.out.print("0");
//            System.out.print(" ");
//        }
//        System.out.println();
//    }
private int state[];

    public L20(){
        state = new int[20];
        Random random = new Random();
        for(int i = 0; i < 20; i++){
            state[i] = random.nextInt(2);
        }
    }
    public int getNext(){
        int temp = state[16] + state[14] + state[10] + state[0];
        temp = temp%2;
        for(int i = 0; i < 19; i++){
            state[i] = state[i+1];
        }
        state[19] = temp;
        return state[19];
    }
    public String toString(){
        return Arrays.toString(state);
    }
}

