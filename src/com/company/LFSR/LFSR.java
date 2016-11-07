package com.company.LFSR;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 11.10.2016.
 */
public class LFSR extends BitGenerator {
    private int length;
    private List<Integer> engagedElements;
    private LinkedList<Integer> state;
    private List<Integer> output;


    public LFSR(int length, int... order) {
        this.length = length;
        engagedElements = new ArrayList<>();
        state = new LinkedList<>();
        output = new ArrayList<>();

        setEngagedElements(order);
        setInitialStateRandomly();
    }


    private void setEngagedElements(int... order) {
        for (int orderNumber : order) {
            engagedElements.add(orderNumber);
        }
    }

    private void setInitialStateRandomly() {
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            state.add(random.nextInt(2));
        }
    }

    @Override
    public int generateRandomBit() {
        return makeShift();
    }

    public int makeShift() {
        generateNewBit();
        int outputBit = state.removeLast();
        output.add(outputBit);
        return outputBit;
    }

    private void generateNewBit() {
        int newValue = 0;
        for (int elementNumber : engagedElements) {
            newValue += state.get(length - 1 - elementNumber);
        }
        state.addFirst(newValue % 2);
    }

//    public int getLastOutputBit() {
//        return output.get(output.size() - 1);
//    }
}
