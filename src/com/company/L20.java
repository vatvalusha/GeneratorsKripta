package com.company;

import util.BitConverter;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 12.09.2016.
 */
public class L20 implements Generator {

    private int state[];
    private List<Integer> output = new ArrayList<>();

    public L20() {
        state = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            state[i] = random.nextInt(2);
        }
    }

    public void generatorL20(int m) {
        for (int i = 0; i < m; i++) {
            getNext();
        }
    }

    public int getNext() {
        int temp = state[16] + state[14] + state[10] + state[0];
        temp = temp % 2;
        for (int i = 0; i < 19; i++) {
            state[i] = state[i + 1];
        }
        state[19] = temp;
        output.add(state[19]);
        return state[19];
    }

    public List<Integer> getBitArray() {
        return output;
    }

    public List<Integer> getBytesOutput() {
        getBitArray();
        return BitConverter.getBytesOutput(output);
    }

    public List ppp() {
        List list = new ArrayList<>();
        for(
        int i = 0;
        i<1000;i++)

        {
    //            map.put(i,0);
            list.add(i, 0);
        }
        return list;
//    System.out.println(list);
}
    @Override
    public List<Integer> generatorB(int m) {
//        generatorL20(m*8);
//        return getBytesOutput();
        return ppp();
    }

    public String toString(){
        return Arrays.toString(state);
    }
}

