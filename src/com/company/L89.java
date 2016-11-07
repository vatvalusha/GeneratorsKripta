package com.company;

import util.BitConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 17.09.2016.
 */
public class L89 implements Generator {
    private int state[];
    private List<Integer> output = new ArrayList<>();

    public L89(){
        state = new int[89];
        Random random = new Random();
        for(int i = 0; i < 20; i++){
            state[i] = random.nextInt(2);
        }
    }
    public void generatorL20(int m){
        for (int i = 0; i<m;i++){
            getNext();
        }
    }
    public int getNext(){
        int temp = state[51] + state[0];
        temp = temp%2;
        for(int i = 0; i < 88; i++){
            state[i] = state[i+1];
        }
        state[88] = temp;
        output.add(state[88]);
        return state[88];
    }
    public List<Integer> getBitArray(){
        return output;
    }
    public List<Integer> getBytesOutput() {
        getBitArray();
        return BitConverter.getBytesOutput(output);
    }


    @Override
    public List<Integer> generatorB(int m) {
        generatorL20(m*8);
        return getBytesOutput();
    }
    public String toString(){
        return Arrays.toString(state);
    }
}
