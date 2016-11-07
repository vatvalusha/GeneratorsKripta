package com.company.LFSR;

import com.company.Generator;

import java.util.List;

/**
 * Created by user on 11.10.2016.
 */
public class L89New extends LFSR implements Generator{

    public L89New() {
        super(89, 51, 0);
    }

    @Override
    public List<Integer> generatorB(int m) {
        generateRandomNumbers(m);
        return getGeneratedRandomNumbers();
    }
}
