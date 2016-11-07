package com.company.LFSR;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11.10.2016.
 */
public abstract class Gen {
    private List<Integer> generatedRandomNumbers = new ArrayList<>();

    public List<Integer> getGeneratedRandomNumbers() {
        return generatedRandomNumbers;
    }

    public void setGeneratedRandomNumbers(List<Integer> generatedRandomNumbers) {
        this.generatedRandomNumbers = generatedRandomNumbers;
    }

    public abstract int generateRandomNumber();


    public void generateRandomNumbers(int quantity) {
        generatedRandomNumbers = new ArrayList<>(quantity);
        for (int i = 0; i < quantity; i++) {
            addToGeneratedRandomNumbers(generateRandomNumber());
        }
    }

    public void addToGeneratedRandomNumbers(Integer randomNumber) {
        generatedRandomNumbers.add(randomNumber);
    }
}
