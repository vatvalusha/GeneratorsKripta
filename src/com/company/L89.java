package com.company;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by user on 17.09.2016.
 */
public class L89 {
    private int state[];

    public L89(){
        state = new int[89];
        Random random = new Random();
        for(int i = 0; i < 20; i++){
            state[i] = random.nextInt(2);
        }
    }

    public int getNext(){
        int temp = state[51] + state[0];
        temp = temp%2;
        for(int i = 0; i < 88; i++){
            state[i] = state[i+1];
        }
        state[88] = temp;
        return state[88];
    }

    public String toString(){
        return Arrays.toString(state);
    }
}
